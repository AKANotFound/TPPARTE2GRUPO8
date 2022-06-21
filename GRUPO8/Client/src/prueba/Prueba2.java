package prueba;

import java.io.IOException;
import java.util.ArrayList;

import entidades.Agencia;
import entidades.Contrato;
import entidades.FormularioDeBusqueda;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;
import excepciones.EdadInvalidaException;
import excepciones.ErrorCodigoException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.ListaNoGeneradaException;
import excepciones.TipoPersonaInvalidoException;
import persistencia.IPersistencia;
import persistencia.Persiste;
import persistencia.PersistenciaXML;
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

public class Prueba2 {

	public static void main(String[] args) {

		Persiste persiste = new Persiste();
	
		try {
			persiste.leer();
		} catch (IOException e2) {

			e2.printStackTrace();

			Rubro_ComercioLocal rubro_ComercioLocal = Rubro_ComercioLocal.getInstancia();
			Rubro_ComercioInternacional rubro_ComercioInternacional = Rubro_ComercioInternacional.getInstancia();
			Rubro_Salud rubro_Salud = Rubro_Salud.getInstancia();

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

			System.out.println("EMPLEADOS PRETENSOS Y EMPLEADORES REGISTRADOS");

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

			System.out.println("EMPLEADOS PRETENSOS, EMPLEADORES Y ADMINISTRADOR LOGUEADOS\n");

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

			System.out.println(admin.visualizarEmpleadores());
			System.out.println(admin.visualizarEmpleadosPretensos());

			System.out.println("EL ADMIN INICIA LA RONDA DE ENCUENTROS LABORALES");
			admin.iniciaRondaEncuentrosLaborales();

			System.out.println(
					"UNA VEZ TERMINADA LA RONDA DE ENCUENTROS LABORALES, CADA USUARIO VISUALIZA SU LISTA DE ASIGNACION \n");

			try {
				System.out.println("[" + jorge.getNya() + "] " + jorge.visualizarListaAsignacion());

			} catch (ListaNoGeneradaException e) {

				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				System.out.println("[" + pablo.getNya() + "] " + pablo.visualizarListaAsignacion());

			} catch (ListaNoGeneradaException e) {

				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				System.out.println("[" + francoS.getNya() + "] " + francoS.visualizarListaAsignacion());
			} catch (ListaNoGeneradaException e) {

				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				System.out.println("[" + francoP.getNya() + "] " + francoP.visualizarListaAsignacion());

			} catch (ListaNoGeneradaException e) {

				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				System.out.println("[" + microsoft.getRazonSocial() + "] " + microsoft.visualizarListaAsignacion());
			} catch (ListaNoGeneradaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				System.out.println("[" + carrefour.getRazonSocial() + "] " + carrefour.visualizarListaAsignacion());
			} catch (ListaNoGeneradaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			jorge.iniciarRondaEleccion();
			pablo.iniciarRondaEleccion();
			francoS.iniciarRondaEleccion();
			francoP.iniciarRondaEleccion();
			microsoft.iniciarRondaEleccion();
			carrefour.iniciarRondaEleccion();

			System.out
					.println("\nUNA VEZ FINALIZADA LA RONDA DE ELECCIONES, LOS USUARIOS ELIGEN VER SUS ELECCIONES \n");
			System.out.println(jorge.visualizarPersonasElegidas());
			System.out.println(pablo.visualizarPersonasElegidas());
			System.out.println(francoS.visualizarPersonasElegidas());
			System.out.println(francoP.visualizarPersonasElegidas());
			System.out.println(microsoft.visualizarPersonasElegidas());
			System.out.println(carrefour.visualizarPersonasElegidas());

			admin.iniciaRondaContratacion();

			System.out.println("\nVISUALIZACION DE CONTRATOS\n");
			System.out.println(Sistema.visualizarContratos());

			System.out.println("\nVISUALIZACION DE RESULTADOS\n");
			System.out.println(jorge.visualizaResultado());
			System.out.println(pablo.visualizaResultado());
			System.out.println(francoS.visualizaResultado());
			System.out.println(francoP.visualizaResultado());
			System.out.println(microsoft.visualizaResultado());
			System.out.println(carrefour.visualizaResultado());

			System.out.println("\nCOSTO DEL SERVICIO");
			System.out.println(jorge.getNya() + ": " + jorge.visualizarCostoServicio());
			System.out.println(pablo.getNya() + ": " + pablo.visualizarCostoServicio());
			System.out.println(francoS.getNya() + ": " + francoS.visualizarCostoServicio());
			System.out.println(francoP.getNya() + ": " + francoP.visualizarCostoServicio());
			System.out.println(microsoft.getRazonSocial() + ": " + microsoft.visualizarCostoServicio());
			System.out.println(carrefour.getRazonSocial() + ": " + carrefour.visualizarCostoServicio());

			// Persistencia
			persiste.persistir();
			try {
				persiste.leer();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Agencia.getInstancia().getEmpleadores());
		System.out.println(Agencia.getInstancia().getEmpleadosPretensos());
		System.out.println(Agencia.getInstancia().getContratos());
	}
}
