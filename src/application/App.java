package application;
import Client.*;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Cliente cliente = new ClienteChato();
		cliente.comprar();
		
		System.out.println("\n");
		cliente = new ClienteLegal();
		cliente.comprar();
		
		
		
	}

}
