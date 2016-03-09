package Client;

public abstract class Cliente {

	private String nome;
	private String falaCliente;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFalaCliente() {
		return falaCliente;
	}
	
	public void setFalaCliente(String falaCliente) {
		this.falaCliente = falaCliente;
	}
	
	public abstract void comprar();
	

}
