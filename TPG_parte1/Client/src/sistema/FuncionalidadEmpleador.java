package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;
import entidades.Usuario;

public class FuncionalidadEmpleador extends FuncionalidadPersona {

	private Persona_Empleador empleador;
	
	
	public FuncionalidadEmpleador(Persona_Empleador empleador) {
		super();
		this.empleador = empleador;
	}
	
	/*public FuncionalidadEmpleador(Usuario usuario) {
		super(usuario);
	}*/
	public FuncionalidadEmpleador() {
		// TODO Auto-generated constructor stub
	}

	
	public Persona_Empleador getEmpleador() {
		return empleador;
	}

	public void crearTicket(FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		//((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_Empleador) usuario, formulario, cantEmpleadosSolicitados));
		empleador.setTicket(TicketFactory.crearTicket(empleador, formulario, cantEmpleadosSolicitados));
	}
	
	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleador(this.empleador);
	}
	
	@Override
	public String toString() {
		
		return "Funcionalidad Empleador";
	}
}
