package modelo;

import java.util.ArrayList;
import java.util.random.*;

public class RondaDeElecciones {
	
	
	
	public static void iniciaRondaDeElecciones ()
	{
		 ArrayList <Persona_Empleador> empleadores =  Agencia.getInstancia().getEmpleadores();
		 ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().getEmpleadosPretensos();
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
			
			while (cantActual < empleador.getListaDeAsignacion().getLista().size() && cantActual < cantSolicitados)
			{
				int empleadoElegido=(int)(Math.random()*empleador.getListaDeAsignacion().getLista().size());
				empleador.agregaElegidos(empleador.getListaDeAsignacion().getLista().get(empleadoElegido));
				cantActual ++;
			}
		}
		for (i = 0; i<empleadosPretensos.size(); i++)
		{
			empleadoPretenso = empleadosPretensos.get(i);
			int empleadorElegido = (int)(Math.random()*empleadoPretenso.getListaDeAsignacion().getLista().size());
			if (empleadoPretenso.getListaDeAsignacion().getLista()!=null)
			empleadoPretenso.setElegido(empleadoPretenso.getListaDeAsignacion().getLista().get(empleadorElegido));  
		}
	}
}
