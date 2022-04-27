package modelo;

import java.util.ArrayList;
import java.util.Collections;


public class RondaDeEncuentrosLaborales {
	
	

	public static void generaListaAsignaciones ()
	{
		 ArrayList <Persona_Empleador> empleadores =  Agencia.getInstancia().getEmpleadores();
		 ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().getEmpleadosPretensos();
		double calificacion = 0;
		Persona_Empleador empleador = null;
		Persona_EmpleadoPretenso empleadoP=null;
		FormularioDeBusqueda formularioEmpleador=null;
		FormularioDeBusqueda formularioEmpleadoP=null;
		
		for (int i=0; i<empleadores.size(); i++)
		{
			
			calificacion = 0;
			empleador = empleadores.get(i);
			empleador.getListaDeAsignacion().setLista(new ArrayList<PersonaAsignada>());
			empleador.getListaDeAsignacion().setFechaDeCreacion(null); //PONER FECHA DE CREACION
			formularioEmpleador=empleador.getTicket().getFormularioDeBusqueda();
			for (int j=0; j < empleadosPretensos.size(); j++)
			{
				empleadoP = (Persona_EmpleadoPretenso) empleadosPretensos.get(j);
				empleadoP.getListaDeAsignacion().setLista(new ArrayList<PersonaAsignada>());
				empleadoP.getListaDeAsignacion().setFechaDeCreacion(null);//PONER FECHA DE CREACION
				
				formularioEmpleadoP=empleadoP.getTicket().getFormularioDeBusqueda();
				calificacion+=empleador.getPuntajeAspectos()[0]*formularioEmpleador.getLocacion().comparaCon(formularioEmpleadoP.getLocacion())
							+empleador.getPuntajeAspectos()[1]*formularioEmpleador.getRemuneracion().comparaCon(formularioEmpleadoP.getRemuneracion())
							+empleador.getPuntajeAspectos()[2]*formularioEmpleador.getCargaHoraria().comparaCon(formularioEmpleadoP.getCargaHoraria())
							+empleador.getPuntajeAspectos()[3]*formularioEmpleador.getTipoDePuesto().comparaCon(formularioEmpleadoP.getTipoDePuesto())
							+empleador.getPuntajeAspectos()[4]*formularioEmpleador.getRangoEtario().comparaCon(formularioEmpleadoP.getRangoEtario())
							+empleador.getPuntajeAspectos()[5]*formularioEmpleador.getExperienciaPrevia().comparaCon(formularioEmpleadoP.getExperienciaPrevia())
							+empleador.getPuntajeAspectos()[6]*formularioEmpleador.getEstudiosCursados().comparaCon(formularioEmpleadoP.getEstudiosCursados());
				empleadoP.getListaDeAsignacion().getLista().add(new PersonaAsignada(empleador,calificacion));
				empleador.getListaDeAsignacion().getLista().add(new PersonaAsignada(empleadoP,calificacion));	
			}
			Collections.sort(empleador.getListaDeAsignacion().getLista()); //una vez completa, ordena la lista del empleador	
			empleadoP = (Persona_EmpleadoPretenso) empleador.getListaDeAsignacion().getLista().get(0).getPersona();
			empleadoP.getPuntajeUsuario().primerEmpleadoPretenso();;
			empleadoP = (Persona_EmpleadoPretenso) empleador.getListaDeAsignacion().getLista().get(empleador.getListaDeAsignacion().getLista().size()-1).getPersona();
			empleadoP.getPuntajeUsuario().ultimoEmpleadoPretenso();;
		}
		for (int i=0;i<empleadosPretensos.size();i++)
		{
			Collections.sort(empleadosPretensos.get(i).getListaDeAsignacion().getLista());//ordena lista de empleados pretensos
			empleador = (Persona_Empleador) empleadosPretensos.get(i).getListaDeAsignacion().getLista().get(0).getPersona();
			empleador.getPuntajeUsuario().primerEmpleador();
		}
			
		
	}
}
