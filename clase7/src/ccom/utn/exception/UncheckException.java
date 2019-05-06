package ccom.utn.exception;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

@SuppressWarnings("serial")
public class UncheckException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3426114703795176446L;
	private String mensaje;
	public UncheckException(String mensaje)
	{
		this.mensaje=mensaje;
		//lo ponemos aca xq no me va a necesitar el try catch donde lo llame
		guardoArchivo();
	}

	public void guardoArchivo()
	{
		try {
			FileWriter fw= new FileWriter(new File("RunTimeException"+new Date().getTime()+".log"));
			fw.write(this.mensaje);
			fw.flush();
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
