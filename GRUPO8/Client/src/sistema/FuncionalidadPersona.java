package sistema;

import entidades.FormularioDeBusqueda;
import entidades.ListaDeAsignacion;
import entidades.Persona;
import excepciones.CambioDeEstadoFallidoException;
import excepciones.ListaNoGeneradaException;
import excepciones.ModificacionTicketInvalidaException;
import excepciones.TicketNullException;

public abstract class FuncionalidadPersona extends FuncionalidadUsuario{

	private Persona persona=((Persona)usuario);
	public FuncionalidadPersona(Persona persona) {
		super(persona);
	}

	public void suspenderTicket() throws CambioDeEstadoFallidoException
	   {
		  persona.getTicket().suspender();
		  
	   }
	   public void cancelarTicket() throws CambioDeEstadoFallidoException
	   {
		   persona.getTicket().cancelar(); 
	   }
	   
	  public void modificarTicket_Formulario(FormularioDeBusqueda form) throws ModificacionTicketInvalidaException
	   {
		   persona.getTicket().modificarTicket_Formulario(form);  
	   }
	
	public void activarTicket() throws CambioDeEstadoFallidoException
	{
		persona.getTicket().activar();
	}
	
	public String visualizarListaAsignacion() throws ListaNoGeneradaException {
		String str = null;
		
		if (persona.getListaDeAsignacion() != null)
			str = "" + ((Persona) usuario).getListaDeAsignacion();
		else
			throw new ListaNoGeneradaException();
		return str;
	}
	
	public ListaDeAsignacion getListaDeAsignacion()
	{
		return persona.getListaDeAsignacion();
	}
	
	
	public String visualizarCostoServicio()
	{
		
		return persona.getTicket().visualizarCostoServicio(persona);
	}
	
	public abstract String visualizaResultado() throws TicketNullException;
	public abstract String visualizarPersonasElegidas();
} 
