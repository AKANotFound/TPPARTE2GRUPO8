package entidades;

public class Administrador {
	private Cuenta cuenta;
    private static Administrador instancia = null;
    
    private Administrador() {
    	this.cuenta = new Cuenta("admin","1234");
    }
    
    public static Administrador getInstancia() {
    	if (instancia == null)
    		instancia = new Administrador();
    	return instancia;
    }
}
