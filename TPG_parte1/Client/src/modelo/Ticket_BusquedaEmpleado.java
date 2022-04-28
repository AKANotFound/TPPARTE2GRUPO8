package modelo;

public class Ticket_BusquedaEmpleado extends Ticket {
	
	private int cantEmpleadosSolicitados;
    private int cantEmpleadosObtenidos;
    
    public Ticket_BusquedaEmpleado(FormularioDeBusqueda formularioDeBusqueda,int cantEmpleadosSolicitados) {
		super(formularioDeBusqueda);
		this.cantEmpleadosSolicitados=cantEmpleadosSolicitados;
		this.cantEmpleadosObtenidos=0;
		
	}
    
	public int getCantEmpleadosSolicitados() {
		return cantEmpleadosSolicitados;
	}
	public int getCantEmpleadosObtenidos() {
		return cantEmpleadosObtenidos;
	}

	public void setCantEmpleadosObtenidos(int cantEmpleadosObtenidos) {
		this.cantEmpleadosObtenidos = cantEmpleadosObtenidos;
	}
    
	
    
}
