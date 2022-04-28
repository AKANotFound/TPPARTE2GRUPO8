package modelo;

import java.util.ArrayList;

public class RondaDeContrataciones {
	
	public void calculoCoincidencias ()
	{
		Contrato nuevoContrato = null;
		int bandera;
		
		ArrayList <Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
		for (int i= 0; i< empleadores.size(); i++)
		{
			ArrayList<PersonaAsignada> elegidos = empleadores.get(i).getElegidos();
			Persona_Empleador empleador = empleadores.get(i);
			bandera = 0;
			for (int j=0; j<elegidos.size();j++) 
			{
				Persona_EmpleadoPretenso empleadoElegido = (Persona_EmpleadoPretenso) elegidos.get(j).getPersona();
				if (empleador.equals(empleadoElegido.getElegido().getPersona()))
				{
					if(bandera == 0) {
						bandera = 1;
						nuevoContrato = new Contrato(empleador);
						Sistema.getInstancia().addContrato(nuevoContrato);
					}
					nuevoContrato.addEmpleadosContratados(empleadoElegido);
					Ticket_BusquedaEmpleado ticket = (Ticket_BusquedaEmpleado) empleador.getTicket();
					ticket.setCantEmpleadosObtenidos(ticket.getCantEmpleadosObtenidos()+1);
					Sistema.getInstancia().finalizar(empleadoElegido.getTicket());
				}
			}
		}
	}
}

