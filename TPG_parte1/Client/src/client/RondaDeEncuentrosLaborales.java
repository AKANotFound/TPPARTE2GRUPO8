package client;

import java.util.ArrayList;

public class RondaDeEncuentrosLaborales {
	
	private ArrayList <Persona_Empleador>empleadores =  Agencia.getInstancia().empleadores;
	private ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().empleadosPretensos;
	
	
	public void generaListaAsignaciones ()
	{
		double calificacion = 0;
		Persona_Empleador empleador = null;
		Persona_EmpleadoPretenso empleadoP=null;
		FormularioDeBusqueda formularioEmpleador=null;
		FormularioDeBusqueda formularioEmpleadoP=null;
		
		for (int i=0; i<empleadores.size(); i++)
		{
			empleador = empleadores.get(i);
			formularioEmpleador=empleador.getTicket().getFormularioDeBusqueda();
			for (int j=0; j < empleadosPretensos.size(); j++)
			{
				empleadoP = empleadosPretensos.get(j);
				formularioEmpleadoP=empleadoP.getTicket().getFormularioDeBusqueda();
				calificacion+=empleador.getPuntajeAspectos()[0]*formularioEmpleador.getLocacion().comparaCon(formularioEmpleadoP.getLocacion());
				calificacion+=empleador.getPuntajeAspectos()[1]*formularioEmpleador.getRemuneracion().comparaCon(formularioEmpleadoP.getRemuneracion());
				calificacion+=empleador.getPuntajeAspectos()[2]*formularioEmpleador.getCargaHoraria().comparaCon(formularioEmpleadoP.getCargaHoraria());
				calificacion+=empleador.getPuntajeAspectos()[3]*formularioEmpleador.getTipoDePuesto().comparaCon(formularioEmpleadoP.getTipoDePuesto());
				calificacion+=empleador.getPuntajeAspectos()[4]*formularioEmpleador.getRangoEtario().comparaCon(formularioEmpleadoP.getRangoEtario());
				calificacion+=empleador.getPuntajeAspectos()[5]*formularioEmpleador.getExperienciaPrevia().comparaCon(formularioEmpleadoP.getExperienciaPrevia());
				calificacion+=empleador.getPuntajeAspectos()[6]*formularioEmpleador.getEstudiosCursados().comparaCon(formularioEmpleadoP.getEstudiosCursados());
				
			}
		}		
	}
	
	
}
