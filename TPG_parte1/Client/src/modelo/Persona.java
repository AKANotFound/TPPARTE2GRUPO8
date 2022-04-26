package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public abstract class Persona {
    private Cuenta cuenta;
    protected int puntaje;
    private Ticket ticket;
    private double costoServicio;     
    private GregorianCalendar fechaListaAsignacion = null;
    private ArrayList<PersonaAsignada> listaDeAsignacion =null;
    
    public Persona(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
		this.puntaje = 0;
		this.ticket = null;
		this.costoServicio = 0;
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
	
	public void activarTicket() {
		this.ticket.activar();
	}
	public void suspenderTicket() {
		this.ticket.suspender();
	}
	public void cancelarTicket() {
		this.ticket.cancelar();
	}
	public void finalizarTicket() {
		this.ticket.finalizar();
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

