package sistema;

import entidades.Cuenta;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;

abstract class PersonaFactory {

	static Persona getEmpleador(String usuario, String contrasena, String razonSocial, String rubro, double sueldoOfrecido) {
		Persona persona = null;
		Cuenta cuenta = null;
		
		cuenta = new Cuenta(usuario, contrasena);
		persona = new Persona_Empleador(cuenta,razonSocial,rubro,sueldoOfrecido);
		
		return persona;
	}
	
	static Persona getEmpleadoPretenso(String usuario, String contrasena, String nya, String telefono, int edad) {
		Persona persona = null;
		Cuenta cuenta = null;
		
		cuenta = new Cuenta(usuario, contrasena);
		persona = new Persona_EmpleadoPretenso(cuenta,nya,telefono,edad);
		
		return persona;
	}
}
