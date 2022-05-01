package entidades;

import java.util.ArrayList;

public class Persona_Empleador extends Persona {

	private String razonSocial;
    private String rubro;
    private double puntajeAspectos[]=new double[7];
    private ArrayList<PersonaAsignada> elegidos = new ArrayList<PersonaAsignada>();
    private double sueldoOfrecido;
    
    public Persona_Empleador(Cuenta cuenta) 
    {
    	super(cuenta);
    }
    
    public Persona_Empleador(Cuenta cuenta, String razonSocial, String rubro, double sueldoOfrecido) 
    {
		super(cuenta);
		this.razonSocial = razonSocial;
		this.rubro = rubro;
		this.sueldoOfrecido = sueldoOfrecido;
	}
    
	public double[] getPuntajeAspectos() {
		return puntajeAspectos;
	}
	
	

	public double getSueldoOfrecido() {
		return sueldoOfrecido;
	}

	public void agregaElegidos (PersonaAsignada personaAsignada)
	{
		this.elegidos.add(personaAsignada);
	}

	public ArrayList<PersonaAsignada> getElegidos() {
		return elegidos;
	}

	@Override
	public String toString() {
		return "Persona_Empleador [razonSocial=" + razonSocial + ", rubro=" + rubro + "]";
	}
}
