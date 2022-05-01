package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import factory.TicketFactory;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {

	public static void crearTicket(Persona_EmpleadoPretenso empleadoPretenso, FormularioDeBusqueda formulario) {
		empleadoPretenso.setTicket(TicketFactory.crearTicket(empleadoPretenso, formulario));
	}
	
	public void cancelarTicket(Persona persona) {
		super.cancelarTicket(persona);
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) persona);
	}

	@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) persona);
	}
}
