package entidades;

public class Persona_EmpleadoPretenso extends Persona {
	private String nya;
    private String telefono;
    private int edad;
	private PersonaAsignada elegido;
	
    public Persona_EmpleadoPretenso(Cuenta cuenta, String nya, String telefono, int edad) {
		super(cuenta);
		this.nya = nya;
		this.telefono = telefono;
		this.edad = edad;
		this.elegido = null;
	}
    
	public PersonaAsignada getElegido() {
		return elegido;
	}

	public void setElegido(PersonaAsignada elegido) {
		this.elegido = elegido;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona_EmpleadoPretenso [nya=" + nya + ", telefono=" + telefono + ", edad=" + edad + "]";
	}
}