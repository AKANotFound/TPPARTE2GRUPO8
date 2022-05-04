package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Usuario;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {

	public FuncionalidadEmpleadoPretenso(Usuario usuario) {
		super(usuario);
	}

	public void crearTicket(FormularioDeBusqueda formulario) {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
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
}
