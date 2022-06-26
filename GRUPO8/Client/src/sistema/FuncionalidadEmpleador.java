package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;
import entidades.Ticket_Empleador;
import excepciones.CambioDeEstadoFallidoException;

public class FuncionalidadEmpleador extends FuncionalidadPersona {	
	
	public FuncionalidadEmpleador(Persona_Empleador empleador) {
		super(empleador);
	}

	public void crearTicket(FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) 
	{
		Ticket_Empleador ticket = (Ticket_Empleador) TicketFactory.crearTicket((Persona_Empleador) usuario, formulario, cantEmpleadosSolicitados);
		((Persona) usuario).setTicket(ticket);
		Sistema.agregarTicketEmpleador(ticket);
	}

	@Override
	public String visualizaResultado() {
		String str = "";
		if (!((Persona_Empleador) usuario).getEmpleadosContratados().isEmpty()) {
			str = ((Persona_Empleador) usuario).getRazonSocial()+", contrataste a los siguientes empleados: ";
			for (int i=0;i<((Persona_Empleador) usuario).getEmpleadosContratados().size();i++)
				str += ((Persona_Empleador) usuario).getEmpleadosContratados().get(i).getNya() + ", ";
		}
		else
			str = "Lo sentimos "+((Persona_Empleador) usuario).getRazonSocial()+", no se ha podido generar ningun contrato";
		return str;
	}

	@Override
	public String visualizarPersonasElegidas() {
		return ((Persona_Empleador) usuario).getRazonSocial() + " eligio a: " + ((Persona_Empleador) usuario).getEmpleadosElegidos();
	}

	public String getRazonSocial() {
		return ((Persona_Empleador) usuario).getRazonSocial();
	}
	
	@Override
	public void cancelarTicket() throws CambioDeEstadoFallidoException  {
		super.cancelarTicket();
		Sistema.calculaComision((Persona_Empleador) usuario);
	}
}
