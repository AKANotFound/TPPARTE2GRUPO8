package sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import entidades.ListaDeAsignacion;
import entidades.PersonaAsignada;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;

abstract class RondaDeEncuentrosLaborales {

	static void iniciaRondaDeEncuentrosLaborales ()
	{
		GregorianCalendar fecha = new GregorianCalendar();
		ArrayList <Persona_Empleador> empleadores =  Agencia.getInstancia().getEmpleadores();
		ArrayList <Persona_EmpleadoPretenso> empleadosPretensos =  Agencia.getInstancia().getEmpleadosPretensos();
		double calificacion = 0;
		Persona_Empleador empleador = null;
		Persona_EmpleadoPretenso empleadoP=null;
		FormularioDeBusqueda formularioEmpleador=null;
		FormularioDeBusqueda formularioEmpleadoP=null;
		
		for (int i=0; i<empleadores.size(); i++)
		{
			empleador = empleadores.get(i);
			if(empleador.getTicket().getEstado().equals(" activo")) {
				empleador.setListaDeAsignacion(new ListaDeAsignacion());
				empleador.getListaDeAsignacion().setLista(new ArrayList<PersonaAsignada>());
				empleador.getListaDeAsignacion().setFechaDeCreacion(fecha); 
				formularioEmpleador = empleador.getTicket().getFormularioDeBusqueda();
				for (int j=0; j < empleadosPretensos.size(); j++)
				{
					calificacion = 0;
					empleadoP = (Persona_EmpleadoPretenso) empleadosPretensos.get(j);	
					if(empleadoP.getListaDeAsignacion() == null) {
						empleadoP.setListaDeAsignacion(new ListaDeAsignacion());
						empleadoP.getListaDeAsignacion().setLista(new ArrayList<PersonaAsignada>());
						empleadoP.getListaDeAsignacion().setFechaDeCreacion(fecha);
					}
					if(empleadoP.getTicket().getEstado().equalsIgnoreCase(" activo")) {
						formularioEmpleadoP=empleadoP.getTicket().getFormularioDeBusqueda();
						calificacion+=empleador.getPuntajeAspectos()[0]*formularioEmpleador.getLocacion().comparaCon(formularioEmpleadoP.getLocacion())
									+empleador.getPuntajeAspectos()[1]*formularioEmpleador.getRemuneracion().comparaCon(formularioEmpleadoP.getRemuneracion())
									+empleador.getPuntajeAspectos()[2]*formularioEmpleador.getCargaHoraria().comparaCon(formularioEmpleadoP.getCargaHoraria())
									+empleador.getPuntajeAspectos()[3]*formularioEmpleador.getTipoDePuesto().comparaCon(formularioEmpleadoP.getTipoDePuesto())
									+empleador.getPuntajeAspectos()[4]*formularioEmpleador.getRangoEtario().comparaCon(formularioEmpleadoP.getRangoEtario())
									+empleador.getPuntajeAspectos()[5]*formularioEmpleador.getExperienciaPrevia().comparaCon(formularioEmpleadoP.getExperienciaPrevia())
									+empleador.getPuntajeAspectos()[6]*formularioEmpleador.getEstudiosCursados().comparaCon(formularioEmpleadoP.getEstudiosCursados());
						
						empleador.getListaDeAsignacion().getLista().add(new PersonaAsignada(empleadoP,calificacion));
						empleadoP.getListaDeAsignacion().getLista().add(new PersonaAsignada(empleador,calificacion));
					}
				}
				Collections.sort(empleador.getListaDeAsignacion().getLista()); //una vez completa, ordena la lista del empleador	
				empleadoP = (Persona_EmpleadoPretenso) empleador.getListaDeAsignacion().getLista().get(0).getPersona();
				Sistema.puntajePrimero(empleadoP);
				empleadoP = (Persona_EmpleadoPretenso) empleador.getListaDeAsignacion().getLista().get(empleador.getListaDeAsignacion().getLista().size()-1).getPersona();
				Sistema.puntajeUltimo(empleadoP);
				
			}
		}
		for (int i=0;i<empleadosPretensos.size();i++)
		{
			Collections.sort(empleadosPretensos.get(i).getListaDeAsignacion().getLista());//ordena lista de empleados pretensos
			empleador = (Persona_Empleador) empleadosPretensos.get(i).getListaDeAsignacion().getLista().get(0).getPersona();
			Sistema.puntajePrimero(empleador);
		}
	}
}
