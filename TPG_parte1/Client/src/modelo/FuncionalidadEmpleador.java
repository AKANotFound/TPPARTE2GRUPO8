package modelo;

public class FuncionalidadEmpleador extends FuncionalidadUsuario {

	public FuncionalidadEmpleador() {
		// TODO Auto-generated constructor stub
	}

	public void primerPersona(Persona persona) {
		persona.setPuntaje(10);
	}

	@Override
	public void finalizarPuntaje(Persona persona) {
		persona.setPuntaje(50);
	}
}
