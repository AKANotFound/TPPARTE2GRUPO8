package modelo;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class RondaDeEncuentrosLaborales {
	
	private ArrayList <Persona_Empleador>empleadores =  Agencia.getInstancia().empleadores;
	private ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().empleadosPretensos;


	public void generaListaAsignaciones ()
	{
		int calificacion = 0;
		Persona_Empleador empleador = null;
		Persona_EmpleadoPretenso empleadoP=null;
		FormularioDeBusqueda formularioEmpleador=null;
		FormularioDeBusqueda formularioEmpleadoP=null;
		ArrayList<PersonaAsignada>ListaDelEmpleador=new ArrayList<PersonaAsignada>();
		ArrayList<PersonaAsignada>ListaDelEmpleadoP=new ArrayList<PersonaAsignada>();
		SortedSet<PersonaAsignada> arbolOrdenadoDelEmpleador= new TreeSet<PersonaAsignada>();
		SortedSet<PersonaAsignada> arbolOrdenadoDelEmpleadoP= new TreeSet<PersonaAsignada>();
		PersonaAsignada personaAsignada;
		
		for (int i=0; i<empleadores.size(); i++)
		{
			calificacion = 0;
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
				
				empleadoP.getListaDeAsignacion().add(new PersonaAsignada(empleador,calificacion));
				arbolOrdenadoDelEmpleador.add(new PersonaAsignada(empleadoP,calificacion));
			}
			empleador.getListaDeAsignacion().addAll(arbolOrdenadoDelEmpleador);
		}
		arbolOrdenadoDelEmpleadoP.add(new PersonaAsignada(empleador,calificacion));
		
	}
	
	public ArrayList<PersonaAsignada> ordenaLista(Persona_EmpleadoPretenso empleadoP)
	{
		for (int i=0;i<empleadoP.getListaDeAsignacion().size();i++)
		{
			arbolOrdenadoDelEmpleadoP.add(new PersonaAsignada(empleadoP,calificacion));
		}
	}
	
}
