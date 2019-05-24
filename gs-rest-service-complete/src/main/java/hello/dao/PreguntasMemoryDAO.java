package hello.dao;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import hello.model.PreguntaRespuesta;

@Repository
public class PreguntasMemoryDAO implements PreguntadosDAO {

	private HashMap<Integer, PreguntaRespuesta> preguntas = new HashMap<>();
	private AtomicLong counter = new AtomicLong(0);

	@Override
	public Integer insertPreguntaRespuesta(PreguntaRespuesta pr) {
		
		//AtomicLong counter = new AtomicLong();
		//return (int)counter.getAndIncrement();
		Integer id = (int)counter.getAndIncrement();
		pr.setId(id);
		preguntas.put(id, pr);
		return id;

	}

	@Override
	public Boolean deletePreguntaRespuesta(Integer id) {
		if (preguntas.containsKey(id)) {
			preguntas.remove(id); 
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	@Override
	public Boolean updatePreguntaRespuesta(PreguntaRespuesta id) {
		
		return Boolean.TRUE;
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		//PreguntaRespuesta pr =new PreguntaRespuesta();
		//pr = new PreguntaRespuesta();
		//pr.setId(id);
		//pr.setPregunta("Como se llama?");
		//pr.setRespuesta("Ud sabe");
		//return pr;
		return preguntas.get(id);
	
	}
	@Override
	public String getRespuesta(Integer id)
	{
		PreguntaRespuesta pr =new PreguntaRespuesta();
		pr = new PreguntaRespuesta();
		pr.setId(id);
		pr.setPregunta("Como se llama?");
		pr.setRespuesta("Ud sabe");
		return pr.getPregunta();
	}

}
