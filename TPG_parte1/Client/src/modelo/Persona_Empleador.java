package modelo;

import java.util.ArrayList;

public abstract class Persona_Empleador extends Persona {

	private String razonSocial;
    private Rubro rubro;
    private double puntajeAspectos[]=new double[7];
    private ArrayList<PersonaAsignada> elegidos = new ArrayList<PersonaAsignada>();
    private double sueldoOfrecido;
    
    public Persona_Empleador(Cuenta cuenta) 
    {
    	super(cuenta);
    }
    
    public Persona_Empleador(Cuenta cuenta, String razonSocial, Rubro rubro, double sueldoOfrecido) 
    {
		super(cuenta);
		this.razonSocial = razonSocial;
		this.rubro = rubro;
		this.sueldoOfrecido = sueldoOfrecido;
	}


    @Override
	public void eleccion() {
		// TODO Auto-generated method stub
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

}
