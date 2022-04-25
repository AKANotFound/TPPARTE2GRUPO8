package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public abstract class Persona implements IPersona{
    private Cuenta cuenta;
    protected int puntaje;
    private Ticket ticket;
    private double costoServicio;     
    private GregorianCalendar fechaListaAsignacion = null;
    private ArrayList<PersonaAsignada> listaDeAsignacion = new ArrayList<PersonaAsignada>();
    
    public Persona(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
		this.puntaje = 0;
		this.ticket = null;
		this.costoServicio = 0;
	}

	public void registrarse(String usuario, String contrasena) { //trata excepcion
		funcPersona.registrarse(usuario, contrasena);
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

	public ArrayList<PersonaAsignada> getListaDeAsignacion() {
		return listaDeAsignacion;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
}
