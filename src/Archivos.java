import java.io.*;


public class Archivos {
	
	/**
	 * Método para crear archivo para empleados (empleados.txt) en la misma carpeta que el proyecto
	 * @param String datosEmpleado 
	 */
	public static void crearArchivoEmpleado(String datosEmpleado) {

		File archivoEmpleado = new File(datosEmpleado);
		try {
			if (!archivoEmpleado.exists()) {
				PrintWriter salida = new PrintWriter(archivoEmpleado);
				salida.close();
				System.out.println("Correcto");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}
	/**
	 * Método para crear archivo para clientes (clientes.txt) en la misma carpeta que el proyecto
	 * @param String datosCliente
	 */
	public static void crearArchivoCliente(String datosCliente) {

		File archivoCliente = new File(datosCliente);
		try {
			if (!archivoCliente.exists()) {
			PrintWriter salida = new PrintWriter(archivoCliente);
			salida.close();
			System.out.println("Correcto");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}
	
	/**
	 * Método para introducir usuarios
	 * @param String archivoEmpleado
	 * @param String empleado
	 */
	public static void introducirUsuario(String archivoEmpleado, String empleado) {

		File aEmpleado = new File(archivoEmpleado);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(aEmpleado, true));
			salida.println(empleado.toString());
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
	
	/**
	 * Método para leer datos de archivo
	 * @param String archivoUsuario
	 * @return
	 */
	public static String leerArchivo(String archivoUsuario) {
		
		String lectura = null;
		File datosArchivo = new File(archivoUsuario);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(datosArchivo));
			lectura = entrada.readLine();
			int cont = 1;
			while(lectura != null) {
				lectura = entrada.readLine();
				System.out.println(cont + ".- " + lectura);
				cont ++;
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
			System.out.println("No existe ningún archivo");
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return lectura;
	}
	
	/**
	 * Método para borrar archivo
	 * @param String nombreArchivo
	 */
	public static void borrarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		if (archivo.delete()) {
			System.out.println("Archivo eliminado");
		} else {
			System.out.println("No se ha podido borrar el archivo");
		}
	}

}
