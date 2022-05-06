package entidades;

public abstract class Usuario {
	private Cuenta cuenta;
	
	public Usuario(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
}
