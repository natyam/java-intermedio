package com.utn.controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mysql.jdbc.PreparedStatement;
import com.utn.modelo.Pregunta;
import com.utn.modelo.dao.PreguntaDAO;

@RestController
public class PreguntasControler {

	List<Pregunta> preguntas = new ArrayList<Pregunta>();



	@GetMapping(value = "/obtenerPreguntas")
	public String getAllPreguntas() {

		Gson respuestas = new Gson();
		cargarPreguntas();
		return respuestas.toJson(preguntas).toString();
	}

	@GetMapping(value = "/obtenerPregunta/{id}")
	public String getPreguntaById(@PathVariable("id") int id) {
		Gson gson = new Gson();

		// aca retormanos mediante el id la pregunta ... ( de la lista)
		return gson.toJson(preguntas.get(id));
	}
	
	
	@GetMapping(value = "/obtenerRespuesta/{id}")
	public String getRespuestaById(@PathVariable("id") int id)
	{
		PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
		return pdaoDao.getRespuesta(id);
	}
	
	
	@GetMapping(value = "/subirPregunta/{pregunta}/{respuesta}")
	public String postRespuestaById(@PathVariable("pregunta") String pregunta, @PathVariable("respuesta") String respuesta)
	{
		PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
		Pregunta preg=new Pregunta(1, pregunta,respuesta);
		return pdaoDao.updatePregunta(preg);
		
	}
	
	@GetMapping(value = "/borrarPreguntaById/{id}")
	public String deletePreguntaById(@PathVariable("id") int id)
	{
		PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
		return pdaoDao.deletePregunta(id);
	}
	
	
	
	@GetMapping(value = "/cambioRespuestaById/{id}/{respuesta}")
	public String deletePreguntaById(@PathVariable("id") int id, @PathVariable("respuesta") String respuesta)
	{
		PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
		return pdaoDao.putPregunta(id,respuesta);
	}
	
	
	@GetMapping(value = "/comparoRespuestaById/{id}/{respuesta}")
	public String compararPreguntaById(@PathVariable("id") int id, @PathVariable("respuesta") String respuesta)
	{
		PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
		return pdaoDao.compararRespuesta(id,respuesta);
	}
	
	
	
	
	private void cargarPreguntas() {

		try {
			File file = new File("Preguntas_Guido.txt");
			PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
			BufferedReader br = new BufferedReader(new FileReader(file));

			int id=0;
			String st;
			while ((st = br.readLine()) != null) {
				this.preguntas.add(new Pregunta(id, st.split("-")[0], st.split("-")[1]));
				pdaoDao.guardoPregunta(this.preguntas.get(id));
				id++;
			}

		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	
	

}