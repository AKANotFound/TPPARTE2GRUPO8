package entidades;


public class PersonaElegida implements Comparable<PersonaElegida>{
	private Persona persona;
	private double puntajeDeContratacion;
	
	public PersonaElegida() {
		
	}
	
	public PersonaElegida(Persona persona, double puntajeDeContratacion) {
		super();
		this.persona = persona;
		this.puntajeDeContratacion = puntajeDeContratacion;
	}

	public Persona getPersona() {
		return persona;
	}

	public double getPuntajeDeContratacion() {
		return puntajeDeContratacion;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public void setPuntajeDeContratacion(double puntajeDeContratacion) {
		this.puntajeDeContratacion = puntajeDeContratacion;
	}

	@Override
	public int compareTo(PersonaElegida o) { 
		
		int respuesta=0;
		if (this.puntajeDeContratacion<o.puntajeDeContratacion)
			respuesta=1;
		else
			if (this.puntajeDeContratacion > o.puntajeDeContratacion)
				respuesta=-1;
			else
				respuesta = 0;
		
		return respuesta;
	}

	@Override
	public String toString() {
		return persona + ", puntajeDeContratacion=" + puntajeDeContratacion;
	}
	
	
}
