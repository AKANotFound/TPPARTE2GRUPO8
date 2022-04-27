package modelo;

import java.util.GregorianCalendar;

public class Ticket {
    private GregorianCalendar fechaAlta;
    protected String estado;
    private FormularioDeBusqueda formularioDeBusqueda;
    
	
    
    public Ticket(FormularioDeBusqueda formularioDeBusqueda) {
		super();
		this.formularioDeBusqueda = formularioDeBusqueda;
		this.fechaAlta=new GregorianCalendar();
	}
	
	public FormularioDeBusqueda getFormularioDeBusqueda() {
		
		return formularioDeBusqueda;
	}

	public void setFormularioDeBusqueda(FormularioDeBusqueda formularioDeBusqueda) {
		this.formularioDeBusqueda = formularioDeBusqueda;
	}
	
	
	
}
