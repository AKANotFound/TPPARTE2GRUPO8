package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;

public class FuncionalidadEmpleador extends FuncionalidadPersona {	
	
	public FuncionalidadEmpleador(Persona_Empleador empleador) {
		super(empleador);
	}

	public void crearTicket(FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_Empleador) usuario, formulario, cantEmpleadosSolicitados));
	}
	
	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleador((Persona_Empleador) usuario);
	}

	@Override
	public void visualizaResultado() {
		if (!((Persona_Empleador) usuario).getEmpleadosContratados().isEmpty()) {
			System.out.println(((Persona_Empleador) usuario).getRazonSocial()+",contrataste a los siguientes empleados:");
			for (int i=0;i<((Persona_Empleador) usuario).getEmpleadosContratados().size();i++)
				System.out.println(((Persona_Empleador) usuario).getEmpleadosContratados().get(i));
		}
		else
			System.out.println("Lo sentimos "+((Persona_Empleador) usuario).getRazonSocial()+", no se ha podido generar ningun contrato");
	}

	@Override
	public String visualizarPersonasElegidas() {
		return usuario + " eligio a: " + ((Persona_Empleador) usuario).getEmpleadosElegidos();
	}
}
