package client;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Persona implements IPersona{
    private Cuenta cuenta;
    private int puntaje;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private double costoServicio;     
    
    public Persona(Cuenta cuenta, int puntaje, ArrayList<Ticket> tickets, double costoServicio) {
		super();
		this.cuenta = cuenta;
		this.puntaje = puntaje;
		this.tickets = tickets;
		this.costoServicio = costoServicio;
	}

	public void registrarse(Cuenta cuenta) { //trata excepcion
    	this.cuenta = cuenta;
    	Agencia.getInstancia().agregarCuenta(cuenta);
    }

    public void login(String usuario, String contrasena) {
    	Agencia.getInstancia().login(usuario, contrasena);	
    }

    public void visualizarLista() {
    }
    
}
