package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Usuario;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {

	private Persona_EmpleadoPretenso empleado;
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) 
	{
		this.empleado = empleado;
	}
	
	/*public FuncionalidadEmpleadoPretenso(Usuario usuario) {
		super(usuario);
		// TODO Auto-generated constructor stub
	}*/
	
	public FuncionalidadEmpleadoPretenso() {
		
	} 
	
	
	public Persona_EmpleadoPretenso getEmpleado() {
		return empleado;
	}

	public void crearTicket(FormularioDeBusqueda formulario) {
		//((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
		empleado.setTicket(TicketFactory.crearTicket(empleado, formulario));
	}
	
	public void cancelarTicket(Persona persona) {
		super.cancelarTicket(persona);
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) persona);
	}

	/*@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) persona);
	}*/
	
	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso(this.empleado);
	}
	public void modificarTelefono(Persona_EmpleadoPretenso empleadoPretenso, String telefono) {
		empleadoPretenso.setTelefono(telefono);
	}
	@Override
	public String toString() {
		
		return "Funcionalidad Empleado Pretenso ";
	}
	
}
