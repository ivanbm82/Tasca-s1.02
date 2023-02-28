package n1exercici1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws VentaVaciaException {
		// TODO Auto-generated method stub
		
		Producto producto1 = new Producto("arroz", 1.20);
		Producto producto2 = new Producto("harina", 2.50);
		Producto producto3 = new Producto("cafe", 2.70);
		Producto producto4 = new Producto("jabon", 1.30);
		Producto producto5 = new Producto("lejia", 1.65);
		
		ArrayList<Producto> producto = new ArrayList<>();
		producto.add(producto1);
		producto.add(producto2);
		producto.add(producto3);
		producto.add(producto4);
		producto.add(producto5);
		
		Venta num1 = new Venta(producto);
		
		num1.calcularTotal();
		
		Venta num2 =new Venta();
		num2.calcularTotal();
		/*
		try {
			num2.calcularTotal();
			
		}catch(VentaVaciaException e) {
			
			System.out.println(e.getMessage());
		}*/
		
		try {
			System.out.println(producto.get(-1));

		} catch(IndexOutOfBoundsException e){//Capturamos el IndexOutOfBoundsException
			System.out.println(e.getMessage());
			
		}

	}

}
