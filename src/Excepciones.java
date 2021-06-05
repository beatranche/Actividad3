
public class Excepciones extends Exception{

	/** 
	 * Creación de excepción para controlar la edad
	 * @param mensaje
	 */
	public Excepciones(String mensaje) {
		super(mensaje);
	}
	
	public static void validar(int edad) throws Excepciones{
	
		if(edad < 18 && edad >= 67) {			    	
	    	throw new Excepciones("No se puede introducir empleado con " + edad + "años. \nRango de edad válido de 18 a 67 años");
		 }
	}

}
