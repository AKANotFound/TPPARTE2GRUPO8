package client;

public interface ITicket {
	
	void activar();
	void suspender();
	void cancelar();
	void finalizar();
	void modificarBusqueda(FormularioDeBusqueda form);
	
	
}
