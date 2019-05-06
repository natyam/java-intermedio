package com.utn.view;

import com.utn.controler.PilotoControlador;
import com.utn.controler.VehiculoControlador;

import ccom.utn.exception.CheckedException;

public class Test {

	public static void main(String[] args) {
		VehiculoControlador vc=new VehiculoControlador();
		try {
			vc.creoVehiculo();
		} catch (CheckedException e) {
			e.guardoErrorenArchivo();
			System.out.println("Salio por exception");
		}
		
		System.out.println("Trabajamos con una Exception no controlada UNCHECKED");
		PilotoControlador pc= new PilotoControlador();
		pc.crearPiloto();
		System.out.println("Fin del programa");
		
		
	}
}
