package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;

public class FuncionalidadEmpleador extends FuncionalidadPersona {
	
	public void crearTicket(Persona_Empleador empleador, FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		Sistema.crearTicket(empleador, formulario, cantEmpleadosSolicitados);
	}

	@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleador((Persona_Empleador) persona);
	}
}
