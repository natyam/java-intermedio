package com.utn.dao;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import com.mysql.jdbc.Connection;

import com.mysql.jdbc.Statement;
	import com.utn.modelo.Auto;

	public class ConnectionMySQL {

		private Connection getConnection() {

			try {

				Class.forName("com.mysql.jdbc.Driver");

				Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
				//Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java?useLegacyDatetimeCode=false&serverTimezone=UTC", "natalia", "naty1234");

				return conn;

			} catch (Exception e) {
				System.out.println("no se ingreso a la base de datos");
				return null;
			}
		}

		public void getAutos() {

			try {
				Statement st = (Statement) getConnection().createStatement();
				ResultSet rs = st.executeQuery("select * from auto");
				while (rs.next()) {
					System.out.println("VEHICULO N " + rs.getInt("id"));
					System.out.println(rs.getString("marca"));
					System.out.println(rs.getString("modelo"));
					System.out.println(rs.getString("color"));
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Rompio");
			}
		}

		public boolean insertAuto(String marca, String modelo, String color) {
			try {
				Statement st = (Statement) getConnection().createStatement();

				String query = "insert into auto (marca,modelo,color) " + "values('" + marca + "','" + modelo + "','"
						+ color + "')";

				return st.execute(query);

			} catch (Exception e) {

				System.out.println(e.getMessage());
				return false;
			}
		}

		public boolean updateAuto(String color, int id) {
			try {
				Statement st = (Statement) getConnection().createStatement();
				String query = "update auto set color = '" + color + "' where id=" + id;
				
				return !st.execute(query);
					
			} catch (Exception e) {
				
				return true;
			}
		}
		
		public boolean deleteAutoById(int id) {
			try {
				Statement st = (Statement) getConnection().createStatement();
				
				String query = "delete from auto where id="+id;
				
				return !st.execute(query);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return true;
			}
		}

		public List<Auto> getListOfAutos() {

			try {
				Statement st = (Statement) getConnection().createStatement();
				List<Auto> lista = new ArrayList<Auto>();
				ResultSet rs = st.executeQuery("select * from auto");
				while (rs.next()) {
					lista.add(new Auto(rs.getString("marca"),rs.getString("modelo"),rs.getString("color")));
				}

				return lista;
			} catch (Exception e) {
				return null;
			} finally {

			}
		}
		
		
		
		
		public boolean agregarAuto(String marca, String modelo, String color)
		{
			try {
				
				String insertQuery="insert into auto(marca,modelo,color) values(?,?,?)";
				PreparedStatement ps= getConnection().prepareStatement(insertQuery);
				ps.setString(1, marca);
				ps.setString(2, modelo);
				ps.setString(3, color);
				
				return ps.execute();
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
		}
}
