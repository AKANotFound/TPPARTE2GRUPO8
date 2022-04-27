package modelo;

import java.util.ArrayList;

public class RondaDeContrataciones {
	
	public void calculoCoincidencias ()
	{
		ArrayList <Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
		for (int i= 0; i< empleadores.size(); i++)
		{
			ArrayList<PersonaAsignada> elegidos = empleadores.get(i).getElegidos();
			Persona_Empleador empleador = empleadores.get(i);
			for (int j=0; j<elegidos.size();j++) 
			{
				Persona_EmpleadoPretenso empleadoElegido = (Persona_EmpleadoPretenso) elegidos.get(j).getPersona();
				if (empleador.equals(empleadoElegido.getElegido().getPersona()))
				{
					Ticket_BusquedaEmpleado ticket = (Ticket_BusquedaEmpleado) empleador.getTicket();
					ticket.setCantEmpleadosObtenidos(ticket.getCantEmpleadosObtenidos()+1);
					Sistema.getInstancia().finalizar(empleadoElegido.getTicket());
					
				}
			}
		}
	}
	
}

