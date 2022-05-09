package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Ticket;
import excepciones.ListaNoGeneradaException;
import excepciones.ModificacionTicketInvalidaException;

public abstract class FuncionalidadPersona extends FuncionalidadUsuario{

	public FuncionalidadPersona(Persona persona) {
		super(persona);
	}

	public void activarTicket() throws ModificacionTicketInvalidaException {

		  if(((Persona)usuario).getTicket()!=null)
		  {	if (!((Persona)usuario).getTicket().getEstado().equalsIgnoreCase("finalizado"))	
		    {  if (!Sistema.isInicioRondaEncuentrosLaborales())
					((Persona) usuario).getTicket().setEstado("activado");	
				else
					throw new ModificacionTicketInvalidaException("no se puede activar el ticket una vez iniciada la ronda de encuentros laborales");
		    }
		  	else
		  		throw new ModificacionTicketInvalidaException("no se puede modificar un ticket finalizado"); 
		  }
		  else
			  throw new ModificacionTicketInvalidaException("no existe ticket para activar");
	}
	
	public void suspenderTicket() throws ModificacionTicketInvalidaException {
		 if(((Persona)usuario).getTicket()!=null)
		 {
			 if (!((Persona)usuario).getTicket().getEstado().equalsIgnoreCase("finalizado"))	
			 {  if (!Sistema.isInicioRondaEncuentrosLaborales())
				((Persona) usuario).getTicket().setEstado("suspendido");	
			else
				throw new ModificacionTicketInvalidaException("no se puede suspender el ticket una vez iniciada la ronda de encuentros laborales");
			 }
			 else
	  		throw new ModificacionTicketInvalidaException("no se puede modificar un ticket finalizado");
		 }
		  else
			  throw new ModificacionTicketInvalidaException("no existe ticket para suspender");
	}
	
	public void cancelarTicket() throws ModificacionTicketInvalidaException {
		
	  if(((Persona)usuario).getTicket()!=null)
	  {	if (!((Persona)usuario).getTicket().getEstado().equalsIgnoreCase("finalizado"))	
	    {  if (!Sistema.isInicioRondaEncuentrosLaborales())
				((Persona) usuario).getTicket().setEstado("cancelado");	
			else
				throw new ModificacionTicketInvalidaException("no se puede cancelar el ticket una vez iniciada la ronda de encuentros laborales");
	    }
	  	else
	  		throw new ModificacionTicketInvalidaException("no se puede modificar un ticket finalizado"); 
	  }
	  else
		  throw new ModificacionTicketInvalidaException("no existe ticket para cancelar");
	}
	
	public void modificarTicket_Formulario(FormularioDeBusqueda form) throws ModificacionTicketInvalidaException {
		if(((Persona)usuario).getTicket()!=null)
		  {	if (!((Persona)usuario).getTicket().getEstado().equalsIgnoreCase("finalizado"))	
		    {  if (!Sistema.isInicioRondaEncuentrosLaborales())
					((Persona) usuario).getTicket().setFormularioDeBusqueda(form);
				else
					throw new ModificacionTicketInvalidaException("no se puede modificar el ticket una vez iniciada la ronda de encuentros laborales");
		    }
		  	else
		  		throw new ModificacionTicketInvalidaException("no se puede modificar un ticket finalizado"); 
		  }
		  else
			  throw new ModificacionTicketInvalidaException("no existe ticket para modificar el formulario");
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
	
	public String visualizarCostoServicio() {
		Ticket ticket = ((Persona) usuario).getTicket();
		if(ticket.getEstado().equals("finalizado") || ticket.getEstado().equals("cancelado"))
			return "$" + ((Persona) usuario).getCostoServicio();
		else
			return "ticket no finalizado";
	}
	
	public abstract String visualizarPersona();
	public abstract String visualizaResultado();
	public abstract String visualizarPersonasElegidas();
} 
