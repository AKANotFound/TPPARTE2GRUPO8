package entidades;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import tablas.ILocacion;
import util.Util;

public class Simulacion_EmpleadoPretenso extends Persona_EmpleadoPretenso implements Runnable,Observer{
	
	private TicketSimplificado ticketSimplificado;
	private BolsaDeTrabajo bolsaDeTrabajo;
	private ArrayList<TicketSimplificado> ticketsSimplificadosIncompatibles = new ArrayList<TicketSimplificado>();
	private ILocacion locacionElegida;
	private IRubro rubroElegido;
	private boolean puedeSacarTicket;
	
	public Simulacion_EmpleadoPretenso(Cuenta cuenta, String nya, String telefono, int edad, ILocacion locacionElegida, IRubro rubroElegido) {
		super(cuenta, nya, telefono, edad);
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

	@Override
	public void run() {
		int i = 0;
		while(i < 10 && ticketSimplificado != null) {
			while(!puedeSacarTicket) {
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
			puedeSacarTicket = false;
			i++;
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		puedeSacarTicket = true;
		notifyAll();
	}

}
