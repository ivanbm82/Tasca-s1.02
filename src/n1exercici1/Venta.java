package n1exercici1
;

import java.util.ArrayList;

public class Venta {
	
	private ArrayList<Producto> producto;
	private double totalVenta;
	
	public Venta() {
		super();
		
	}
	
	public Venta(ArrayList<Producto> producto) {
		super();
		this.producto = producto;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	public void calcularTotal() throws VentaVaciaException  {
		
		if(producto== null ||producto.size()==0) {
			throw new VentaVaciaException("Para hacer una venta hay que añadir algun producto");
		}
		
		for (int i = 0; i < producto.size(); i++) {
			
			totalVenta += producto.get(i).getPrecio();
		}
		System.out.println("El total es " + totalVenta + " €");
	}
	
}