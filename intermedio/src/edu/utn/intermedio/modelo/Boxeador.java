package edu.utn.intermedio.modelo;

import java.time.LocalDate;

public class Boxeador extends Persona{
	//private String nombre;
	private Categoria categoria;
	
	public Boxeador(String x)
	{
		this.setNombre(x);
	} 
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	@Override
	public String toString() {
		String laCategoria=(categoria==null? "sin categoria" :categoria.toString());
		return this.getNombre() + " - "+ laCategoria;
		//categoria==null? "sin categoria"
		//else muestro la categoria
	} 


	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		//String laCategoria=(categoria==null? "sin categoria" :categoria.toString());
		//System.out.println(this.getNombre() +" : "  + laCategoria + " : "+ this.getIdentificacion());
		String presentacion= String.format( "%s : %s : %s", getNombre(), getCategoria().toString(), getIdentificacion());
		System.out.println(presentacion);
	}


	@Override
	public boolean esMayorDeEdad() {
		LocalDate fecha = LocalDate.now();
		int anioActual = fecha.getYear();
		
		
		
		return anioActual-this.getAnioNacimiento() >=15;
	}
	
	
	

}
