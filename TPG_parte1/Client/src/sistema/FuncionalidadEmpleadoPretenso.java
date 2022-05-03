package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Ticket;
import entidades.Ticket_EmpleadoPretenso;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {

	public FuncionalidadEmpleadoPretenso(Persona persona) {
		super(persona);
	}

	public void crearTicket(Persona_EmpleadoPretenso empleadoPretenso, FormularioDeBusqueda formulario) {
		Sistema.crearTicket(empleadoPretenso, formulario);
	}
	
	public void cancelarTicket(Persona persona) {
		super.cancelarTicket(persona);
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) persona);
	}

	@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) persona);
	}
	public void modificarTelefono(Persona_EmpleadoPretenso empleadoPretenso, String telefono) {
		empleadoPretenso.setTelefono(telefono);
	}
	
	void resultadoExito(Persona_EmpleadoPretenso empleadoPretenso) {
		Ticket ticket = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticket.setEstado("exito");
	}
	
	void resultadoFracaso(Persona_EmpleadoPretenso empleadoPretenso) {
		Ticket ticket = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticket.setEstado("fracaso");
	}
}
