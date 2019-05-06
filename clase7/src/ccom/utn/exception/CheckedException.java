package ccom.utn.exception;

import java.io.File;
import java.io.FileWriter;

@SuppressWarnings("serial")
public class CheckedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 621924856034099504L;
	private String mensaje;
	
	public CheckedException (String mensaje)
	{
		this.mensaje=mensaje;
	}
	
	
	public void guardoErrorenArchivo()
	{
		try {
			File archivo= new File("logErrores.txt");
			FileWriter fw= new FileWriter(archivo,true);
			fw.write(mensaje);
			fw.flush();
			fw.close();
			
			
		} catch (Exception e) {
			System.out.println("No se pudo escribir en el archivo");
		}
		
		
		
	}
	
	
	
}
