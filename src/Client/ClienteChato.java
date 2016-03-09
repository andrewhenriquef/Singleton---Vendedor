package Client;
import singleton.*;

public class ClienteChato extends Cliente{

	public ClienteChato(){
		
		setNome("Cliente Chato");
		setFalaCliente("Sou o cliente chato");
		
	}
	
		
	public void comprar(){
		VendedorSingleton.getInstancia().vender(this.getNome(),this.getFalaCliente());
		
	}
	
}
