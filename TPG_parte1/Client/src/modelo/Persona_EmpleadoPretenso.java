package modelo;

import java.util.ArrayList;

public class Persona_EmpleadoPretenso extends Persona {
	private String nya;
    private String telefono;
    private int edad;
    private ArrayList<Persona_Empleador> empleadoresPotenciales = new ArrayList<Persona_Empleador>();
	
    public Persona_EmpleadoPretenso(Cuenta cuenta, int puntaje, Ticket ticket, double costoServicio) {
		super(cuenta, puntaje, ticket, costoServicio);
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
