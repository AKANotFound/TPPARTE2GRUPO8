package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public abstract class Persona {
    private Cuenta cuenta;
    private PuntajeUsuario puntajeUsuario;
    private Ticket ticket;
    private double costoServicio;     
    private GregorianCalendar fechaListaAsignacion = null;
    private ArrayList<PersonaAsignada> listaDeAsignacion =null;
    
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

	public GregorianCalendar getFechaListaAsignacion() {
		return fechaListaAsignacion;
	}
	
	public void setFechaListaAsignacion(GregorianCalendar fecha) {
		this.fechaListaAsignacion = fecha;
	}

	public void setListaDeAsignacion(ArrayList<PersonaAsignada> listaDeAsignacion) {
		this.listaDeAsignacion = listaDeAsignacion;
	}
	
	public ArrayList<PersonaAsignada> getListaDeAsignacion() {
		return listaDeAsignacion;
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

