package almacen;

public class ProductoTecnologico extends Producto implements IArticulo {
	
	private String version;

	public ProductoTecnologico( String descripcion, int stock, int stockMinimo, float precioCompra,
			float precioVenta,String tama�o) {
		super("Ferreteria", descripcion, stock, stockMinimo, precioCompra, precioVenta);
		this.version=tama�o;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  super.toString() + ", Tama�o=" + version+"\n";
	}

	@Override
	public String prepararProducto() {
		return "La version del programa es: " + this.getDescripcion();
	}
}
