package com.utn.controler;

import com.utn.model.Vehiculo;

import ccom.utn.exception.CheckedException;

public class VehiculoControlador {

		public void creoVehiculo() throws CheckedException
		{
			//el throws compila todo hasta q encuentra un error y le da el control al
			//CheckedExeption q es el q lo invoca
			
			Vehiculo a=null;
			if(a==null)
			{
				throw new CheckedException("La variable vehiculo no estaba inicializada");
			}
			a.encender();
			
			
			/* try {
				Vehiculo a=null;
				a.encender();
			} catch (Exception e) {
				// TODO: handle exception
			}
			 * */
			
			
			
			
		}
}
