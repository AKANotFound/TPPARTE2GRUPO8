package modelo;

public abstract class FuncionalidadUsuario {
	
	
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
		finalizarPuntaje(persona);
		
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

	public abstract void finalizarPuntaje(Persona persona);
	
	public abstract void primerPersona(Persona persona);	
}
