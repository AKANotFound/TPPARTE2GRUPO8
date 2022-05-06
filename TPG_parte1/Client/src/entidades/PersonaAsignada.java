package entidades;


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
		if (this.puntaje<o.puntaje)
			respuesta=1;
		else
			if (this.puntaje > o.puntaje)
				respuesta=-1;
			else
				respuesta = 0;
		
		return respuesta;
	}

	@Override
	public String toString() {
		return persona + ", puntaje=" + puntaje + "]";
	}
	
	
}
