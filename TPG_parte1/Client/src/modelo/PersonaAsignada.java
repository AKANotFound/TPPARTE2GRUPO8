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
	public int compareTo(PersonaAsignada o) {
		
		return this.puntaje-o.puntaje;
	}
	
	
}
