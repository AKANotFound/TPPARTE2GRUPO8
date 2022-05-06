package prueba;

import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import excepciones.EdadInvalidaException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.ListaNoGeneradaException;
import excepciones.TipoPersonaInvalidoException;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
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

public class Prueba2 {

	public static void main(String[] args) {
		
		FuncionalidadEmpleadoPretenso saimonmdp = null;
		FuncionalidadEmpleadoPretenso hamilton = null;
		FuncionalidadEmpleadoPretenso ElKeizy = null;
		FuncionalidadEmpleadoPretenso LifeIsMusic = null;
		FuncionalidadEmpleador gesi = null;
		FuncionalidadEmpleador carrefour = null;
		
		//REGISTRO EMPLEADOS Y EMPLEADORES
		try {
			Sistema.registrarEmpleadoPretenso("saimonmdp", "123abc", "Juan Simon Facal", "2235276920", 22);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {  
			Sistema.registrarEmpleadoPretenso("hamilton", "abc123", "Milton Sanchez", "2235284548", 24);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			 Sistema.registrarEmpleadoPretenso("ElKeizy", "contraseniajeje", "Nicolas ramirez", "2236168614", 24);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			Sistema.registrarEmpleadoPretenso("LifeIsMusic", "vossabras", "Sofia Isabella Palladino", "2266513625", 21);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		
		//Declaro los puntajes de los aspectos de los empleadores
		double puntajeAspectosGesi[]= {1,1,1,1,1,1,3};
		double puntajeAspectosCarrefour[]= {10,12,0,1,3,-2,1};
		
		try {
			Sistema.registrarEmpleador("gesi", "empresajaja", "Grupo ESI", "juridica", new Rubro_ComercioLocal(),puntajeAspectosGesi);
		} catch (TipoPersonaInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			Sistema.registrarEmpleador("carrefour", "empresaurio", "Carrefour", "fisica", new Rubro_ComercioInternacional(),puntajeAspectosCarrefour);
		} catch (TipoPersonaInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		//LOGEO EMPLEADOS Y EMPRESARIOS
		try {
			saimonmdp =Sistema.loginEmpleadoPretenso("saimonmdp", "123abc"); 
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			hamilton = Sistema.loginEmpleadoPretenso("hamilton", "abc123"); 
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			ElKeizy = Sistema.loginEmpleadoPretenso("ElKeizy", "contraseniajeje");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			LifeIsMusic = Sistema.loginEmpleadoPretenso("LifeIsMusic", "vossabras");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			gesi = Sistema.loginEmpleador("gesi", "empresajaja");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			carrefour = Sistema.loginEmpleador("carrefour", "empresaurio");
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
		saimonmdp.crearTicket(form1);
		hamilton.crearTicket(form2);
		ElKeizy.crearTicket(form3);
		LifeIsMusic.crearTicket(form4);
		gesi.crearTicket(form5, 2);
		carrefour.crearTicket(form6, 1);
		 
		//Agencia.getInstancia().getFuncionalidad().visualizarEmpleadores();
		//Agencia.getInstancia().getFuncionalidad().visualizarEmpleadosPretensos();
		
		Agencia.getInstancia().getFuncionalidad().iniciaRondaEncuentrosLaborales();
		
		try {
			Sistema.visualizarListaAsignacion(saimonmdp.getEmpleado());
		} catch (ListaNoGeneradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Sistema.visualizarListaAsignacion(hamilton.getEmpleado());
		} catch (ListaNoGeneradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Sistema.visualizarListaAsignacion(ElKeizy.getEmpleado());
		} catch (ListaNoGeneradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Sistema.visualizarListaAsignacion(LifeIsMusic.getEmpleado());
		} catch (ListaNoGeneradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Sistema.visualizarListaAsignacion(gesi.getEmpleador());
		} catch (ListaNoGeneradaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Sistema.visualizarListaAsignacion(carrefour.getEmpleador());
		} catch (ListaNoGeneradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		saimonmdp.iniciarRondaEleccion();
		hamilton.iniciarRondaEleccion();
		ElKeizy.iniciarRondaEleccion();
		LifeIsMusic.iniciarRondaEleccion();
		gesi.iniciarRondaEleccion();
		carrefour.iniciarRondaEleccion();
		
		System.out.println("saimon eligio: "+saimonmdp.getEmpleado().getElegido().getPersona().getCuenta().getUsuario());
		System.out.println("hamilton eligio: "+hamilton.getEmpleado().getElegido().getPersona().getCuenta().getUsuario());
		System.out.println("Keizy eligio: "+ElKeizy.getEmpleado().getElegido().getPersona().getCuenta().getUsuario());
		System.out.println("Music eligio: "+LifeIsMusic.getEmpleado().getElegido().getPersona().getCuenta().getUsuario());
		System.out.println("gesi "+gesi.getEmpleador().getElegidos());
		System.out.println("carrefour "+carrefour.getEmpleador().getElegidos());
		
		Agencia.getInstancia().getFuncionalidad().iniciaRondaContratacion();
		Sistema.visualizarContratos();
		System.out.println(ElKeizy.getEmpleado().getPuntaje());
		System.out.println(carrefour.getEmpleador().getPuntaje());
		
	}

}
