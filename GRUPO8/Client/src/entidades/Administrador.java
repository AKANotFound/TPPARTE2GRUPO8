package entidades;

public class Administrador extends Usuario{
    /**
     * @aggregation composite
     */
    private static Administrador instancia = null;

	private Administrador() {
		super(new Cuenta(null,null,null));
	}
	
	public static Administrador getInstancia() {
		if(Administrador.instancia == null) {
			instancia = new Administrador();
		}
		return instancia;
	}	
	
	public void setCuenta(String usuario,String contrasena)
	{
		this.cuenta=new Cuenta(usuario,contrasena,"administrador");
	}
	
}
