package entidades;

public class Ticket_EmpleadoPretenso extends Ticket {
	private String resultado; //tener en cuenta para visual
	
	public Ticket_EmpleadoPretenso() {}
	
	
	public Ticket_EmpleadoPretenso(FormularioDeBusqueda formularioDeBusqueda) {
		super(formularioDeBusqueda);
		this.resultado="en proceso";
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getResultado() {
		return resultado;
	}
	
	
}
