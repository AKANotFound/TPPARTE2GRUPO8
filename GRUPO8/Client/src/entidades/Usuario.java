package entidades;

import java.util.Observable;

public abstract class Usuario extends Observable{
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
