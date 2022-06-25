package entidades;

public class Persona_EmpleadoPretenso extends Persona {
	private String nya;
    private String telefono;
    private int edad;
	private PersonaElegida empleadorElegido;
	private Persona_Empleador empleadorActual;
	
	public Persona_EmpleadoPretenso() {}
	
    public Persona_EmpleadoPretenso(Cuenta cuenta, String nya, String telefono, int edad) {
		super(cuenta);
		this.nya = nya;
		this.telefono = telefono;
		this.edad = edad;
		this.empleadorElegido = null;
		this.empleadorActual = null;
	}

	public Persona_Empleador getEmpleadorActual() {
		return empleadorActual;
	}

	public void setEmpleadorActual(Persona_Empleador empleadorActual) {
		this.empleadorActual = empleadorActual;
	}


	public PersonaElegida getEmpleadorElegido() {
		return empleadorElegido;
	}

	public void setEmpleadorElegido(PersonaElegida elegido) {
		this.empleadorElegido = elegido;
	}
	
	public String getTipoDePuesto() {
		return this.ticket.getFormularioDeBusqueda().getTipoDePuesto().toString();
	}
 
	@Override
	public String toString() {
		return "Empleado: " + nya +super.toString();
	}
	
	public String getNya() {
		return nya;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setNya(String nya) {
		this.nya = nya;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}