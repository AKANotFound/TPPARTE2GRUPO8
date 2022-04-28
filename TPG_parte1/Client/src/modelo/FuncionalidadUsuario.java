package modelo;

public class FuncionalidadUsuario {
	
	
	public void activar(Persona persona) {
		persona.getTicket().estado = "Activo";		
	}
	
	public void suspender(Persona persona) {
		persona.getTicket().estado = "Suspendido";
	}
	
	public void cancelar(Persona persona) {
		persona.getTicket().estado = "Cancelado";
	}
	
	public void finalizar(Persona persona) {
		persona.getTicket().estado = "Finalizado";
		
	}
	
	public void modificarBusqueda(Persona persona,FormularioDeBusqueda form)
	{
		persona.getTicket().setFormularioDeBusqueda(form);
	}
	public void VisualizarListaDeAsignacion(Persona persona)
	{
		System.out.println(persona.getListaDeAsignacion());
	}
	
	public void iniciaRondaDeElecciones()
	{
		RondaDeElecciones.iniciaRondaDeElecciones();
	}

	public void finalizarPuntaje(Persona_Empleador persona) {
		persona.setPuntaje(50);
	}
	
	public void finalizarPuntaje(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(10);
	}
	
	public void primerEmpleador(Persona_Empleador persona) {
		persona.setPuntaje(10);
	}
	
	public void cancelarTicket(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(-1);
	}
	
	public void ultimoEmpleadoPretenso(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(-5);
	}
	
	public void primerEmpleadoPretenso(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(5);
	}
}
