//import almacen.IArticulo;
import java.util.ArrayList;

import almacen.Almacen;
import almacen.Producto;
import almacen.ProductoFerreteria;
import almacen.ProductoTecnologico;
import almacen.ProductoTextil;

public class Principal {
	
	static ArrayList<Producto> almacen;
	public static void main(String[] args) {
		almacen=new ArrayList<Producto>();
		Producto pro = new ProductoTextil("Falda", 4, 5, 10, 12, "L", "Rojo");
		//procesarArticulo(pro);
		Producto prof= new ProductoFerreteria("Destornillador de estrella",25, 3, 9.3f , 15, "Grande");
		Producto prof2= new ProductoFerreteria("Destornillador de estrella",25, 3, 9.3f , 15, "Grande");
		Producto prof3= new ProductoFerreteria("Destornillador de estrella",25, 3, 9.3f , 15, "Grande");
		Producto prot= new ProductoTecnologico("Pegasus",25, 3, 199.3f , 15, "V1.6");
		Producto prot1= new ProductoTecnologico("Pegasus",25, 3, 199.3f , 15, "V1.9");
		lista(pro);
		lista(prof);
		lista(prof2);
		lista(prof3);
		lista(prot);
		lista(prot1);
		//veralmacen();
		Almacen al=new Almacen("Juan Calos Noda", "Calle Latobano 5", "96451212132",almacen);
		System.out.println(al.toString());
		
		System.out.println("holaa");
	}

	public static void procesarArticulo(Producto p) {
		float importe;
		System.out.println(p);
		//IArticulo a = (IArticulo) p;
		System.out.println(p.prepararProducto());
		importe = p.comprar(10);
		System.out.println("Importe de la compra: " + importe);
		System.out.println("Stock después de la compra: " + p.getStock());
		importe = p.vender(5);
		System.out.println("Importe de la venta: " + importe);
		System.out.println("Stock después de la venta: " + p.getStock());
	}
	
	public static  ArrayList<Producto> lista(Producto p){
		
		almacen.add(p);
		
		
		return almacen;
		
	}
	
	public static void veralmacen() {
		
		for (int i = 0; i < almacen.size(); i++) {
			
			procesarArticulo(almacen.get(i));		      
		}
	}
}
