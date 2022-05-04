package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket;
import entidades.Ticket_EmpleadoPretenso;
import entidades.Ticket_Empleador;

public abstract class TicketFactory {

	static Ticket crearTicket(Persona_Empleador empleador, FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		return new Ticket_Empleador(formulario, cantEmpleadosSolicitados);
	}
	
	static Ticket crearTicket(Persona_EmpleadoPretenso empleadoPretenso, FormularioDeBusqueda formulario) {
		return new Ticket_EmpleadoPretenso(formulario);
	}
}
