package entidades;

import java.util.ArrayList;
import java.util.Observable;

public class BolsaDeTrabajo extends Observable{
    private ArrayList<TicketSimplificado> bolsaDeTrabajo = new ArrayList<TicketSimplificado>();
    private static BolsaDeTrabajo instancia = null;
    
    private boolean ocupado = false;
    
    private BolsaDeTrabajo() {}
    
    public static BolsaDeTrabajo getInstancia() {
    	if(instancia == null)
    		instancia = new BolsaDeTrabajo();
    	return instancia;
    }
    
    public void poneTicketSimplificado(Simulacion_Empleador empleador,TicketSimplificado ticketSimplificado) {
    	System.out.println(empleador.getRazonSocial()+" añade un ticket a la bolsa de trabajo");
    	bolsaDeTrabajo.add(ticketSimplificado);
    	this.setChanged();
    	this.notifyObservers();
    }
    
    public synchronized void sacaTicketSimplificado(Simulacion_EmpleadoPretenso empleadoPretenso) {
    	TicketSimplificado ticketElegido = empleadoPretenso.getTicketSimplificado();
    	int i = 0;
    	
    	while(ocupado) {
    		System.out.println(empleadoPretenso.getNya()+" intento sacar un ticket y no pudo, espera");
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	System.out.println(empleadoPretenso.getNya()+" saco ticket");
    	ocupado = true;
    	while(i < bolsaDeTrabajo.size() && ticketElegido == null) {
    		
    		
    		if(bolsaDeTrabajo.get(i).getRubro().getClass()==empleadoPretenso.getRubroElegido().getClass()) { //COMPARA CLASES, MEJOR SOBREESCRIBIR EQUALS Y COMPARAR ATRIBUTO?
    			empleadoPretenso.setTicketSimplificado(bolsaDeTrabajo.get(i));
    			bolsaDeTrabajo.remove(i);
    		}
    		else
    			i++;
    	}
    	if(i == bolsaDeTrabajo.size()) {
    		empleadoPretenso.setPuedeSacarTicket(false);
    	}
    }
    
    public synchronized void analizaTicketSimplificado(Simulacion_EmpleadoPretenso empleadoPretenso) {
    	
    	System.out.println("el ticket de "+empleadoPretenso.getNya()+" esta siendo analizado");
    	if(empleadoPretenso.getLocacionElegida().getClass()!=empleadoPretenso.getTicketSimplificado().getLocacion().getClass()) { //si las locaciones son distintas
    		System.out.println(empleadoPretenso.getNya()+" devuelve ticket por no ser compatible");
    		bolsaDeTrabajo.add(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.agregarTicketSimplificadoIncompatible(empleadoPretenso.getTicketSimplificado());
    		empleadoPretenso.setTicketSimplificado(null);
    	}
    	else
    		System.out.println(empleadoPretenso.getNya()+" tuvo exito con el ticket, se lo queda");
    	ocupado = false;
    	notifyAll();
    }
}
