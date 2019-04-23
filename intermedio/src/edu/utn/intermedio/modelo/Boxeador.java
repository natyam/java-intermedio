package edu.utn.intermedio.modelo;

import java.time.LocalDate;


public class Boxeador extends Persona implements Identificable{
	//private String nombre;
	public int cantMinEntrenamiento;
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


	public int getCantMinEntrenamiento() {
		return cantMinEntrenamiento;
	}


	public void setCantMinEntrenamiento(int cantMinEntrenamiento) {
		this.cantMinEntrenamiento = cantMinEntrenamiento;
	}
	
	public void entrenarse()
	{
		for(int i=0;i<cantMinEntrenamiento;i++)
		{
			System.out.print("x");
		}
		
	}	
	
	public void entrenarse(int min)
	{
		for(int i=0;i<min;i++)
		{
			System.out.print("x");
		}
		System.out.println("Fin entrenamiento");
		
	}
	public void entrenarse(int horas, boolean intensidad)
	{
		
		
		String marcaEntrenamiento= intensidad ?"X":"x";
		System.out.println("Comienzo entrenamiento");
		for(int i=0;i<horas;i++)
		{
			System.out.print(marcaEntrenamiento);
			try {
				Thread.sleep(500);
			} catch ( InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		System.out.println("\n Fin entrenamiento");
		
	}


	@Override
	public String identification() {
		// TODO Auto-generated method stub
		return "Boxeador: " +this.getIdentificacion();
	}
	
	
	

}
