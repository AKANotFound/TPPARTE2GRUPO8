package modelo;

import java.util.GregorianCalendar;

public class PersonaAsignada {
	private Persona persona;
	private int puntaje;
	
	public PersonaAsignada(Persona persona, int puntaje, GregorianCalendar fecha) {
		super();
		this.persona = persona;
		this.puntaje = puntaje;
	}

	public Persona getPersona() {
		return persona;
	}

	public int getPuntaje() {
		return puntaje;
	}
}
