package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import excepciones.ModificacionTicketInvalidaException;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadPersona {
	
	public FuncionalidadEmpleadoPretenso(Persona_EmpleadoPretenso empleado) {
		super(empleado);
	}

	public void crearTicket(FormularioDeBusqueda formulario)  {
		((Persona) usuario).setTicket(TicketFactory.crearTicket((Persona_EmpleadoPretenso) usuario, formulario));
		try {
			this.activarTicket();
		} catch (ModificacionTicketInvalidaException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void cancelarTicket() throws ModificacionTicketInvalidaException {
		super.cancelarTicket();
		Sistema.puntajeCancelar((Persona_EmpleadoPretenso) usuario);
	}

	@Override
	public void iniciarRondaEleccion() {
		RondaDeElecciones.iniciaRondaDeEleccionEmpleadoPretenso((Persona_EmpleadoPretenso) usuario);
	}
	
	public void modificarTelefono(String telefono) {
		((Persona_EmpleadoPretenso) usuario).setTelefono(telefono);
		
	}
	

	@Override
	public String visualizaResultado() {
		String str = null;
		System.out.println(((Persona_EmpleadoPretenso) usuario).getTicket().getEstado());
		if (((Persona_EmpleadoPretenso) usuario).getTicket().getEstado().equalsIgnoreCase("finalizado"))
			str = ((Persona_EmpleadoPretenso) usuario).getNya()+", fuiste contratado por: "+((Persona_EmpleadoPretenso) usuario).getEmpleadorActual().getRazonSocial();
		else
			str = "lo sentimos "+((Persona_EmpleadoPretenso) usuario).getNya()+", no fuiste contratado/a por ninguna empresa";
		return str;
	}

	@Override
	public String visualizarPersonasElegidas() {
		return ((Persona_EmpleadoPretenso) usuario).getNya() + " eligio a: [" + ((Persona_EmpleadoPretenso) usuario).getEmpleadorElegido() + "]";
	}

	@Override
	public String visualizarPersona() {
		return ((Persona_EmpleadoPretenso) usuario).getNya();
	}	
}
