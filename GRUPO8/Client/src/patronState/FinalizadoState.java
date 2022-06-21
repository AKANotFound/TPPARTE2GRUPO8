package patronState;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket;
import entidades.Ticket_EmpleadoPretenso;
import entidades.Usuario;
import excepciones.ModificacionTicketInvalidaException;

public class FinalizadoState implements IState
{
	private Ticket ticket;
	
	public FinalizadoState() {
		
	}
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public FinalizadoState(Ticket ticket)
	{
		super();
		this.ticket = ticket;
	}
	
	
	@Override
	public void suspender()
	{
		//un ticket finalizado no se puede suspender

	}

	@Override
	public void cancelar()
	{
		//un ticket finalizado no se puede cancelar

	}

	@Override
	public void finalizar()
	{
		//un ticket finalizado no se puede finalizar

	}

	@Override
	public void modificarTicket_Formulario(FormularioDeBusqueda form) throws ModificacionTicketInvalidaException
	{
		throw new ModificacionTicketInvalidaException("no se puede modificar un ticket finalizado");
		
	}


	@Override
	public void comparaFormularioEmpleador(Persona_Empleador empleador, Persona_EmpleadoPretenso empleadoP,
			GregorianCalendar fecha, ArrayList<Persona_EmpleadoPretenso> empleadosPretensos)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void comparaFormularioEmpleadoPretenso(Persona_EmpleadoPretenso empleadoP, Persona_Empleador empleador)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public String visualizaResultado(Usuario usuario)
	{
		
		return ((Persona_EmpleadoPretenso) usuario).getNya()+", fuiste contratado por: "+((Persona_EmpleadoPretenso) usuario).getEmpleadorActual().getRazonSocial();
	}


	@Override
	public void seteaResultado(Persona_EmpleadoPretenso empleadoPretenso)
	{
		Ticket_EmpleadoPretenso ticket = (Ticket_EmpleadoPretenso)empleadoPretenso.getTicket();
		ticket.setResultado("exito");
		
	}


	@Override
	public void activar()
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public String visualizarCostoServicio(Persona usuario)
	{
		
		return "$" + ((Persona) usuario).getCostoServicio();
	}

	@Override
	public String toString() {
		return "FinalizadoState";
	}
	

}
