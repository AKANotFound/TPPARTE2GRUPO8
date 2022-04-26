package modelo;


public class PersonaAsignada implements Comparable<PersonaAsignada>{
	private Persona persona;
	private int puntaje;
	
	public PersonaAsignada(Persona persona, int puntaje) {
		super();
		this.persona = persona;
		this.puntaje = puntaje;
	}

	public Persona getPersona() {
		return persona;
	}

	public double getPuntaje() {
		return puntaje;
	}

	@Override
	public int compareTo(PersonaAsignada o) { //CAMBIAR PARA QUE SEA DOUBLE
		
		return this.puntaje-o.puntaje;
	}

	@Override
	public String toString() {
		return "PersonaAsignada [persona=" + persona + ", puntaje=" + puntaje + "]";
	}
	
	
}
