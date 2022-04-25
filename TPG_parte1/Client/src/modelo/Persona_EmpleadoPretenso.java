package modelo;

import java.util.ArrayList;

public class Persona_EmpleadoPretenso extends Persona {
	private String nya;
    private String telefono;
    private int edad;
	
    public Persona_EmpleadoPretenso(Cuenta cuenta) {
		super(cuenta);
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

	@Override
	public void cancelarTicket() {
		super.cancelarTicket();
		this.puntaje -= 1;
	}
	@Override
	public void finalizarTicket() {
		super.finalizarTicket();
		this.puntaje += 10;
	}
	
	public void ultimoEmpleado() {
		this.puntaje -= 5;
	}
	public void primerEmpleado() {
		this.puntaje += 5;
	}//

	
	
}