package almacen;

public class ProductoTextil extends Producto {
	private String talla;
	private String color;

	public ProductoTextil(String descripcion, int stock, 
			int stockMinimo, float precioCompra,
			float precioVenta, String talla, String color) {
		super("Textil", descripcion, stock, stockMinimo, precioCompra, precioVenta);
		this.talla = talla;
		this.color = color;
	}

	@Override
	public String toString() {
		return  super.toString() + ", Talla=" + talla + ", Color=" + color+"\n";
	}

	@Override
	public String prepararProducto() {
		return "Planchando y empaquetando el producto: " + this.getDescripcion();
	}
}
