package client;

import java.util.ArrayList;

public class RondaDeEncuentrosLaborales {
	
	private ArrayList <Persona_Empleador>empleadores =  Agencia.getInstancia().empleadores;
	private ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().empleadosPretensos;
	private HashMap <int, String>
	
	public void comparaRequisitos ()
	{
		double calificacion = 0;
		Persona_Empleador empleador = null;
		for (int i=0; i<empleadores.size(); i++)
		{
			empleador = empleadores.get(i);
			empleador.getTicket().getFormularioDeBusqueda().getLocacion()
			for (int j=0; j < empleadosPretensos.size(); j++)
			{
				
			}
		
		}
			
	}
	
	
}
