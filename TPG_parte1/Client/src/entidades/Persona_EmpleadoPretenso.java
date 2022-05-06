package entidades;

import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
import sistema.FuncionalidadPersona;

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
    
    
    /*public void setFuncionalidad(FuncionalidadEmpleadoPretenso funcionalidad) {
		this.funcionalidad = funcionalidad;
	}*/
	public PersonaAsignada getElegido() {
		return elegido;
	}

	public void setElegido(PersonaAsignada elegido) {
		this.elegido = elegido;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getTipoDePuesto() {
		return this.ticket.getFormularioDeBusqueda().getTipoDePuesto().toString();
	}
 
	@Override
	public String toString() {
		return "Empleado Pretenso [nombre y apellido = " + nya + ", telefono = " + telefono + ", edad = " + edad + ", "+super.toString()+"]";
	}
}