package prueba;

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
import sistema.Sistema;

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
		
	}

}
