package edu.utn.intermedio.modelo.main;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;


public class InscripcionGimnasio {
	public static void main(String[] args) {
	
		Boxeador box = new Boxeador("naty");
		Boxeador box2= new Boxeador("dos");
		Boxeador box3 = new Boxeador("tres");
		
		
		box2.setCategoria(Categoria.PESADO);
		
		System.out.println(box3);
		
		
		Entrenador ent= new Entrenador("ju8an",Categoria.LIGERO,Categoria.MEDIANO,2);
		System.out.println(ent.asignarBoxeador(box));
		System.out.println(ent.asignarBoxeador(box2));
		System.out.println(ent.asignarBoxeador(box3));
		
		System.out.println("Imprimir boxeeadores: ");
		ent.imprimirBoxeadores();
		
		ent.setAnioNacimiento(1999);
		System.out.println(ent.esMayorDeEdad());
		box2.setAnioNacimiento(2001);
		System.out.println(box2.esMayorDeEdad());
		
		
		
		System.out.println("------------");
		ent.presentarse();
		box2.setIdentificacion("123542");
		//box3.setCategoria();
		box2.presentarse();
		
		System.out.println("------------");
		System.out.println(ent.validarNombre());
		
		
		
		
		
		
		
	}
}
