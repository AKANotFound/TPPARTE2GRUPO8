package client;

import java.util.ArrayList;

public class Persona_Empleador extends Persona {

	private String razonSocial;
    private boolean personaFisica;
    private Rubro rubro;
    private ArrayList<Persona_EmpleadoPretenso> empleadosPotenciales = new ArrayList<Persona_EmpleadoPretenso>();
	

    public Persona_Empleador(Cuenta cuenta, int puntaje, ArrayList<Ticket> tickets, double costoServicio) {
		super(cuenta, puntaje, tickets, costoServicio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eleccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarse(String usuario, String contrasena) {
		// TODO Auto-generated method stub
		
	}
}
