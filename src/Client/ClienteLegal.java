package Client;

import singleton.VendedorSingleton;

public class ClienteLegal extends Cliente {

	public ClienteLegal(){
		
		setNome("Cliente Legal");
		setFalaCliente("Sou o cliente legal");
		
	}
	

		
	public void comprar(){
		VendedorSingleton.getInstancia().vender(this.getNome(),this.getFalaCliente());
	}
}
