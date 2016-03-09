package singleton;

public class VendedorSingleton {

	
	
	public static VendedorSingleton instancia;
 
    public static VendedorSingleton getInstancia() {
    	
    	
    	//verifica se a instancia é nula
    	if (instancia == null)
    		//syncroniza as threads do sistema para nao dar problema na aplicaçao
    		synchronized (VendedorSingleton.class) {
				if(instancia == null){
					instancia = new VendedorSingleton();
				}
    		}
    	
    	return instancia;

    }
    
    public void vender(String name, String talk){
    	
    	System.out.println(name);
    	System.out.println("\n");
    	System.out.println(talk);
    	
    }
    
}
