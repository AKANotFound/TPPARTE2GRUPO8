package prueba;

import java.util.ArrayList;

import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import excepciones.EdadInvalidaException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.TipoPersonaInvalidoException;
import sistema.Sistema;
import tablas.CargaHoraria_Completa;
import tablas.CargaHoraria_Extendida;
import tablas.CargaHoraria_Media;
import tablas.EstudiosCursados_Primario;
import tablas.EstudiosCursados_Secundario;
import tablas.EstudiosCursados_Terciario;
import tablas.ExperienciaPrevia_Media;
import tablas.ExperienciaPrevia_Mucha;
import tablas.ExperienciaPrevia_Nada;
import tablas.LocacionFactory;
import tablas.RangoEtario_MasDe50;
import tablas.RangoEtario_MenosDe40;
import tablas.Remuneracion_30mil;
import tablas.Remuneracion_60mil;
import tablas.Remuneracion_90mil;
import tablas.TipoDePuesto_Junior;
import tablas.TipoDePuesto_Management;
import tablas.TipoDePuesto_Senior;

public class Prueba {

	public static void main(String[] args) {
		
		/*Persona_EmpleadoPretenso saimonmdp = null;
		Persona_EmpleadoPretenso hamilton = null;
		Persona_EmpleadoPretenso ElKeizy = null;
		Persona_EmpleadoPretenso LifeIsMusic = null;
		Persona_Empleador gesi = null;
		Persona_Empleador carrefour = null;
		
		//REGISTRO EMPLEADOS Y EMPLEADORES
		try {
			saimonmdp = Sistema.registrarEmpleadoPretenso("saimonmdp", "123abc", "Juan Simon Facal", "2235276920", 22);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {  
			hamilton = Sistema.registrarEmpleadoPretenso("hamilton", "abc123", "Milton Sanchez", "2235284548", 24);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			ElKeizy = Sistema.registrarEmpleadoPretenso("ElKeizy", "contraseniajeje", "Nicolas ramirez", "2236168614", 24);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			LifeIsMusic = Sistema.registrarEmpleadoPretenso("LifeIsMusic", "vossabras", "Sofia Isabella Palladino", "2266513625", 21);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			gesi = Sistema.registrarEmpleador("gesi", "empresajaja", "Grupo ESI", "juridica", new Rubro_ComercioLocal());
		} catch (TipoPersonaInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			carrefour = Sistema.registrarEmpleador("carrefour", "empresaurio", "Carrefour", "fisica", new Rubro_ComercioInternacional());
		} catch (TipoPersonaInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		//LOGEO EMPLEADOS Y EMPRESARIOS
		try {
			saimonmdp.setFuncionalidad(Sistema.loginEmpleadoPretenso("saimonmdp", "123abc")); 
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			hamilton.setFuncionalidad(Sistema.loginEmpleadoPretenso("hamilton", "abc123")); 
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			ElKeizy.setFuncionalidad(Sistema.loginEmpleadoPretenso("ElKeizy", "contraseniajeje"));
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			LifeIsMusic.setFuncionalidad(Sistema.loginEmpleadoPretenso("LifeIsMusic", "vossabras"));
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			gesi.setFuncionalidad(Sistema.loginEmpleador("gesi", "empresajaja"));
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			carrefour.setFuncionalidad(Sistema.loginEmpleador("carrefour", "empresaurio"));
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//CREO TICKET DE EMPLEADOS Y EMPLEADORES
		FormularioDeBusqueda form1 = new FormularioDeBusqueda (LocacionFactory.getLocacion("HomeOffice"), new Remuneracion_60mil(), new CargaHoraria_Extendida(), new TipoDePuesto_Junior(), new RangoEtario_MasDe50(), new ExperienciaPrevia_Media(), new EstudiosCursados_Secundario());
		FormularioDeBusqueda form2 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Indistinto"), new Remuneracion_90mil(), new CargaHoraria_Media(), new TipoDePuesto_Senior(), new RangoEtario_MasDe50(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Terciario());
		FormularioDeBusqueda form3 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Presencial"), new Remuneracion_90mil(), new CargaHoraria_Completa(), new TipoDePuesto_Management(), new RangoEtario_MenosDe40(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Secundario());
		FormularioDeBusqueda form4 = new FormularioDeBusqueda (LocacionFactory.getLocacion("HomeOffice"), new Remuneracion_30mil(), new CargaHoraria_Extendida(), new TipoDePuesto_Junior(), new RangoEtario_MasDe50(), new ExperienciaPrevia_Nada(), new EstudiosCursados_Primario());
		FormularioDeBusqueda form5 = new FormularioDeBusqueda (LocacionFactory.getLocacion("HomeOffice"), new Remuneracion_90mil(), new CargaHoraria_Completa(), new TipoDePuesto_Senior(), new RangoEtario_MenosDe40(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Secundario());
		FormularioDeBusqueda form6 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Presencial"), new Remuneracion_30mil(), new CargaHoraria_Media(), new TipoDePuesto_Junior(), new RangoEtario_MenosDe40(), new ExperienciaPrevia_Nada(), new EstudiosCursados_Secundario());
		//System.out.println(form1.getLocacion());
		saimonmdp.getFuncionalidad().crearTicket(form1);
		hamilton.getFuncionalidad().crearTicket(form2);
		ElKeizy.getFuncionalidad().crearTicket(form3);
		LifeIsMusic.getFuncionalidad().crearTicket(form4);
		gesi.getFuncionalidad().crearTicket(form5, 2);
		carrefour.getFuncionalidad().crearTicket(form6, 3);
		 
		//Agencia.getInstancia().getFuncionalidad().visualizarEmpleadores();
		//Agencia.getInstancia().getFuncionalidad().visualizarEmpleadosPretensos();
		gesi.setPuntajeAspectos(1, 1, 1, 1, 1, 1, 3);
		carrefour.setPuntajeAspectos(10, 12, 0, 1, 3, -2, 1);
		Agencia.getInstancia().getFuncionalidad().iniciaRondaEncuentrosLaborales();
		
		//Sistema.visualizarListaAsignacion(saimonmdp);  //POR QU� SOLO SE AGREGA CARREFOUR A LAS LISTAS DE ASIGNACION DE LOS EMPLEADOS PRETENSOS?
		//Sistema.visualizarListaAsignacion(hamilton);
		//Sistema.visualizarListaAsignacion(ElKeizy);
		//Sistema.visualizarListaAsignacion(LifeIsMusic);
		//Sistema.visualizarListaAsignacion(gesi);
		//Sistema.visualizarListaAsignacion(carrefour);
		
		Sistema.visualizarListaAsignacion(saimonmdp.getFuncionalidad().getEmpleado());
		Sistema.visualizarListaAsignacion(gesi.getFuncionalidad().getEmpleador());
		*/
	}

}
