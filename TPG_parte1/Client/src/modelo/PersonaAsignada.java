package modelo;


public class PersonaAsignada implements Comparable<PersonaAsignada>{
	private Persona persona;
	private double puntaje;
	
	public PersonaAsignada(Persona persona, double puntaje) {
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
		
		int respuesta=0;
		if (o.puntaje<=this.puntaje)
			respuesta=1;
		else
			respuesta=0;
		
		return respuesta;
	}

	@Override
	public String toString() {
		return "PersonaAsignada [persona=" + persona + ", puntaje=" + puntaje + "]";
	}
	
	
}
