package sistema;

import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket_Empleador;
import excepciones.ListaNoGeneradaException;

abstract class RondaDeElecciones {	
	
	static void iniciaRondaDeEleccionEmpleadoPretenso(Persona_EmpleadoPretenso empleadoPretenso) {
		if (empleadoPretenso.getListaDeAsignacion()!=null)
		{
			int seleccion=(int)(Math.random()*empleadoPretenso.getListaDeAsignacion().getLista().size());
		//Sistema.visualizarListaAsignacion(empleadoPretenso); //le muestra la lista al usuario
			empleadoPretenso.setEmpleadorElegido(empleadoPretenso.getListaDeAsignacion().getLista().get(seleccion));
		}
	}
	
	static void iniciaRondaDeEleccionEmpleador(Persona_Empleador empleador) {
		Ticket_Empleador ticketEmpleador = (Ticket_Empleador) empleador.getTicket();
		int cantObtenidos = ticketEmpleador.getCantEmpleadosObtenidos();
		int cantSolicitados = ticketEmpleador.getCantEmpleadosSolicitados();
		int seleccion;
		int i = 0;
		//Sistema.visualizarListaAsignacion(empleador); // le muestra la lista al usuario
		if (empleador.getListaDeAsignacion()!=null)
		{
			while (i < empleador.getListaDeAsignacion().getLista().size() && cantObtenidos < cantSolicitados)
			{
				seleccion=(int)(Math.random()*empleador.getListaDeAsignacion().getLista().size());
				while(empleador.getEmpleadosElegidos().contains(empleador.getListaDeAsignacion().getLista().get(seleccion)) )
					seleccion=(int)(Math.random()*empleador.getListaDeAsignacion().getLista().size());
				empleador.agregaEmpleadosElegidos(empleador.getListaDeAsignacion().getLista().get(seleccion));
				i++;
				cantObtenidos++;
			}
		}
		
	} 
	
	//dejamos esta funcion para lo VISUAL
	private static String visualizarListaAsignacion(Persona persona) throws ListaNoGeneradaException
	{
		String string=null;
		if(persona.getListaDeAsignacion() != null)
			string=""+persona.getListaDeAsignacion();
			
		else
			throw new ListaNoGeneradaException();
		return string;
	}
}
 