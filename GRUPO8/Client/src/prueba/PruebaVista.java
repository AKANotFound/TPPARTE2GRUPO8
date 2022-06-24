package prueba;

import java.io.IOException;

import controlador.ControladorVistaFormularioDeBusquedaEmpleadoPretenso;
import controlador.ControladorVistaFormularioDeBusquedaEmpleador;
import controlador.ControladorVistaFuncionalidadesAdministrador;
import controlador.ControladorVistaFuncionalidadesPersona;
import controlador.ControladorVistaGestionTicketPersona;
import controlador.ControladorVistaInicial;
import controlador.ControladorVistaRegistrarAdministrador;
import controlador.ControladorVistaRegistrarEmpleadoPretenso;
import controlador.ControladorVistaRegistrarEmpleador;
import controlador.ControladorVistaSimulacion;
import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;
import excepciones.EdadInvalidaException;
import excepciones.ErrorCodigoException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.TipoPersonaInvalidoException;
import persistencia.Persiste;
import sistema.FuncionalidadAdministrador;
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
import vista.Ventana;
import vista.VistaFormularioDeBusquedaEmpleadoPretenso;
import vista.VistaFormularioDeBusquedaEmpleador;
import vista.VistaFuncionalidadesAdministrador;
import vista.VistaFuncionalidadesPersona;
import vista.VistaGestionTicketPersona;
import vista.VistaInicial;
import vista.VistaRegistrarAdministrador;
import vista.VistaRegistrarEmpleadoPretenso;
import vista.VistaRegistrarEmpleador;
import vista.VistaSimulacion;

public class PruebaVista {

	public static void main(String[] args) {

		VistaInicial vistaInicial = new VistaInicial();
		VistaRegistrarAdministrador vistaRegistrarAdministrador = new VistaRegistrarAdministrador();
		VistaRegistrarEmpleadoPretenso vistaRegistrarEmpleadoPretenso = new VistaRegistrarEmpleadoPretenso();
		VistaRegistrarEmpleador vistaRegistrarEmpleador = new VistaRegistrarEmpleador();
		VistaFuncionalidadesAdministrador vistaFuncionalidadesAdministrador = new VistaFuncionalidadesAdministrador();
		VistaFuncionalidadesPersona vistaFuncionalidadesPersona = new VistaFuncionalidadesPersona();
		VistaFormularioDeBusquedaEmpleadoPretenso vistaFormularioDeBusquedaEmpleadoPretenso = new VistaFormularioDeBusquedaEmpleadoPretenso();
		VistaFormularioDeBusquedaEmpleador vistaFormularioDeBusquedaEmpleador = new VistaFormularioDeBusquedaEmpleador();
		VistaGestionTicketPersona vistaGestionTicketPersona = new VistaGestionTicketPersona();
		VistaSimulacion vistaSimulacion = new VistaSimulacion();

		Ventana ventana = new Ventana(vistaInicial, vistaRegistrarAdministrador, vistaRegistrarEmpleadoPretenso,
				vistaRegistrarEmpleador, vistaFuncionalidadesAdministrador, vistaFuncionalidadesPersona,
				vistaFormularioDeBusquedaEmpleadoPretenso, vistaFormularioDeBusquedaEmpleador,
				vistaGestionTicketPersona, vistaSimulacion);

		ControladorVistaInicial controladorVistaInicial = new ControladorVistaInicial(ventana, vistaInicial);
		ControladorVistaRegistrarAdministrador controladorVistaRegistrarAdministrador = new ControladorVistaRegistrarAdministrador(
				ventana, vistaRegistrarAdministrador);
		ControladorVistaRegistrarEmpleadoPretenso controladorVistaRegistrarEmpleadoPretenso = new ControladorVistaRegistrarEmpleadoPretenso(
				ventana, vistaRegistrarEmpleadoPretenso);
		ControladorVistaRegistrarEmpleador controladorVistaRegistrarEmpleador = new ControladorVistaRegistrarEmpleador(
				ventana, vistaRegistrarEmpleador);
		ControladorVistaSimulacion controladorVistaSimulacion = new ControladorVistaSimulacion(ventana,
				vistaSimulacion);
		ControladorVistaFuncionalidadesAdministrador controladorVistaFuncionalidadesAdministrador = new ControladorVistaFuncionalidadesAdministrador(
				ventana, vistaFuncionalidadesAdministrador);
		ControladorVistaFuncionalidadesPersona controladorVistaFuncionalidadesPersona = new ControladorVistaFuncionalidadesPersona(
				ventana, vistaFuncionalidadesPersona);
		ControladorVistaFormularioDeBusquedaEmpleador controladorVistaFormularioDeBusquedaEmpleador = new ControladorVistaFormularioDeBusquedaEmpleador(
				ventana, vistaFormularioDeBusquedaEmpleador);
		ControladorVistaFormularioDeBusquedaEmpleadoPretenso controladorVistaFormularioDeBusquedaEmpleadoPretenso = new ControladorVistaFormularioDeBusquedaEmpleadoPretenso(
				ventana, vistaFormularioDeBusquedaEmpleadoPretenso);
		ControladorVistaGestionTicketPersona controladoVistaGestionTicketPersona = new ControladorVistaGestionTicketPersona(
				ventana, vistaGestionTicketPersona);

		// *************************************************************************************************************

		try 
		{
			Persiste.getInstancia().leer();
		} catch (IOException e2) {
			e2.printStackTrace();

			System.out.println("Harcodea");
			Rubro_ComercioLocal rubro_ComercioLocal = new Rubro_ComercioLocal();
			Rubro_ComercioInternacional rubro_ComercioInternacional = new Rubro_ComercioInternacional();
			Rubro_Salud rubro_Salud = new Rubro_Salud();

			FuncionalidadAdministrador admin = null;
			FuncionalidadEmpleadoPretenso jorge = null;
			FuncionalidadEmpleadoPretenso pablo = null;
			FuncionalidadEmpleadoPretenso francoS = null;
			FuncionalidadEmpleadoPretenso francoP = null;
			FuncionalidadEmpleador microsoft = null;
			FuncionalidadEmpleador carrefour = null;

			// Declaro los puntajes de los aspectos de los empleadores
			double puntajeAspectosGesi[] = { 1, 1, 1, 1, 1, 1, 3 };
			double puntajeAspectosCarrefour[] = { 10, 12, 0, 1, 3, -2, 1 };

			// REGISTRO ADMIN,EMPLEADOS Y EMPLEADORES

			try {
				Sistema.registrarAdministrador("admin", "1234", "XAEA-12");
			} catch (ErrorCodigoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				Sistema.registrarEmpleadoPretenso("jorge_perez", "123abc", "Jorge Adrian Perez", "2231111111", 32);
			} catch (EdadInvalidaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				Sistema.registrarEmpleadoPretenso("pablo_gimenez", "abc123", "Pablo Alberto Gimenez", "2232222222", 24);
			} catch (EdadInvalidaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				Sistema.registrarEmpleadoPretenso("franco_sosa", "123qwe", "Franco Sosa", "2233333333", 27);
			} catch (EdadInvalidaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				Sistema.registrarEmpleadoPretenso("franco_palmeiras", "345ert", "Franco Palmeiras", "2264444444", 19);
			} catch (EdadInvalidaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				Sistema.registrarEmpleador("microsoft", "159pep", "Microsoft", "juridica", rubro_ComercioLocal,
						puntajeAspectosGesi);
			} catch (TipoPersonaInvalidoException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				Sistema.registrarEmpleador("carrefour", "747ghi", "Carrefour", "fisica", rubro_ComercioInternacional,
						puntajeAspectosCarrefour);
			} catch (TipoPersonaInvalidoException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			// LOGEO DE USUARIOS

			try {
				admin = Sistema.loginAdministrador("admin", "1234");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				jorge = Sistema.loginEmpleadoPretenso("jorge_perez", "123abc");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				pablo = Sistema.loginEmpleadoPretenso("pablo_gimenez", "abc123");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				francoS = Sistema.loginEmpleadoPretenso("franco_sosa", "123qwe");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				francoP = Sistema.loginEmpleadoPretenso("franco_palmeiras", "345ert");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				microsoft = Sistema.loginEmpleador("microsoft", "159pep");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			try {
				carrefour = Sistema.loginEmpleador("carrefour", "747ghi");
			} catch (ErrorContrasenaException | ErrorUsuarioException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			// CREO TICKET DE EMPLEADOS Y EMPLEADORES
			FormularioDeBusqueda form1 = new FormularioDeBusqueda(LocacionFactory.getLocacion("HomeOffice"),
					new Remuneracion_60mil(), new CargaHoraria_Extendida(), new TipoDePuesto_Junior(),
					new RangoEtario_MasDe50(), new ExperienciaPrevia_Media(), new EstudiosCursados_Secundario());
			FormularioDeBusqueda form2 = new FormularioDeBusqueda(LocacionFactory.getLocacion("Indistinto"),
					new Remuneracion_90mil(), new CargaHoraria_Media(), new TipoDePuesto_Senior(),
					new RangoEtario_MasDe50(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Terciario());
			FormularioDeBusqueda form3 = new FormularioDeBusqueda(LocacionFactory.getLocacion("Presencial"),
					new Remuneracion_90mil(), new CargaHoraria_Completa(), new TipoDePuesto_Management(),
					new RangoEtario_MenosDe40(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Secundario());
			FormularioDeBusqueda form4 = new FormularioDeBusqueda(LocacionFactory.getLocacion("HomeOffice"),
					new Remuneracion_30mil(), new CargaHoraria_Extendida(), new TipoDePuesto_Junior(),
					new RangoEtario_MasDe50(), new ExperienciaPrevia_Nada(), new EstudiosCursados_Primario());
			FormularioDeBusqueda form5 = new FormularioDeBusqueda(LocacionFactory.getLocacion("HomeOffice"),
					new Remuneracion_90mil(), new CargaHoraria_Completa(), new TipoDePuesto_Senior(),
					new RangoEtario_MenosDe40(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Secundario());
			FormularioDeBusqueda form6 = new FormularioDeBusqueda(LocacionFactory.getLocacion("Presencial"),
					new Remuneracion_30mil(), new CargaHoraria_Media(), new TipoDePuesto_Junior(),
					new RangoEtario_MenosDe40(), new ExperienciaPrevia_Nada(), new EstudiosCursados_Secundario());

			jorge.crearTicket(form1);
			pablo.crearTicket(form2);
			francoS.crearTicket(form3);
			francoP.crearTicket(form4);
			microsoft.crearTicket(form5, 2);
			carrefour.crearTicket(form6, 1);
			
			//System.out.println(Agencia.getInstancia().getUsuarios());
			Persiste.getInstancia().persistir();
		}

		// **************************************************************************************************************

		System.out.println("Esta admin : "+Agencia.getInstancia().getUsuarios().containsKey("admin"));
		
		System.out.println(Agencia.getInstancia().getUsuarios());
		// Persiste.getInstancia().leer();
		// System.out.println(Agencia.getInstancia().getUsuarios());

		// System.out.println(vistaSimulacion);
	}

}
