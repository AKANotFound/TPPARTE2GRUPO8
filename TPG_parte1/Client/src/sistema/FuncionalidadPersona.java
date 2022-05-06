package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Usuario;
import excepciones.ListaNoGeneradaException;
import excepciones.ModificacionTicketInvalidaException;

public abstract class FuncionalidadPersona extends FuncionalidadUsuario{

	protected Persona persona;
	public FuncionalidadPersona() {
		super();
	}
	public FuncionalidadPersona(Persona persona) {
		this.persona=persona;
	}

	public void activarTicket() {
		this.persona.getTicket().setEstado("activado");
	}
	
	public void suspenderTicket() throws ModificacionTicketInvalidaException {
		if (Sistema.isInicioRondaEncuentrosLaborales()==false)
		  this.persona.getTicket().setEstado("suspendido");
		else
			throw new ModificacionTicketInvalidaException("no se puede suspender el ticket una vez iniciada la ronda de encuentros laborales");
	}
	
	public void cancelarTicket() throws ModificacionTicketInvalidaException {
		if (Sistema.isInicioRondaEncuentrosLaborales()==false)
		 this.persona.getTicket().setEstado("cancelado");	
		else
			throw new ModificacionTicketInvalidaException("no se puede cancelar el ticket una vez iniciada la ronda de encuentros laborales");
	}
	
	public void modificarTicket_Formulario(FormularioDeBusqueda form) {
		this.persona.getTicket().setFormularioDeBusqueda(form);
	}
	
	public abstract void iniciarRondaEleccion();
	
	public void visualizarListaAsignacion() throws ListaNoGeneradaException {
		if (!this.persona.getListaDeAsignacion().getLista().isEmpty())
		  System.out.println(persona.getListaDeAsignacion());
		else
			throw new ListaNoGeneradaException();
	}
	
	public void visualizarCostoServicio() {
		System.out.println(this.persona.getCostoServicio());
	}
	
	
	public abstract void visualizaResultado();
	
} 
