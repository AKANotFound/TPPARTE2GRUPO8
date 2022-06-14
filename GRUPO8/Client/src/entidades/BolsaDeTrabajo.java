package entidades;

import java.util.ArrayList;

public class BolsaDeTrabajo {
    private ArrayList<TicketSimplificado> bolsaDeTrabajo = new ArrayList<TicketSimplificado>();
    private static BolsaDeTrabajo instancia = null;
    
    private boolean ocupado = false;
    
    private BolsaDeTrabajo() {}
    
    public static BolsaDeTrabajo getInstancia() {
    	if(instancia == null)
    		instancia = new BolsaDeTrabajo();
    	return instancia;
    }
    
    public synchronized void poneTicketSimplificado(Simulacion_Empleador empleador) {
    	bolsaDeTrabajo.add(empleador.getTicketSimplificado());
    	empleador.setTicketSimplificado(null);
    	System.out.println();
    	//notificar observer parte visual
    	notifyAll();
    }
    
    public synchronized void sacaTicketSimplificado(Simulacion_EmpleadoPretenso empleadoPretenso) {
    	TicketSimplificado ticketElegido = empleadoPretenso.getTicketSimplificado();
    	int i = 0;
    	
    	while(ocupado) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	ocupado = true;
    	while(i < bolsaDeTrabajo.size() && ticketElegido == null) {
    		if(bolsaDeTrabajo.get(i).getRubro().equals(empleadoPretenso.getRubroElegido()) && !empleadoPretenso.getTicketsSimplificadosIncompatibles().contains(bolsaDeTrabajo.get(i))) { //compara rubro, sobreescribir equals
    			empleadoPretenso.setTicketSimplificado(bolsaDeTrabajo.get(i));
    			bolsaDeTrabajo.remove(i);
    		}
    		else
    			i++;
    	}
    }
    
    public synchronized void analizaTicketSimplificado(Simulacion_EmpleadoPretenso empleadoPretenso) {
    	if(!empleadoPretenso.getLocacionElegida().equals(empleadoPretenso.getTicketSimplificado().getLocacion())) { //si las locaciones son distintas
    		bolsaDeTrabajo.add(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.agregarTicketSimplificadoIncompatible(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.setTicketSimplificado(null);
    	}
    	ocupado = false;
    	notifyAll();
    }
}
