import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
/** 
 * Clase Main con lanzador de excepciones
 * @param String args
 * @throws Exception Excepciones
 */
	public static void main(String[] args) throws Excepciones {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;
		String empleados = "empleados.txt";
		String clientes = "clientes.txt";
		
		//Menú principal
		while (!salir) {
			System.out.println("Selecciona sobre quién deseas operar");
			System.out.println("1. EMPLEADOS");
			System.out.println("2. CLIENTES");
			System.out.println("Pulsa cualquier tecla para salir.");
			opcion = sc.nextInt();

			switch (opcion) {
			
			// Submenú para empleados
			case 1:
				int menuEmp = 0;
				do {
					System.out.println("       SELECCIONA UNA OPCION       ");
					System.out.println("***********************************");
					System.out.println("* 1. Introduce nuevo empleado     *");
					System.out.println("* 2. Consulta datos de empleados  *");
					System.out.println("* 3. Eliminar lista empleados     *");
					System.out.println("* 4. Salir                        *");
					System.out.println("***********************************");
					menuEmp = sc.nextInt();

					switch (menuEmp) {
					// Opción para introducir empleados
					case 1:
						double salario = 0;
						String fechaNac = "01/01/1900";
						int edad = 0;
						
						Archivos.crearArchivoEmpleado(empleados);
						System.out.println("Introduce nombre:");
						String nombre = sc.next();
						System.out.println("Introduce apellidos:");
						String apellidos = sc.next();
						System.out.println("Introduce dirección:");
						String direccion = sc.next();
						try {
							System.out.println("Introduce fecha de nacimiento(dd/MM/yyyy): ");
							fechaNac = sc.next();
							String[] parts = fechaNac.split("/");
							// Operaciones para calcular la edad
							int yy = Integer.parseInt(parts[2]);
						    Calendar fechaHoy = Calendar.getInstance();
						    edad = fechaHoy.get(Calendar.YEAR) - yy;
						    //Comprobación de rango de edad solicitado
						    if(edad < 18 && edad >= 67) {			    	
						    	throw new Excepciones("No se puede introducir empleado con " + edad + "años. \nRango de edad válido de 18 a 67 años");
							 }
						   break;
						}catch(ArrayIndexOutOfBoundsException e){
							e.getMessage();
							System.out.println("Introduce una fecha válida");
						}
				
						System.out.println("Introduce puesto: ");
						String puesto = sc.next();
						System.out.println("Introduce teléfono: ");
						String tel = sc.next();
						System.out.println("Introduce salario: ");
						try {
							salario = sc.nextDouble();
						}catch(InputMismatchException e) {
							System.out.println("Introduce una cantidad válida");
						}
							Empleado empleado = new Empleado(nombre, apellidos, direccion, fechaNac, salario, puesto, tel);
							Archivos.introducirUsuario(empleados, empleado.toString());
						break;
					case 2:
						// Consulta de archivos
						String buscado = Archivos.leerArchivo(empleados);
						break;
					case 3:
						// Borrado de archivos
						System.out.println("Desea borrar archivo de empleados(s | n): ");
						char op = 0;
						op = sc.next().charAt(op);
						if (op == 's' || op == 'S') {
							Archivos.borrarArchivo(empleados);
							System.out.println("El archivo ha sido borrado");
						}
						else {
							System.out.println("Operación cancelada");
						}
						break;
					default:
						menuEmp = 0;
					}
				} while (menuEmp > 0 && menuEmp < 5);
				break;
			case 2:
				int menuCli = 0;
				// Submenú para clientes
				do{
					System.out.println("       SELECCIONA UNA OPCION       ");
					System.out.println("***********************************");
					System.out.println("* 1. Introduce nuevo cliente      *");
					System.out.println("* 2. Consulta datos de clientes   *");
					System.out.println("* 3. Eliminar lista clientes      *");
					System.out.println("* 4. Salir                        *");
					System.out.println("***********************************");
					menuCli = sc.nextInt();

					switch (menuCli) {

					case 1:
						Archivos.crearArchivoCliente(clientes);
						System.out.println("Introduce nombre:");
						String nombre = sc.next();
						System.out.println("Introduce apellidos:");
						String apellidos = sc.next();
						System.out.println("Introduce dirección:");
						String direccion = sc.next();
						System.out.println("Introduce fecha de nacimiento: ");
						String fechaNac = sc.next();
						String feNac = sc.next();
						String[] parts = fechaNac.split("/");
						int yy = Integer.parseInt(parts[2]);
					    Calendar fechaHoy = Calendar.getInstance();
					    int edad = fechaHoy.get(Calendar.YEAR) - yy;
						System.out.println("Introduce categoria: ");
						String categoria = sc.next();
						int id = 0;
						// Introducción de cliente con datos proporcionados por usuario
						Cliente cliente = new Cliente(nombre, apellidos, direccion, feNac, categoria, id++);
						Archivos.introducirUsuario(clientes, cliente.toString());
						break;

					case 2:
						// Consulta de archivo clientes
						Archivos.leerArchivo(clientes);
						break;
					
					case 3:
						// Borrado de archivo clientes
						System.out.println("Desea borrar archivo de clientes (s | n): ");
						char op = 0;
						op = sc.next().charAt(op);
						if (op == 's' || op == 'S') {
							Archivos.borrarArchivo(empleados);
							System.out.println("El archivo ha sido borrado");
						}
						else {
							System.out.println("Operación cancelada");
						}
						break;
					default:
						menuCli = 0;
						break;
					}
				}
				while (menuCli > 0 && menuCli < 5) ;
				break;
				
			default:
				salir = true;
				break;
				
			}
		
		}

	}
}
