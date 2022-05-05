package prueba;

import entidades.FormularioDeBusqueda;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import excepciones.DatoIngresadoInvalidoException;
import excepciones.EdadInvalidaException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.TipoPersonaInvalidoException;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
import sistema.FuncionalidadUsuario;
import sistema.LocacionFactory;
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
import tablas.RangoEtario_De40A50;
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

		try {
			Sistema.registrarEmpleador("gesi", "empresajaja", "Grupo ESI", "juridica", new Rubro_ComercioLocal());
		} catch (TipoPersonaInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			Sistema.registrarEmpleador("carrefour", "empresaurio", "Carrefour", "fisica", new Rubro_ComercioInternacional());
		} catch (TipoPersonaInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		//LOGEO EMPLEADOS Y EMPRESARIOS
		try {
			saimonmdp = (FuncionalidadEmpleadoPretenso) Sistema.loginEmpleadoPretenso("saimonmdp", "123abc");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			hamilton = (FuncionalidadEmpleadoPretenso) Sistema.loginEmpleadoPretenso("hamilton", "abc123");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			ElKeizy = (FuncionalidadEmpleadoPretenso) Sistema.loginEmpleadoPretenso("ElKeizy", "contraseniajeje");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			LifeIsMusic = (FuncionalidadEmpleadoPretenso) Sistema.loginEmpleadoPretenso("LifeIsMusic", "vossabras");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			gesi = (FuncionalidadEmpleador) Sistema.loginEmpleador("gesi", "empresajaja");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			carrefour = (FuncionalidadEmpleador) Sistema.loginEmpleador("carrefour", "empresaurio");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		//CREO TICKET DE EMPLEADOS Y EMPLEADORES
		FormularioDeBusqueda form1 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Home Office"), new Remuneracion_90mil(), new CargaHoraria_Extendida(), new TipoDePuesto_Management(), new RangoEtario_MasDe50(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Terciario());
		FormularioDeBusqueda form2 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Presencial"), new Remuneracion_60mil(), new CargaHoraria_Completa(), new TipoDePuesto_Senior(), new RangoEtario_MenosDe40(), new ExperienciaPrevia_Media(), new EstudiosCursados_Secundario());
		FormularioDeBusqueda form3 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Indistinto"), new Remuneracion_30mil(), new CargaHoraria_Media(), new TipoDePuesto_Junior(), new RangoEtario_De40A50(), new ExperienciaPrevia_Nada(), new EstudiosCursados_Primario());
		FormularioDeBusqueda form4 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Indistinto"), new Remuneracion_60mil(), new CargaHoraria_Media(), new TipoDePuesto_Junior(), new RangoEtario_MenosDe40(), new ExperienciaPrevia_Mucha(), new EstudiosCursados_Secundario());
		FormularioDeBusqueda form5 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Presencial"), new Remuneracion_90mil(), new CargaHoraria_Extendida(), new TipoDePuesto_Senior(), new RangoEtario_De40A50(), new ExperienciaPrevia_Media(), new EstudiosCursados_Terciario());
		FormularioDeBusqueda form6 = new FormularioDeBusqueda (LocacionFactory.getLocacion("Home Office"), new Remuneracion_30mil(), new CargaHoraria_Completa(), new TipoDePuesto_Management(), new RangoEtario_MasDe50(), new ExperienciaPrevia_Media(), new EstudiosCursados_Terciario());
		saimonmdp.crearTicket(form1);
		hamilton.crearTicket(form2);
		LifeIsMusic.crearTicket(form3);
		ElKeizy.crearTicket(form4);
		gesi.crearTicket(form5, 3);
		carrefour.crearTicket(form6, 2);
		
	    
		
		
		
	}

}
