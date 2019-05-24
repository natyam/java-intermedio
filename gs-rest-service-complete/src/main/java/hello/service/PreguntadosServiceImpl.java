package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.dao.PreguntasMemoryDAO;
import hello.model.PreguntaRespuesta;

@Service
public class PreguntadosServiceImpl implements PreguntasService{
	
	@Autowired
	PreguntasMemoryDAO dao;
	
	@Override
	public String getPregunta(Integer id) {
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr.getPregunta();
	}

	@Override
	public String getRespuesta(Integer id) {
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr.getRespuesta();
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr;
	}

	@Override
	public Boolean addPreguntaRespuesta(PreguntaRespuesta pr) {
		Integer insert = dao.insertPreguntaRespuesta(pr);
		
		return insert != null;
	}

	@Override
	public Boolean removePreguntaRespuesta(Integer id) {
		return dao.deletePreguntaRespuesta(id);
	}

	@Override
	public Boolean updatePreguntaRespuesta(Integer id, PreguntaRespuesta pr) {
		return dao.updatePreguntaRespuesta(pr);
	}
}
