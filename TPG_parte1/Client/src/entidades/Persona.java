package entidades;

import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadPersona;


/**
 * @author grupoxd <br>
 * Clase abstracta que representa una Persona, solo guarda informaci�n acerca de ella.
 */

public abstract class Persona extends Usuario {
	protected Ticket ticket;
	private double costoServicio;
	private ListaDeAsignacion listaDeAsignacion;
	private boolean eligio;
	private int puntaje;
	//protected FuncionalidadPersona funcionalidad = null;
 
	/**
	 * Constructor con 1 parametro para setear la cuenta de la persona. Al resto de los atributos se los inicializa en el mismo constructor
	 * <br>
	 * @param cuenta : parametro de tipo String que representa la cuenta de la Persona
	 */
	
	public Persona(Cuenta cuenta) {
		super(cuenta);
		this.ticket = null;
		this.costoServicio = 0;
		this.eligio = false;
		this.puntaje = 0;
		this.listaDeAsignacion = null;
	}
  
	

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public double getRemuneracion() {
		if (this.ticket == null)
			return 0;
		else
			return this.ticket.getFormularioDeBusqueda().getRemuneracion().getRemuneracion();
	}

	public ListaDeAsignacion getListaDeAsignacion() {
		return listaDeAsignacion;
	}

	public void setListaDeAsignacion(ListaDeAsignacion listaDeAsignacion) {
		this.listaDeAsignacion = listaDeAsignacion;
	}

	public boolean isEligio() {
		return eligio;
	}
 
	public void setEligio(boolean eligio) {
		this.eligio = eligio;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public double getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(double costoServicio) {
		this.costoServicio = costoServicio;
	}

	@Override
	public String toString() {
		return ", eligio=" + eligio + ", puntaje=" + puntaje + "]";
	}

}
