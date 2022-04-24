package modelo;

import java.util.ArrayList;

public class Persona_Empleador extends Persona {

	private String razonSocial;
    private boolean personaFisica;
    private Rubro rubro;
    private double puntajeAspectos[]=new double[7];
    
    
    public Persona_Empleador(Cuenta cuenta, int puntaje, Ticket ticket, double costoServicio,double puntajeAspectos[]) {
		super(cuenta, puntaje, ticket, costoServicio);
		this.puntajeAspectos=puntajeAspectos;
	}

	public double[] getPuntajeAspectos() {
		return puntajeAspectos;
	}


	@Override
	public void eleccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarse(String usuario, String contrasena) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarTicket() {
		super.finalizarTicket();
		this.puntaje += 50;
	}
	
	public void noElegido() {
		this.puntaje -= 20;
	}
	public void primerEmpleador() {
		this.puntaje += 10;
	}//

	
	
	
}
