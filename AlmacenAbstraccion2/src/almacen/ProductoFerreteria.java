package almacen;

public class ProductoFerreteria extends Producto implements IArticulo {
	
	private String tama�o;

	public ProductoFerreteria( String descripcion, int stock, int stockMinimo, float precioCompra,
			float precioVenta,String tama�o) {
		super("Ferreteria", descripcion, stock, stockMinimo, precioCompra, precioVenta);
		this.tama�o=tama�o;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  super.toString() + ", Tama�o=" + tama�o+"\n";
	}

	@Override
	public String prepararProducto() {
		return "Preparando el producto: " + this.getDescripcion();
	}
}
