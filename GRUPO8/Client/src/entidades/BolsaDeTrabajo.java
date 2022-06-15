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
    	System.out.println("[" + ticketSimplificado.getEmpleador().getRazonSocial() + "] puso ticket en la bolsa");
    	//notificar observer parte visual
    	notifyAll();
    }
    
    public synchronized void sacaTicketSimplificado(Simulacion_EmpleadoPretenso empleadoPretenso) {
    	System.out.println("[" + empleadoPretenso.getNya() + "] intenta sacar ticket de la bolsa");
    	
    	int i = 0;
    	while(i < bolsaDeTrabajo.size() && empleadoPretenso.getTicketSimplificado() == null) 
    	{
    		if(bolsaDeTrabajo.get(i).getRubro().equals(empleadoPretenso.getRubroElegido()) && !empleadoPretenso.getTicketsSimplificadosIncompatibles().contains(bolsaDeTrabajo.get(i))) { //compara rubro, sobreescribir equals
    			empleadoPretenso.setTicketSimplificado(bolsaDeTrabajo.get(i));
    			bolsaDeTrabajo.remove(i);
    			System.out.println("[" + empleadoPretenso.getNya() + "] saco ticket de la bolsa");
    		}
    		else 
    		{
    			if(i == bolsaDeTrabajo.size()-1) 
    			{
    				try
    			 	{
    				  System.out.println("[" + empleadoPretenso.getNya() + "] reviso toda la bolsa y no encontro ticket compatible (por el rubro), espera");
					  wait();
					  i = 0;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    			else
        			i++;
    		}
    	}
    }
    
    public synchronized void analizaTicketSimplificado(Simulacion_EmpleadoPretenso empleadoPretenso) {
    	if(!empleadoPretenso.getLocacionElegida().equals(empleadoPretenso.getTicketSimplificado().getLocacion())) { //si las locaciones son distintas
    		bolsaDeTrabajo.add(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.agregarTicketSimplificadoIncompatible(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.setTicketSimplificado(null);
    		System.out.println("[" + empleadoPretenso.getNya() + "] analizo el ticket y no es compatible (por la locacion), devuelve el ticket");
    		notifyAll();
    	}
    }
}
