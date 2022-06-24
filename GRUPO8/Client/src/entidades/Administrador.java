package entidades;

public class Administrador extends Usuario{
    /**
     * @aggregation composite
     */
    private static Administrador instancia = null;
    private String codigoAdministrador;
    
	private Administrador() {
		super(new Cuenta(null,null,null));
	}
	
	public static Administrador getInstancia() {
		if(Administrador.instancia == null) {
			instancia = new Administrador();
		}
		return instancia;
	}	
	
	public String getCodigoAdministrador() {
		return codigoAdministrador;
	}

	public void setCodigoAdministrador(String codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
	}

	public void setCuenta(String usuario,String contrasena)
	{
		this.cuenta=new Cuenta(usuario,contrasena,Agencia.ADMINISTRADOR);
	}

	@Override
	public String toString() {
		return "Administrador";
	}
	
	
}
