package client;

public class Ticket implements ITicket{
    private String fechaAlta;
    private String estado;
    private FormularioDeBusqueda formularioDeBusqueda;
    
	@Override
	public void activar() {
		this.estado = "Activo";		
	}
	@Override
	public void suspender() {
		this.estado = "Suspendido";
	}
	@Override
	public void cancelar() {
		this.estado = "Cancelado";
	}
	@Override
	public void finalizar() {
		this.estado = "Finalizado";
	}
	@Override
	public void modificarBusqueda(FormularioDeBusqueda form) {
		// TODO Auto-generated method stub
		
	}
	public FormularioDeBusqueda getFormularioDeBusqueda() {
		return formularioDeBusqueda;
	}

	
}
