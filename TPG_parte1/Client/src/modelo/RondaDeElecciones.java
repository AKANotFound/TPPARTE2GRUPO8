package modelo;

import java.util.ArrayList;
import java.util.random.*;

public class RondaDeElecciones {
	
	private ArrayList <Persona_Empleador> empleadores =  Agencia.getInstancia().getEmpleadores();
	private ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().getEmpleadosPretensos();
	
	public void iniciaRondaDeElecciones ()
	{
		Ticket_BusquedaEmpleado ticket_empleador;
		int cantSolicitados=0;
		Persona_Empleador empleador;
		Persona_EmpleadoPretenso empleadoPretenso;
		int i;
		
		
		for (i=0; i<empleadores.size(); i++)
		{
			empleador = empleadores.get(i);
			int cantActual = 0; //atributo para verificar que no se supere el tama�no de la lista de asignacion
			ticket_empleador = (Ticket_BusquedaEmpleado) empleador.getTicket();
			cantSolicitados = ticket_empleador.getCantEmpleadosSolicitados();
			
			while (cantActual < empleador.getListaDeAsignacion().size() && cantActual < cantSolicitados)
			{
				//empleadoPretenso = (Persona_EmpleadoPretenso) empleador.getListaDeAsignacion().get(cantActual).getPersona();
				//empleador.agregaElegidos(empleadoPretenso);
				empleador.agregaElegidos(empleador.getListaDeAsignacion().get(cantActual));
				cantActual ++;
			}
		}
		for (i = 0; i<empleadosPretensos.size(); i++)
		{
			empleadoPretenso = empleadosPretensos.get(i);
			int empleadorElegido = (int)(Math.random()*empleadoPretenso.getListaDeAsignacion().size());;
			empleadoPretenso.setElegido(empleadoPretenso.getListaDeAsignacion().get(empleadorElegido));  
		}
	}
}
