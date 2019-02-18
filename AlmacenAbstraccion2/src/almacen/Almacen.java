package almacen;

import java.util.ArrayList;

public class Almacen {
	
	/* Crea una clase llamada Almacen que contendrá las siguientes propiedades: responsable, 
	 * domicilio, tlf y productos. La idea es que cada objeto Almacen guarde el nombre de la 
	 * persona responsable, el domicilio y teléfono del almacén, así como una colección de tipo ArrayList
	 *  de productos.
	 */
	
	private String responsable;
	private String domicilio;
	private String telefono;
	private ArrayList<Producto> p;
	
	public Almacen(String responsable, String domicilio, String telefono, ArrayList<Producto> p) {
		super();
		this.responsable = responsable;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.p = p;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Producto> getP() {
		return p;
	}
	@Override
	public String toString() {
		return "Almacen [responsable=" + responsable + ", domicilio=" + domicilio + ", telefono=" + telefono + ",\n p="
				+ p + "]";
	}

	
}
