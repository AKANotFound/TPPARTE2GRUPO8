package entidades;

import java.util.ArrayList;

public class BolsaDeTrabajo {
    private ArrayList<TicketSimplificado> bolsaDeTrabajo = new ArrayList<TicketSimplificado>();
    private static BolsaDeTrabajo instancia = null;
    
    private boolean atendiendo = false;
    
    private BolsaDeTrabajo() {}
    
    public static BolsaDeTrabajo getInstancia() {
    	if(instancia == null)
    		instancia = new BolsaDeTrabajo();
    	return instancia;
    }
    
    public synchronized void poneTicketSimplificado(TicketSimplificado ticketSimplificado) {
    	bolsaDeTrabajo.add(ticketSimplificado);
    	notifyAll(); //ver si reemplazar por observador
    }
    
    public synchronized void sacaTicketSimplificado(Persona_EmpleadoPretenso empleadoPretenso) {
    	while(atendiendo) {
    		try {
    			wait();
    		}
    		catch () {
    			
    		}
    	}
    	bolsaDeTrabajo.remove(ticketSimplificado);
    }
    
    public synchronized void analizaTicketSimplificado(Persona_EmpleadoPretenso empleadoPretenso) {
    	if(!=) { //si las locaciones son distintas
    		poneTicketSimplificado(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.setTicketSimplificado(null);
    	}
    	atendiendo = false;
    	notifyAll();
    }
}
