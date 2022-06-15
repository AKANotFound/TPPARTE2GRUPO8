package entidades;

import tablas.ILocacion;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public class Simulacion_Empleador extends Persona_Empleador implements Runnable {
	
	private BolsaDeTrabajo bolsaDeTrabajo;
	private TicketSimplificado ticketSimplificado;

	public Simulacion_Empleador(String razonSocial) {
		super(null, razonSocial, null, null, null);
		bolsaDeTrabajo = BolsaDeTrabajo.getInstancia();
		ticketSimplificado = null;
	}
	
	public TicketSimplificado getTicketSimplificado() {
		return ticketSimplificado;
	}

	public void setTicketSimplificado(TicketSimplificado ticketSimplificado) {
		this.ticketSimplificado = ticketSimplificado;
	}

	@Override
	public void run() {
		ILocacion locacion = null;
		IRubro rubro = null;
		int opcion = 0;
		
		for(int i = 0; i < 3; i++) {
			opcion = (int)(Math.random()*3+1);
			
			switch(opcion) {
			case 1: locacion = Locacion_Presencial.getInstancia();
				break;
			case 2: locacion = Locacion_HomeOffice.getInstancia() ;
				break;
			case 3: locacion = Locacion_Indistinto.getInstancia();
				break;
			}
			
			opcion = (int)(Math.random()*3+1);
			
			switch(opcion) {
			case 1: rubro = Rubro_ComercioLocal.getInstancia();
				break;
			case 2: rubro = Rubro_ComercioInternacional.getInstancia();
				break;
			case 3: rubro = Rubro_Salud.getInstancia();
				break;
			}
			
			this.ticketSimplificado = new TicketSimplificado(locacion, rubro, this);
			
			bolsaDeTrabajo.poneTicketSimplificado(this);
		}
	}
}
