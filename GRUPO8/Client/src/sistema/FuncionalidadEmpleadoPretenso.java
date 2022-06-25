package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import excepciones.CambioDeEstadoFallidoException;
import excepciones.ModificacionTicketInvalidaException;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) {
		super(empleado);
	}

	public void crearTicket(FormularioDeBusqueda formulario)  {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
		
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
	public String visualizaResultado() {
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
