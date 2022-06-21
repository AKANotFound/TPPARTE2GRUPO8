package entidades;

import java.io.Serializable;

public abstract class Usuario {
    /**
     * @aggregation composite
     */
    protected Cuenta cuenta;
	
    public Usuario() {
    	
    }
    
	public Usuario(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
