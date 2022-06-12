package entidades;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import tablas.ILocacion;
import util.Util;

public class Simulacion_EmpleadoPretenso extends Persona_EmpleadoPretenso implements Runnable,Observer{
	
	private TicketSimplificado ticketSimplificado;
	private BolsaDeTrabajo bolsaDeTrabajo; //es el observado
	private ArrayList<TicketSimplificado> ticketsSimplificadosIncompatibles = new ArrayList<TicketSimplificado>();
	private ILocacion locacionElegida;
	private IRubro rubroElegido;
	private boolean puedeSacarTicket=false;
	
	public void agregarObservable(BolsaDeTrabajo bolsaDeTrabajo)
	{
		bolsaDeTrabajo.addObserver(this);
		this.bolsaDeTrabajo=bolsaDeTrabajo;
	}
	
	public Simulacion_EmpleadoPretenso(String nya, ILocacion locacionElegida, IRubro rubroElegido) {
		super(null, nya, null, 0);
		this.locacionElegida = locacionElegida;
		this.rubroElegido = rubroElegido;
		this.ticketSimplificado = null;
		bolsaDeTrabajo = BolsaDeTrabajo.getInstancia();
	}

	public void agregarTicketSimplificadoIncompatible(TicketSimplificado ticketSimplificado) {
    	ticketsSimplificadosIncompatibles.add(ticketSimplificado);
    }
    
	public TicketSimplificado getTicketSimplificado() {
		return ticketSimplificado;
	}

	public void setTicketSimplificado(TicketSimplificado ticketSimplificado) {
		this.ticketSimplificado = ticketSimplificado;
	}
	
	public ILocacion getLocacionElegida() {
		return locacionElegida;
	}

	public IRubro getRubroElegido() {
		return rubroElegido;
	}

	public void setPuedeSacarTicket(boolean puedeSacarTicket) {
		this.puedeSacarTicket = puedeSacarTicket;
	}

	@Override
	public void run() {
		int i = 0;
		Util.espera(3000);
		while(i < 10 && ticketSimplificado == null) {
			if(!puedeSacarTicket) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			bolsaDeTrabajo.sacaTicketSimplificado(this);
			Util.espera(3000);
			bolsaDeTrabajo.analizaTicketSimplificado(this);
			
			i++;
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		puedeSacarTicket = true;
		notifyAll();
	}

}
