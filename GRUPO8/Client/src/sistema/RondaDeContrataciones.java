package sistema;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import entidades.Agencia;
import entidades.PersonaElegida;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket;
import entidades.Ticket_EmpleadoPretenso;
import entidades.Ticket_Empleador;
import excepciones.RondaDeEncuentrosLaboralesNoIniciadaException;

abstract class RondaDeContrataciones
{

	static void iniciaRondaDeContrataciones () throws RondaDeEncuentrosLaboralesNoIniciadaException {
		
		if (Sistema.isInicioRondaEncuentrosLaborales()==false)
			throw new RondaDeEncuentrosLaboralesNoIniciadaException();
		else
		{
		
			GregorianCalendar fechaDeCreacion=new GregorianCalendar();
			ArrayList <Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
			for (int i = 0; i< empleadores.size(); i++)
			{
				ArrayList<PersonaElegida> elegidos = empleadores.get(i).getEmpleadosElegidos();
				ArrayList<Persona_EmpleadoPretenso> empleadosPretensosContrato = new ArrayList<Persona_EmpleadoPretenso>();
				Persona_Empleador empleador = empleadores.get(i);
				Ticket_Empleador ticketEmpleador = (Ticket_Empleador) empleador.getTicket();
				for (int j=0; j<elegidos.size();j++) 
				{
					Persona_EmpleadoPretenso empleadoElegido = (Persona_EmpleadoPretenso) elegidos.get(j).getPersona();
					Ticket ticketEmpleadoElegido = (Ticket_EmpleadoPretenso) empleadoElegido.getTicket();
					if (empleador.equals(empleadoElegido.getEmpleadorElegido().getPersona())) {
						ticketEmpleador.setCantEmpleadosObtenidos(ticketEmpleador.getCantEmpleadosObtenidos()+1);
						Sistema.finalizarTicket(empleadoElegido);
						Sistema.calculaComision(empleadoElegido);
						Sistema.resultadoExito(empleadoElegido);
						empleadosPretensosContrato.add(empleadoElegido);
						empleador.addEmpleadoContratado(empleadoElegido);
						empleadoElegido.setEmpleadorActual(empleador);
					}
					else if(ticketEmpleadoElegido.getEstado().equals("en proceso")) {
						Sistema.resultadoFracaso(empleadoElegido);
					}
				} 
				
				if(ticketEmpleador.getCantEmpleadosObtenidos() == ticketEmpleador.getCantEmpleadosSolicitados()) {
					Sistema.finalizarTicket(empleador);
					Sistema.calculaComision(empleador);
				}
				
				if(!empleadosPretensosContrato.isEmpty())
					Sistema.agregarContrato(empleador, empleadosPretensosContrato,fechaDeCreacion);
				else
					Sistema.puntajeNoElegido(empleador);
			} 
			Sistema.setInicioRondaEncuentrosLaborales(false);
		 }
	}
}
