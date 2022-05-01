package prueba;

import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import excepciones.DatoIngresadoInvalidoException;
import excepciones.EdadInvalidaException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.TipoPersonaInvalidoException;
import sistema.Sistema;

public class Prueba {

	public static void main(String[] args) {

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

			e.printStackTrace();
		}

		try {
			Sistema.registrarEmpleador("carrefour", "empresaurio", "Carrefour", "fisica",
					new Rubro_ComercioInternacional());
		} catch (TipoPersonaInvalidoException e) {

			e.printStackTrace();
		}

		//LOGEO EMPLEADOS Y EMPRESARIOS
		try {
			Sistema.login("saimonmdp", "123abc");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			Sistema.login("hamilton", "abc123");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Sistema.login("ElKeizy", "contraseniajeje");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Sistema.login("LifeIsMusic", "vossabras");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Sistema.login("hamilton", "abc123");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Sistema.login("gesi", "empresajaja");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Sistema.login("carrefour", "empresaurio");
		} catch (ErrorContrasenaException | ErrorUsuarioException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//CREO TICKET DE EMPLEADOS Y EMPLEADORES
		
		Sistema.empleadoPretenso.crearTicket();

	}

}
