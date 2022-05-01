package entidades;

import java.util.GregorianCalendar;

public abstract class Ticket {
    private GregorianCalendar fechaAlta;
    protected String estado;
    private FormularioDeBusqueda formularioDeBusqueda;
    
    public void setEstado(String estado) {
		this.estado = estado;
	}

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

	public String getEstado() {
		return estado;
	}
	
	
	
}
