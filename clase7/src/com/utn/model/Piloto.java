package com.utn.model;

public class Piloto {
	

	
		private String licencia;
		private String nombre;
		public String getLicencia() {
			return licencia;
		}
		public void setLicencia(String licencia) {
			this.licencia = licencia;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void manejarEstado()
		{
			System.out.println("esta del tomate!");
		}


}
