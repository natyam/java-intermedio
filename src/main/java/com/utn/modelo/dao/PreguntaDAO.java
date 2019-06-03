package com.utn.modelo.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.utn.modelo.Pregunta;


public class PreguntaDAO {

	private static final boolean NULL = false;
	Connection conn;
	private static PreguntaDAO preguntaObj = null;

	// singleton
	//cuando no existe el obj lo vamos a crear
	
	
	private PreguntaDAO() {
	//se crea la conexion la sengunda vez
		try {
			Class.forName("com.mysql.jdbc.Driver");

			this.conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/utn", "root", "");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static PreguntaDAO createInstance() {

		//sino existe el pregntaObj(la primer vez) se crea el objeto (la conexion)
		if (preguntaObj == null) {
			preguntaObj = new PreguntaDAO();
			
		}
		
		return preguntaObj;
	}

	public void guardoPregunta(Pregunta pregunta) {
		//guarda el objeto pregunta en la base de datos
		try {

			String sql = "insert into pregunta (pregunta,respuesta) values (?,?)";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, pregunta.getPregunta());
			ps.setString(2, pregunta.getRespuesta());

			ps.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	
	//obtener respuesta de la base de datos
	public  String getRespuesta(int id) {
		String respuesta;
		try {
			
			//String sql = "SELECT pregunta FROM pregunta where id="+id;
			Statement st=(Statement)conn.createStatement();
			ResultSet rs= st.executeQuery("select * from pregunta");
			for(int t=1;rs.next()!=NULL&&t<id;t++)
			{
			}
		respuesta= (String)rs.getString("respuesta");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//respuesta="No puedo traer la respuesta";
			if(e.getMessage()=="404")
			{
				respuesta="no se encontro esa respuesta en la DB";
			}
			else
			{
				respuesta=e.getMessage();
			}
			
		}
		
		
		return respuesta;
	}
	
	
	//update pregunta
	public  String updatePregunta(Pregunta pregunta) {
		
		String mensaje;
		
		try {
				guardoPregunta(pregunta);
			
				mensaje= "update realizada";
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				mensaje= "update fallo";
			}
			return mensaje;
	}
	
	//borrar pregunta

public  String deletePregunta(int id){
	
		
		String mensaje;
		
		try {
				
			String sql = "delete from pregunta where id= ? ";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			
			mensaje= "delete realizado";
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				mensaje= "delete fallo";
			}
			return mensaje;
	}

public String putPregunta(int id, String respuesta)
{
	String respuest="Se actualizo la pregunta con exito";
	try{
		String sql = "update pregunta set respuesta='"+respuesta+"' where  id=?";
	PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
	ps.setInt(1, id);

	ps.execute();
	
	
	} catch (Exception e) {
	System.out.println(e.getMessage());
	respuest=e.getMessage();
	}
	return respuest;
	
}
public String compararRespuesta(int id,String respuesta){
	String respuest;
	try {
		
		//String sql = "SELECT pregunta FROM pregunta where id="+id;
		Statement st=(Statement)conn.createStatement();
		ResultSet rs= st.executeQuery("select * from pregunta");
		for(int t=1;rs.next()!=NULL&&t<id;t++)
		{
		}
		System.out.println(rs.getString("respuesta"));
	if((String)rs.getString("respuesta")==respuesta)
	{
		respuest="es correcto!!!";
		
	}
	else
	{
		respuest="La respuesta es incorrecta. la respuesta correcta era: "+rs.getString("respuesta");
	}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		//respuesta="No puedo traer la respuesta";
		if(e.getMessage()=="404")
		{
			respuest="no se encontro esa respuesta en la DB";
		}
		else
		{
			respuest=e.getMessage();
		}
		
	}
	return respuest;
	
	
}


}