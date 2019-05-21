package hello.dao;

import hello.model.PreguntaRespuesta;

public interface PreguntadosDAO {
	public Integer insertPreguntaRespuesta(PreguntaRespuesta pr);
	public Boolean deletePreguntaRespuesta(Integer id);
	public Boolean updatePreguntaRespuesta(PreguntaRespuesta id);
	public PreguntaRespuesta getPreguntaRespuesta(Integer id);

}
