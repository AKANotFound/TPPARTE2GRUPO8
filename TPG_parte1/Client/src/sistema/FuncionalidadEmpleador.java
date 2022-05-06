package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_Empleador;
import entidades.Usuario;

public class FuncionalidadEmpleador extends FuncionalidadPersona {

	private Persona_Empleador empleador=(Persona_Empleador)super.persona;
	
	
	public FuncionalidadEmpleador(Persona_Empleador empleador) {
		super(empleador);
	}

	public FuncionalidadEmpleador() {
		// TODO Auto-generated constructor stub
	}

	
	public Persona_Empleador getEmpleador() {
		return empleador;
	}

	public void crearTicket(FormularioDeBusqueda formulario, int cantEmpleadosSolicitados) {
		empleador.setTicket(TicketFactory.crearTicket(empleador, formulario, cantEmpleadosSolicitados));
	}
	
	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleador(this.empleador);
	}

	@Override
	public void visualizaResultado() {
	  if (!empleador.getEmpleadosContratados().isEmpty())
	  {	System.out.println(this.empleador.getRazonSocial()+",contrataste a los siguientes empleados:");
		for (int i=0;i<empleador.getEmpleadosContratados().size();i++)
			System.out.println(empleador.getEmpleadosContratados().get(i));
	  }
		else
			System.out.println("Lo sentimos "+empleador.getRazonSocial()+", no se ha podido generar ningun contrato");
		
	}
}
