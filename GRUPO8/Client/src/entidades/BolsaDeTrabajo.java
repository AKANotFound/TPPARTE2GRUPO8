package entidades;

import java.util.ArrayList;

public class BolsaDeTrabajo {
    private ArrayList<TicketSimplificado> bolsaDeTrabajo = new ArrayList<TicketSimplificado>();
    private static BolsaDeTrabajo instancia = null;
    
    private BolsaDeTrabajo() {}
    
    public static BolsaDeTrabajo getInstancia() {
    	if(instancia == null)
    		instancia = new BolsaDeTrabajo();
    	return instancia;
    }
    
    public synchronized void poneTicketSimplificado(TicketSimplificado ticketSimplificado) {
    	bolsaDeTrabajo.add(ticketSimplificado);
    }
    
    public synchronized void sacaTicketSimplificado(Persona_EmpleadoPretenso empleadoPretenso) {
    	bolsaDeTrabajo.remove(ticketSimplificado);
    	
    }
}
