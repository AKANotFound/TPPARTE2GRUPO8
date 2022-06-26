package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Ticket_EmpleadoPretenso;
import excepciones.CambioDeEstadoFallidoException;
import excepciones.TicketNullException;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) {
		super(empleado);
	}

	public void crearTicket(FormularioDeBusqueda formulario)  
	{
		Ticket_EmpleadoPretenso ticket= (Ticket_EmpleadoPretenso) TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario);
		((Persona) usuario).setTicket(ticket);
		Sistema.agregarTicketEmpleado(ticket);
	}
	
	
	
	@Override
	public void cancelarTicket() throws CambioDeEstadoFallidoException {
		super.cancelarTicket();
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) usuario);
	}

	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) usuario);
	}
	
	@Override
	public String visualizaResultado() throws TicketNullException {
		if(((Persona_EmpleadoPretenso)usuario).getTicket() == null)
			throw new TicketNullException("No se puede visualizar resultado si no se tiene un ticket");
		return ((Persona_EmpleadoPretenso)usuario).getTicket().visualizaResultado(usuario);
	}

	@Override
	public String visualizarPersonasElegidas() {
		return ((Persona_EmpleadoPretenso) usuario).getNya() + " eligio a: [" + ((Persona_EmpleadoPretenso) usuario).getEmpleadorElegido() + "]";
	}

	public String getNya() {
		return ((Persona_EmpleadoPretenso) usuario).getNya();
	}	
}
