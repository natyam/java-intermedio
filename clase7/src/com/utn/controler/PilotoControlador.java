package com.utn.controler;

import com.utn.model.Piloto;

import ccom.utn.exception.UncheckException;

public class PilotoControlador {

	@SuppressWarnings("unused")
	public void crearPiloto() throws UncheckException 
	{
		Piloto p=null;
		if(p==null)
		{
			throw new UncheckException ("Exploto porque no se creo el objeto");
		}
		
		
		p.manejarEstado();
	}
}
