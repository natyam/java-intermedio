package edu.utn.intermedio.modelo;

import java.time.LocalDateTime;
import java.util.Collection;

public interface Identificable{
	
	public String identification();
	
	public default void saludar()
	{
		LocalDateTime fechahora= LocalDateTime.now();
		
		int horaMilitar=fechahora.getHour()*100 +fechahora.getMinute();
		
		Collection<String> coleccion;
		
		
		if(horaMilitar>=600 &&horaMilitar<=1200)
		{
			System.out.println("Buenos Dias");
		}
		else
		{
			if(horaMilitar>=1201 && horaMilitar<=1959)
			{
				System.out.println("Buenas tardes");
			}
			else
			{
					System.out.println("Buenas noches");
		//||||
			}
			
		} 
				
	}

}
