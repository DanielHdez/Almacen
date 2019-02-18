package almacen;

public class ProductoFerreteria extends Producto implements IArticulo {
	
	private String tamaño;

	public ProductoFerreteria( String descripcion, int stock, int stockMinimo, float precioCompra,
			float precioVenta,String tamaño) {
		super("Ferreteria", descripcion, stock, stockMinimo, precioCompra, precioVenta);
		this.tamaño=tamaño;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  super.toString() + ", Tamaño=" + tamaño+"\n";
	}

	@Override
	public String prepararProducto() {
		return "Preparando el producto: " + this.getDescripcion();
	}
}
