package entidades;

import tablas.ILocacion;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;
import util.Util;

public class Simulacion_Empleador extends Persona_Empleador implements Runnable {
	
	private BolsaDeTrabajo bolsaDeTrabajo;
	private String estado = null;
	
	
	public Simulacion_Empleador(String razonSocial) {
		super(null, razonSocial, null, null, null);
		bolsaDeTrabajo = BolsaDeTrabajo.getInstancia();
		
	}	
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		
		return this.getRazonSocial()+"\n";
	}

	@Override
	public void run() {
		ILocacion locacion = null;
		IRubro rubro = null;
		int opcion = 0;
		TicketSimplificado ticketSimplificado=null;
		int i = 0;
		Util.espera(10000);
		while( i < 3 && bolsaDeTrabajo.isSimulacionFinalizada() == false) {
			opcion = (int)(Math.random()*3+1);
			
			switch(opcion) {
			case 1: locacion = new Locacion_Presencial();
				break;
			case 2: locacion = new Locacion_HomeOffice() ;
				break;
			case 3: locacion = new Locacion_Indistinto();
				break;
			}
			
			opcion = (int)(Math.random()*3+1);
			
			switch(opcion) {
			case 1: rubro = new Rubro_ComercioLocal();
				break;
			case 2: rubro =  new Rubro_ComercioInternacional();
				break;
			case 3: rubro = new Rubro_Salud();
				break;
			}
			
			ticketSimplificado= new TicketSimplificado(locacion, rubro, this);
			bolsaDeTrabajo.poneTicketSimplificado(ticketSimplificado);
			
			this.setChanged();
		    this.notifyObservers(this.estado);
		    Util.espera(7500);
		    i++;
		}
	}
}
