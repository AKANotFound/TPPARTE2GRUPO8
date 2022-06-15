package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import excepciones.ModificacionTicketInvalidaException;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) {
		super(empleado);
	}

	public void crearTicket(FormularioDeBusqueda formulario)  {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
		
	}
	
	@Override
	public void cancelar() {
		super.cancelar();
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) usuario);
	}

	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) usuario);
	}
	
	public void modificarTelefono(String telefono) {
		((Persona_EmpleadoPretenso) usuario).setTelefono(telefono);
		
	}
	
	@Override
	public String visualizaResultado() {
		
		return ((Persona_EmpleadoPretenso)usuario).getTicket().visualizaResultado(usuario);
	
	}
	

	@Override
	public String visualizarPersonasElegidas() {
		return ((Persona_EmpleadoPretenso) usuario).getNya() + " eligio a: [" + ((Persona_EmpleadoPretenso) usuario).getEmpleadorElegido() + "]";
	}

	@Override
	public String visualizarPersona() {
		return ((Persona_EmpleadoPretenso) usuario).getNya();
	}	
}
