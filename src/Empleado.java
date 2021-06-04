import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Creación de Empleado que hereda de Usuario
 * @author eslab
 *
 */
public class Empleado extends Usuario {
	
	protected double salario;
	protected String puesto;
	protected String telefono;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String apellidos, String direccion, String fechaNac, double salario, String puesto, String telefono) {
		super(nombre, apellidos, direccion, fechaNac);
		
		this.salario = salario;
		this.puesto = puesto;
		this.telefono = telefono;
	}

	public double getSalario() {
		return this.salario;
	}

	public String getPuesto() {
		return this.puesto;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Empleado Nombre: " + nombre + ", Apellidos: " + apellidos + ", Dirección: " + direccion + ", Fecha nacimiento: "
				+ fechaNac + "Salario: " + salario + ", Puesto: " + puesto + ", Teléfono: " + telefono;
	}

	

}
