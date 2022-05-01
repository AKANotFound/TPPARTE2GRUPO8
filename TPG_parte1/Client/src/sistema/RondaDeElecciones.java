package sistema;

import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket_Empleador;

abstract class RondaDeElecciones {	
	
	static void iniciaRondaDeEleccionEmpleadoPretenso(Persona_EmpleadoPretenso empleadoPretenso) {
		int seleccion=(int)(Math.random()*empleadoPretenso.getListaDeAsignacion().getLista().size());
		Sistema.visualizarListaAsignacion(empleadoPretenso);
		empleadoPretenso.setElegido(empleadoPretenso.getListaDeAsignacion().getLista().get(seleccion));
		empleadoPretenso.setEligio(true);
	}
	
	static void iniciaRondaDeEleccionEmpleador(Persona_Empleador empleador) {
		Ticket_Empleador ticketEmpleador = (Ticket_Empleador) empleador.getTicket();
		int cantObtenidos = ticketEmpleador.getCantEmpleadosObtenidos();
		int cantSolicitados = ticketEmpleador.getCantEmpleadosSolicitados();
		int seleccion;
		int i = 0;
		Sistema.visualizarListaAsignacion(empleador);
		while (i < empleador.getListaDeAsignacion().getLista().size() && cantObtenidos < cantSolicitados)
		{
			seleccion=(int)(Math.random()*empleador.getListaDeAsignacion().getLista().size());
			empleador.agregaElegidos(empleador.getListaDeAsignacion().getLista().get(seleccion));
			i++;
			cantObtenidos++;
		}
		empleador.setEligio(true);
	}
}
