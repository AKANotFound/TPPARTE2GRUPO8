package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;
import factory.TicketFactory;

public class FuncionalidadEmpleador extends FuncionalidadPersona {
	
	public static void crearTicket(Persona_Empleador empleador, FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		empleador.setTicket(TicketFactory.crearTicket(empleador, formulario, cantEmpleadosSolicitados));
	}

	@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleador((Persona_Empleador) persona);
	}
	
	
}
