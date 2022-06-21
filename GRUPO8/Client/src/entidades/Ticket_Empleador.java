package entidades;

public class Ticket_Empleador extends Ticket {
	
	private int cantEmpleadosSolicitados; //tener en cuenta para visual
    private int cantEmpleadosObtenidos; //tener en cuenta para visual
    
    public Ticket_Empleador() {}
    
	public Ticket_Empleador(FormularioDeBusqueda formularioDeBusqueda,int cantEmpleadosSolicitados) {
		super(formularioDeBusqueda);
		this.cantEmpleadosSolicitados=cantEmpleadosSolicitados;
		this.cantEmpleadosObtenidos=0;
		
	}
    
	public void setCantEmpleadosSolicitados(int cantEmpleadosSolicitados) {
			this.cantEmpleadosSolicitados = cantEmpleadosSolicitados;
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
