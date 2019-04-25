package edu.utn.intermedio.modelo.main;

import java.util.ArrayList;
import java.util.Collection;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;
import edu.utn.intermedio.modelo.Identificable;
import edu.utn.intermedio.modelo.Recurso;


public class InscripcionGimnasio {
	public static void main(String[] args) {
	
		
		Collection <Identificable> activosGimnacio= new ArrayList();
		Boxeador box = new Boxeador("naty");
		Boxeador box2= new Boxeador("dos");
		Boxeador box3 = new Boxeador("tres");
		activosGimnacio.add(box);
		
		
		
		box2.setCategoria(Categoria.PESADO);
		
		System.out.println(box3);
		
		
		Entrenador ent= new Entrenador("ju8an",Categoria.LIGERO,Categoria.MEDIANO,5);
		System.out.println(ent.asignarBoxeador(box));
		System.out.println(ent.asignarBoxeador(box2));
		System.out.println(ent.asignarBoxeador(box3));
		
		System.out.println("Imprimir boxeeadores: ");
		ent.imprimirBoxeadores();
		
		ent.setAnioNacimiento(1999);
		System.out.println(ent.esMayorDeEdad());
		box2.setAnioNacimiento(2001);
		System.out.println(box2.esMayorDeEdad());
		activosGimnacio.add(ent);
		
		
		System.out.println("------------");
		ent.presentarse();
		box2.setIdentificacion("123542");
		//box3.setCategoria();
		box2.presentarse();
		
		System.out.println("------------");
		System.out.println(ent.validarNombre());
		
		System.out.println("------------");
		//box.setCantMinEntrenamiento(50);
		//box.entrenarse();
		//box.entrenarse(50, true);
		ent.entrenar();
		
		
		
		Recurso recurso1= new Recurso();
		recurso1.setEtiqueta("NM-1353a");
		activosGimnacio.add(recurso1);
		
		Recurso recurso2= new Recurso();
		recurso2.setEtiqueta("NM-1353b");
		activosGimnacio.add(recurso2);
		Recurso recurso3= new Recurso();
		recurso3.setEtiqueta("NM-1353c");
		activosGimnacio.add(recurso3);
		
		
		for (Identificable activo : activosGimnacio) {
			System.out.println(activo.identification());
		}
		
		
		
		
		box.saludar();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
		
		
		
		
		
		
		
		
	}

