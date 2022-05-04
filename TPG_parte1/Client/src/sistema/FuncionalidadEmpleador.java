package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;
import entidades.Usuario;

public class FuncionalidadEmpleador extends FuncionalidadPersona {

	public FuncionalidadEmpleador(Usuario usuario) {
		super(usuario);
	}

	public void crearTicket(FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_Empleador) usuario, formulario, cantEmpleadosSolicitados));
	}

	@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleador((Persona_Empleador) persona);
	}
}
