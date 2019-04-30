package xa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.Math;


public class TestLamda {
	public static void main(String[] args) {
		List<Integer> enteros= new ArrayList<>();
		for(int i=0;i<=10;i++) 
		{
			enteros.add(i);
		}
		
		enteros.forEach(ent-> System.out.println(ent));
		enteros.replaceAll(ent -> {   if(ent%2==1)
									{
										
						Double.valueOf(Math.pow(ent, 2)).intValue();
			
									/*double potencia= Math.pow(ent, 2);
										Double cuadrado=Double.valueOf(potencia) ;
										return cuadrado.intValue();*/
										}
										return ent;
		
									}

							);
			System.out.println("Los valores al cuadrado son :");
			enteros.forEach(ent->System.out.println(ent) );
					
					
			List<Integer> enteros2= new ArrayList<>();
			for(int i=0;i<=20;i++) 
			{
				enteros2.add(i);
			}
			enteros2.removeIf(ent ->ent%4==0);
			System.out.println("La segunda lista modificada es:");
			enteros2.forEach(ent->System.out.println(ent) );
		
		
	}
	
	
	

}
