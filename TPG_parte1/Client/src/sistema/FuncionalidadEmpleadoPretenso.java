package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import excepciones.ModificacionTicketInvalidaException;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) {
		super(empleado);
	}

	public void crearTicket(FormularioDeBusqueda formulario) {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
	}
	
	public void cancelarTicket() throws ModificacionTicketInvalidaException {
		super.cancelarTicket();
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) usuario);
	}

	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) usuario);
	}
	
	public void modificarTelefono(Persona_EmpleadoPretenso empleadoPretenso, String telefono) {
		empleadoPretenso.setTelefono(telefono);
	}
	

	@Override
	public void visualizaResultado() {
		if (((Persona_EmpleadoPretenso) usuario).getEmpleadorActual()!=null)
			System.out.println(((Persona_EmpleadoPretenso) usuario).getNya()+", fuiste contratado por:"+((Persona_EmpleadoPretenso) usuario).getEmpleadorActual());
		else
			System.out.println("lo sentimos "+((Persona_EmpleadoPretenso) usuario).getNya()+", no fuiste contratado por ninguna empresa");
	}

	@Override
	public String visualizarPersonasElegidas() {
		return usuario + " eligio a: " + ((Persona_EmpleadoPretenso) usuario).getEmpleadorElegido();
	}	
}
