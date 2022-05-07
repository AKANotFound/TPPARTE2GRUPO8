package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import excepciones.ListaNoGeneradaException;
import excepciones.ModificacionTicketInvalidaException;

public abstract class FuncionalidadPersona extends FuncionalidadUsuario{

	public FuncionalidadPersona(Persona persona) {
		super(persona);
	}

	public void activarTicket() {
		((Persona) usuario).getTicket().setEstado("activado");
	}
	
	public void suspenderTicket() throws ModificacionTicketInvalidaException {
		if (!Sistema.isInicioRondaEncuentrosLaborales())
		  ((Persona) usuario).getTicket().setEstado("suspendido");
		else
			throw new ModificacionTicketInvalidaException("no se puede suspender el ticket una vez iniciada la ronda de encuentros laborales");
	}
	
	public void cancelarTicket() throws ModificacionTicketInvalidaException {
		if (!Sistema.isInicioRondaEncuentrosLaborales())
			((Persona) usuario).getTicket().setEstado("cancelado");	
		else
			throw new ModificacionTicketInvalidaException("no se puede cancelar el ticket una vez iniciada la ronda de encuentros laborales");
	}
	
	public void modificarTicket_Formulario(FormularioDeBusqueda form) {
		((Persona) usuario).getTicket().setFormularioDeBusqueda(form);
	}
	
	public abstract void iniciarRondaEleccion();
	
	public String visualizarListaAsignacion() throws ListaNoGeneradaException {
		String str = null;
		
		if (((Persona) usuario).getListaDeAsignacion() != null)
			str = "" + ((Persona) usuario).getListaDeAsignacion();
		else
			throw new ListaNoGeneradaException();
		return str;
	}
	
	public void visualizarCostoServicio() {
		System.out.println(((Persona) usuario).getCostoServicio());
	}
	
	public abstract String visualizaResultado();
	public abstract String visualizarPersonasElegidas();
} 
