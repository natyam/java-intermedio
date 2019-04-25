package edu.utn.intermedio.modelo;

public class Recurso implements Identificable {

	
	public String etiqueta;

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	@Override
	public String identification() {
		// TODO Auto-generated method stub
		return "recurso: " + this.etiqueta;
	}
	//identificacion d identificable no de persona
	
	
	
}
