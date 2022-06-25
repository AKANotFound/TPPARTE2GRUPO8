package patronState;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket;
import entidades.Usuario;
import excepciones.CambioDeEstadoFallidoException;
import excepciones.ModificacionTicketInvalidaException;
import sistema.Sistema;

public class CanceladoState implements IState
{
	private Ticket ticket;
	
	public CanceladoState() {
		
	}
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public CanceladoState(Ticket ticket)
	{
		super();
		this.ticket = ticket;
	}
	
	@Override
	public void suspender() throws CambioDeEstadoFallidoException
	{
		 
		throw new CambioDeEstadoFallidoException("No se puede suspender un ticket cancelado");

	}

	@Override
	public void cancelar() throws CambioDeEstadoFallidoException
	{
		
		throw new CambioDeEstadoFallidoException("No se puede cancelar un ticket cancelado");

	}

	@Override
	public void finalizar()
	{
		
		//un ticket cancelado no se puede finalizar

	}

	@Override
	public void modificarTicket_Formulario( FormularioDeBusqueda form)throws ModificacionTicketInvalidaException
	{
		
	 throw new ModificacionTicketInvalidaException("No se puede modificar un ticket cancelado");
		
	}

	@Override
	public void generaListaDeAsignacion(Persona_Empleador empleador, Persona_EmpleadoPretenso empleadoP,
			GregorianCalendar fecha, ArrayList<Persona_EmpleadoPretenso> empleadosPretensos)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comparaFormularios(Persona_EmpleadoPretenso empleadoP, Persona_Empleador empleador)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public String visualizaResultado(Usuario usuario)
	{
		
		return "lo sentimos "+((Persona_EmpleadoPretenso) usuario).getNya()+", no fuiste contratado/a por ninguna empresa";
	}

	@Override
	public void seteaResultado(Persona_EmpleadoPretenso empleadoElegido)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activar() throws CambioDeEstadoFallidoException
	{
		throw new CambioDeEstadoFallidoException("No se puede activar un ticket cancelado");
		
	}


	@Override
	public String visualizarCostoServicio(Persona usuario)
	{
		
		return "$" + ((Persona) usuario).getCostoServicio();
	}

	@Override
	public String toString() {
		return "CanceladoState";
	}
	
	
	

}
