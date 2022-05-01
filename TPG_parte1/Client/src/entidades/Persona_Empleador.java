package entidades;

import java.util.ArrayList;

public class Persona_Empleador extends Persona {

	private String razonSocial;
    private IRubro rubro;
    private double puntajeAspectos[]=new double[7];
    private ArrayList<PersonaAsignada> elegidos = new ArrayList<PersonaAsignada>();
    private String tipoPersona;
    
    public Persona_Empleador(Cuenta cuenta) 
    {
    	super(cuenta);
    }
    
    public Persona_Empleador(Cuenta cuenta, String razonSocial, String tipoPersona, IRubro rubro)
    {
		super(cuenta);
		this.razonSocial = razonSocial;
		this.rubro = rubro;
		this.tipoPersona = tipoPersona;
	}
    
	public double[] getPuntajeAspectos() {
		return puntajeAspectos;
	}

	public void agregaElegidos (PersonaAsignada personaAsignada)
	{
		this.elegidos.add(personaAsignada);
	}

	public ArrayList<PersonaAsignada> getElegidos() {
		return elegidos;
	}

	public IRubro getRubro() {
		return rubro;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	@Override
	public String toString() {
		return "Persona_Empleador [razonSocial=" + razonSocial + ", rubro=" + rubro + "]";
	}
	
	
}
