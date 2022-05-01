package factory;

import entidades.Cuenta;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Rubro;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;

public abstract class PersonaFactory {

	public static Persona registrarEmpleador(String usuario, String contrasena, String razonSocial, String tipoRubro, double sueldoOfrecido) {
		Persona persona = null;
		Rubro rubro = null;
		Cuenta cuenta = null;
		
		if(tipoRubro.equals("comercio internacional"))
			rubro = new Rubro_ComercioInternacional();
		else if(tipoRubro.equals("comercio local"))
			rubro = new Rubro_ComercioLocal();
		else if(tipoRubro.equals("salud"))
			rubro = new Rubro_Salud();
		
		cuenta = new Cuenta(usuario, contrasena);
		persona = new Persona_Empleador(cuenta,razonSocial,rubro,sueldoOfrecido);
		
		return persona;
	}
	
	public static Persona registrarEmpleadoPretenso(String usuario, String contrasena, String nya, String telefono, int edad) {
		Persona persona = null;
		Cuenta cuenta = null;
		
		cuenta = new Cuenta(usuario, contrasena);
		persona = new Persona_EmpleadoPretenso(cuenta,nya,telefono,edad);
		
		return persona;
	}
}
