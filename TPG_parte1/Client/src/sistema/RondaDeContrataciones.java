package sistema;

import java.util.ArrayList;

import entidades.Agencia;
import entidades.PersonaAsignada;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket;
import entidades.Ticket_EmpleadoPretenso;
import entidades.Ticket_Empleador;

abstract class RondaDeContrataciones {
	
	static void iniciaRondaDeContrataciones () {		
		ArrayList <Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
		for (int i = 0; i< empleadores.size(); i++)
		{
			ArrayList<PersonaAsignada> elegidos = empleadores.get(i).getElegidos();
			ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = new ArrayList<Persona_EmpleadoPretenso>();
			Persona_Empleador empleador = empleadores.get(i);
			for (int j=0; j<elegidos.size();j++) 
			{
				Persona_EmpleadoPretenso empleadoElegido = (Persona_EmpleadoPretenso) elegidos.get(j).getPersona();
				Ticket ticketEmpleadoElegido = (Ticket_EmpleadoPretenso) empleadoElegido.getTicket();
				if (empleador.equals(empleadoElegido.getElegido().getPersona())) {
					empleadosPretensos.add(empleadoElegido);
					Ticket_Empleador ticket = (Ticket_Empleador) empleador.getTicket();
					ticket.setCantEmpleadosObtenidos(ticket.getCantEmpleadosObtenidos()+1);
					Sistema.finalizarTicket(empleadoElegido);
					Sistema.empleadoPretenso.resultadoExito(empleadoElegido);
				}
				else if(ticketEmpleadoElegido.getEstado().equals("en proceso")) {
					Sistema.empleadoPretenso.resultadoFracaso(empleadoElegido);
				}
			}
			Sistema.agregarContrato(empleador, empleadosPretensos);
		}
	}
}

