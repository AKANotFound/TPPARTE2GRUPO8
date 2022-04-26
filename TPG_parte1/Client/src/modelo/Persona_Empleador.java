package modelo;

import java.util.ArrayList;

public class Persona_Empleador extends Persona {

	private String razonSocial;
    private boolean personaFisica;
    private Rubro rubro;
    private double puntajeAspectos[]=new double[7];
    private ArrayList<PersonaAsignada> elegidos = new ArrayList<PersonaAsignada>();
    
    
    public Persona_Empleador(Cuenta cuenta) {
		super(cuenta);
	}

	public double[] getPuntajeAspectos() {
		return puntajeAspectos;
	}

	public void agregaElegidos (PersonaAsignada personaAsignada)
	{
		this.elegidos.add(personaAsignada);
	}
	@Override
	public void eleccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarTicket() {
		super.finalizarTicket();
		this.puntaje += 50;
	}
	public void primerEmpleador() {
		this.puntaje += 10;
	}
	
//

	
	
	
}
