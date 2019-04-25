package edu.utn.intermedio.modelo;

public enum Categoria {
	LIGERO(10,22),
	PLUMA(22,990),
MEDIANO(50,53),
WELTER(54,60),
PESADO(80,120);
	
	private int minimo;
	private int maximo;
	
	private Categoria(int min, int max)
	{
		this.minimo=min;
		this.maximo= max;
	}

}
