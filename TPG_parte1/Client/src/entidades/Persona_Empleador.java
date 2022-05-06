package entidades;

import java.util.ArrayList;

import sistema.FuncionalidadEmpleador;
import sistema.FuncionalidadPersona;

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
	public void setPuntajeAspectos (double a, double b, double c, double d, double e, double f, double g)
	{	
		puntajeAspectos[0]=a;
		puntajeAspectos[1]=b;
		puntajeAspectos[2]=c;
		puntajeAspectos[3]=d;
		puntajeAspectos[4]=e;
		puntajeAspectos[5]=f;
		puntajeAspectos[6]=g;
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
		return "Empleador [razon social = " + razonSocial + ", rubro = " + rubro + ", "+super.toString()+"]";
	}

	
	
}
