package entidades;

import java.util.ArrayList;

import tablas.ILocacion;
import util.Util;

public class Simulacion_EmpleadoPretenso extends Persona_EmpleadoPretenso implements Runnable{
	
	private TicketSimplificado ticketSimplificado;
	private BolsaDeTrabajo bolsaDeTrabajo; //es el observado
	private ArrayList<TicketSimplificado> ticketsSimplificadosIncompatibles = new ArrayList<TicketSimplificado>();
	private ILocacion locacionElegida;
	private IRubro rubroElegido;
	
	public Simulacion_EmpleadoPretenso(String nya, ILocacion locacionElegida, IRubro rubroElegido) {
		super(null, nya, null, 0);
		this.locacionElegida = locacionElegida;
		this.rubroElegido = rubroElegido;
		this.ticketSimplificado = null;
		bolsaDeTrabajo = BolsaDeTrabajo.getInstancia();
	}
	
	public ArrayList<TicketSimplificado> getTicketsSimplificadosIncompatibles() {
		return ticketsSimplificadosIncompatibles;
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
		while(i < 10 && ticketSimplificado == null) {
			bolsaDeTrabajo.sacaTicketSimplificado(this);
			Util.espera(3000);
			if(ticketSimplificado != null)
				bolsaDeTrabajo.analizaTicketSimplificado(this);
			i++;
		}
	}
}
