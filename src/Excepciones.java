
public class Excepciones extends Exception{

	/** 
	 * Creaci�n de excepci�n para controlar la edad
	 * @param mensaje
	 */
	public Excepciones(String mensaje) {
		super(mensaje);
	}
	
	public static void validar(int edad) throws Excepciones{
	
		if(edad < 18 && edad >= 67) {			    	
	    	throw new Excepciones("No se puede introducir empleado con " + edad + "a�os. \nRango de edad v�lido de 18 a 67 a�os");
		 }
	}

}
