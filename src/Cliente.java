import java.util.Date;
/**
 * 
 * Creacion de Cliente que hereda de Usuario
 * @author eslab
 *
 */
public class Cliente extends Usuario{
	
	protected int id;
	protected String categoria;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, String apellidos, String direccion, String fechaNac, String categoria, int id) {
		super(nombre, apellidos, direccion, fechaNac);
		
		this.id = id; 
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Cliente Nombre: " + nombre + ", Apellidos: " + apellidos + ", Dirección: " + direccion + ", Fecha nacimiento: "
	           + fechaNac + ", Id: " + id + ", Categoría: " + categoria;
	}
	
	
}
