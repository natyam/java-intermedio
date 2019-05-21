package ar.edu.java.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexionDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		
		//quiero saver si tengo un driver
		try {
			//busca dentro del entonrno de ejecucion del proyecyo esa clase en particular
			//es un metodo etatito q hace una busqueda dentro del
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("error al recuperar el driver");
			//metodo de las excepciones q muestra toda la pila de ejecucion q desencadena la excepcion
			e.printStackTrace();
			return;
		}
		System.out.println("correcto");
		
		Connection connection= null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java?useLegacyDatetimeCode=false&serverTimezone=UTC", "natalia", "naty1234");
			//useLegacyDatetimeCode=false&serverTimezone=UTC CONDICIONES CON LAS Q ME VOY A CONECTAR
			//FUERZO EL LEGAYDATETIMECODE PARA Q USE UNA ZONA DE TIEMPO DIFERENTE
			
		} catch (SQLException e) {
			System.out.println("Fallo en la conexion! mirar la consola con el resultado!");	
			e.printStackTrace();
			return;
			}
		

	}

}
