import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/** 
 * Creación de Usuario
 * @author eslab
 *
 */
public class Usuario {
	
	protected String nombre;
	protected String apellidos;
	protected String direccion;
	protected String fechaNac;
	
	public Usuario() {
	}
	public Usuario(String nombre, String apellidos, String direccion, String fechaNac) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.fechaNac = fechaNac;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getFechaNac() {
		return this.fechaNac;
	}
	public  void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	

}
