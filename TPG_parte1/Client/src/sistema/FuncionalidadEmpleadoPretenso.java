package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Usuario;
import excepciones.ModificacionTicketInvalidaException;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {

	private Persona_EmpleadoPretenso empleado=(Persona_EmpleadoPretenso)super.persona;
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) 
	{
		super(empleado);
	}
	
	
	
	public Persona_EmpleadoPretenso getEmpleado() {
		return empleado;
	}

	public void crearTicket(FormularioDeBusqueda formulario) {
		//((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
		empleado.setTicket(TicketFactory.crearTicket(empleado, formulario));
	}
	
	public void cancelarTicket() throws ModificacionTicketInvalidaException {
		super.cancelarTicket();
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) persona);
	}

	/*@Override
	public void iniciarRondaEleccion(Persona persona) {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) persona);
	}*/
	
	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso(this.empleado);
	}
	public void modificarTelefono(Persona_EmpleadoPretenso empleadoPretenso, String telefono) {
		empleadoPretenso.setTelefono(telefono);
	}
	

	@Override
	public void visualizaResultado() {
		if (this.empleado.getEmpleadorActual()!=null)
			System.out.println(this.empleado.getNya()+", fuiste contratado por:"+this.empleado.getEmpleadorActual());
		else
			System.out.println("lo sentimos "+this.empleado.getNya()+", no fuiste contratado por ninguna empresa");
	}
	
}
