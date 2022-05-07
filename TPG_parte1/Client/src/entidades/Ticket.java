package entidades;

import java.util.GregorianCalendar;

public abstract class Ticket {
    private GregorianCalendar fechaAlta; //tener en cuenta para visual
    protected String estado;

    /**
     * @aggregation shared
     */
    private FormularioDeBusqueda formularioDeBusqueda;
    
    public void setEstado(String estado) {
		this.estado = estado;
	}

	public Ticket(FormularioDeBusqueda formularioDeBusqueda) {
		super();
		this.formularioDeBusqueda = formularioDeBusqueda;
		this.fechaAlta=new GregorianCalendar();
		this.estado = " activo";
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

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return " [Fecha de alta = " + fechaAlta.getTime().toLocaleString() + ", estado=" + estado + ", formulario de busqueda="
				+ formularioDeBusqueda+ "]";
	}
	
	
}
