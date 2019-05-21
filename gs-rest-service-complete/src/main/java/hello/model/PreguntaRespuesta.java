package hello.model;

import hello.dao.PreguntadosDAO;
import hello.dao.PreguntasMemoryDAO;

public class PreguntaRespuesta {

	private Integer id;
	private String pregunta;
	private String Respuesta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPregunta() {
		PreguntadosDAO dao= new PreguntasMemoryDAO();
		PreguntaRespuesta pr= dao.getPreguntaRespuesta(id);
	
		return pr.getPregunta();
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	
	
}
