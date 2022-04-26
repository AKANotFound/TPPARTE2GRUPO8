package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public abstract class Persona {
    private Cuenta cuenta;
    private PuntajeUsuario puntajeUsuario;
    private Ticket ticket;
    private double costoServicio;     
    private ListaDeAsignacion listaDeAsignacion;
    
    
    public Persona(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
		this.puntajeUsuario = new PuntajeUsuario();
		this.ticket = null;
		this.costoServicio = 0;
	}
    
	public PuntajeUsuario getPuntajeUsuario() {
		return puntajeUsuario;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	

	public ListaDeAsignacion getListaDeAsignacion() {
		return listaDeAsignacion;
	}

	public void setListaDeAsignacion(ListaDeAsignacion listaDeAsignacion) {
		this.listaDeAsignacion = listaDeAsignacion;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void eleccion() {
		// TODO Auto-generated method stub
		
	}

	public void visualizarLista() {
		// TODO Auto-generated method stub
		
	}	
}

