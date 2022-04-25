package modelo;

import java.util.ArrayList;
import java.util.Collections;


public class RondaDeEncuentrosLaborales {
	
	private ArrayList <Persona>empleadores =  Agencia.getInstancia().getEmpleadores();
	private ArrayList <Persona> empleadosPretensos =  Agencia.getInstancia().getEmpleadosPretensos();


	public void generaListaAsignaciones ()
	{
		int calificacion = 0;
		Persona_Empleador empleador = null;
		Persona_EmpleadoPretenso empleadoP=null;
		FormularioDeBusqueda formularioEmpleador=null;
		FormularioDeBusqueda formularioEmpleadoP=null;
		
		for (int i=0; i<empleadores.size(); i++)
		{
			
			calificacion = 0;
			empleador = (Persona_Empleador) empleadores.get(i);
			empleador.setListaDeAsignacion(new ArrayList<PersonaAsignada>());
			formularioEmpleador=empleador.getTicket().getFormularioDeBusqueda();
			for (int j=0; j < empleadosPretensos.size(); j++)
			{
				empleadoP = (Persona_EmpleadoPretenso) empleadosPretensos.get(j);
				empleadoP.setListaDeAsignacion(new ArrayList<PersonaAsignada>());
				formularioEmpleadoP=empleadoP.getTicket().getFormularioDeBusqueda();
				calificacion+=empleador.getPuntajeAspectos()[0]*formularioEmpleador.getLocacion().comparaCon(formularioEmpleadoP.getLocacion());
				calificacion+=empleador.getPuntajeAspectos()[1]*formularioEmpleador.getRemuneracion().comparaCon(formularioEmpleadoP.getRemuneracion());
				calificacion+=empleador.getPuntajeAspectos()[2]*formularioEmpleador.getCargaHoraria().comparaCon(formularioEmpleadoP.getCargaHoraria());
				calificacion+=empleador.getPuntajeAspectos()[3]*formularioEmpleador.getTipoDePuesto().comparaCon(formularioEmpleadoP.getTipoDePuesto());
				calificacion+=empleador.getPuntajeAspectos()[4]*formularioEmpleador.getRangoEtario().comparaCon(formularioEmpleadoP.getRangoEtario());
				calificacion+=empleador.getPuntajeAspectos()[5]*formularioEmpleador.getExperienciaPrevia().comparaCon(formularioEmpleadoP.getExperienciaPrevia());
				calificacion+=empleador.getPuntajeAspectos()[6]*formularioEmpleador.getEstudiosCursados().comparaCon(formularioEmpleadoP.getEstudiosCursados());
				empleadoP.getListaDeAsignacion().add(new PersonaAsignada(empleador,calificacion));
				empleador.getListaDeAsignacion().add(new PersonaAsignada(empleadoP,calificacion));	
			}
			Collections.sort(empleador.getListaDeAsignacion()); //una vez completa, ordena la lista del empleador	
		}
		for (int i=0;i<empleadosPretensos.size();i++)
			Collections.sort(empleadosPretensos.get(i).getListaDeAsignacion());//ordena lista de empleados pretensos
		
		
	}
	
	
	
}
