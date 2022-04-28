package modelo;

public class FuncionalidadEmpleadoPretenso extends FuncionalidadUsuario {

	public FuncionalidadEmpleadoPretenso() {
		// TODO Auto-generated constructor stub
	}

	public void primerPersona(Persona persona) {
		persona.setPuntaje(5);
	}
	
	public void cancelarTicket(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(-1);
	}
	
	public void ultimoEmpleadoPretenso(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(-5);
	}

	@Override
	public void finalizarPuntaje(Persona persona) {
		persona.setPuntaje(10);
	}
}
