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

public class SuspendidoState implements IState
{
	private Ticket ticket;
	
	
	
	
	public SuspendidoState(Ticket ticket)
	{
		super();
		this.ticket = ticket;
	}

	@Override
	public void suspender()throws CambioDeEstadoFallidoException
	{
		throw new CambioDeEstadoFallidoException("No se puede suspender un ticket suspendido");

	}

	@Override
	public void cancelar()
	{
		
		this.ticket.setEstado(new CanceladoState(this.ticket));

	}

	@Override
	public void finalizar()
	{
		

	}

	@Override
	public void modificarTicket_Formulario( FormularioDeBusqueda form)
	{
		
		this.ticket.setFormularioDeBusqueda(form);
		
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
		
		return "lo sentimos "+((Persona_EmpleadoPretenso) usuario).getNya()+", no fuiste contratado/a por ninguna empresa";
	}

	@Override
	public void seteaResultado(Persona_EmpleadoPretenso empleadoElegido)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activar()
	{
		this.ticket.setEstado(new ActivoState(this.ticket));
		
	}

	@Override
	public String visualizarCostoServicio(Persona usuario)
	{
		
		return "ticket no finalizado";
	}

	
}
