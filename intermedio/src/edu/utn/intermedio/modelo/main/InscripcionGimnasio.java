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
		
		
		
	}
}
