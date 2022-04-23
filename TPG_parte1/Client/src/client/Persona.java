package client;

import java.util.ArrayList;


public abstract class Persona implements IPersona{
    private Cuenta cuenta;
    private int puntaje;
    private Ticket ticket;
    private double costoServicio;     
    
    public Persona(Cuenta cuenta, int puntaje, Ticket ticket, double costoServicio) {
		super();
		this.cuenta = cuenta;
		this.puntaje = puntaje;
		this.ticket = ticket;
		this.costoServicio = costoServicio;
	}

	public void registrarse(Cuenta cuenta) { //trata excepcion
    	this.cuenta = cuenta;
    	Agencia.getInstancia().agregarCuenta(cuenta);
    }

    public void login(String usuario, String contrasena) {
    	Agencia.getInstancia().login(usuario, contrasena);	
    }

    
    
    public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void visualizarLista() {
    }
    
}
