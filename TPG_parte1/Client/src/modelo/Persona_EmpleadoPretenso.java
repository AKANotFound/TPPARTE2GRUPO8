package modelo;

import java.util.ArrayList;

public class Persona_EmpleadoPretenso extends Persona {
	private String nya;
    private String telefono;
    private int edad;
	private PersonaAsignada elegido = null;
	
    public Persona_EmpleadoPretenso(Cuenta cuenta) {
		super(cuenta);
		// TODO Auto-generated constructor stub
	}
    
    @Override
	public void eleccion() {
		// TODO Auto-generated method stub
		
	}
    
	public PersonaAsignada getElegido() {
		return elegido;
	}

	public void setElegido(PersonaAsignada elegido) {
		this.elegido = elegido;
	}	
}