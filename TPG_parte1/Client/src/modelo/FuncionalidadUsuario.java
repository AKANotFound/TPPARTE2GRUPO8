package modelo;

public class FuncionalidadUsuario {
	
	
	public void activar(Ticket ticket) {
		ticket.estado = "Activo";		
	}
	
	public void suspender(Ticket ticket) {
		ticket.estado = "Suspendido";
	}
	
	public void cancelar(Ticket ticket) {
		ticket.estado = "Cancelado";
	}
	
	public void finalizar(Ticket ticket) {
		ticket.estado = "Finalizado";
	}
	
	public void modificarBusqueda(Ticket ticket,FormularioDeBusqueda form)
	{
		ticket.setFormularioDeBusqueda(form);
	}
	public void VisualizarListaDeAsignacion(Persona persona)
	{
		System.out.println(persona.getListaDeAsignacion());
	}
	
	public void iniciaRondaDeElecciones()
	{
		RondaDeElecciones.iniciaRondaDeElecciones();
	}

}
