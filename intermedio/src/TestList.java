import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> lista =new ArrayList<>();
		List<String> lista1 =new ArrayList<>();
		Integer [] enteros = {15,0,12,44,42,21,32,22,7};
		String [] arreglo= {"a","bsh","asd"};
		
		List<Integer> listaEnteros=Arrays.asList(enteros);
		
		for(int i=0;i<10;i++)
		{
			lista.add("elemento-"+i);
		}
		for(int i=0;i<10;i++)
		{
			lista1.add(i,"elemento-"+i);
		}
		//System.out.println(lista1.size());
		//System.out.println(lista.size());
		
		
		for(int i=0;i<lista1.size();i++)
		{
			System.out.println(String.format("lista: %s vs lista1: %s", lista.get(i), lista1.get(i)));
		}
		
		lista.forEach(elemento -> System.out.println(elemento));
		lista1.sort((a,b)-> a.length() - b.length());
		
		System.out.println("Recorro lista");
		listaEnteros.forEach(elemen -> System.out.println(elemen));
		System.out.println("Ordeno lista");
		listaEnteros.sort((a,b)->a.intValue()-b.intValue());
		
		listaEnteros.forEach(elemen -> System.out.println(elemen));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
