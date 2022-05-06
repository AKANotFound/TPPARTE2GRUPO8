package entidades;

public class Administrador extends Usuario{
	private static Administrador instancia = null;

	private Administrador() {
		super(new Cuenta("admin","1234","administrador"));
	}
	
	public static Administrador getInstancia() {
		if(Administrador.instancia == null) {
			instancia = new Administrador();
			
		}
		return instancia;
	}	
}
