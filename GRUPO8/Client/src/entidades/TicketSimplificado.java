package entidades;

import tablas.ILocacion;

public class TicketSimplificado
{
	private ILocacion locacion;
	private IRubro rubro;
	private Simulacion_Empleador empleador=null;
	
	public TicketSimplificado() {}
	
	public TicketSimplificado(ILocacion locacion, IRubro rubro, Simulacion_Empleador empleador)
	{
		super();
		this.locacion = locacion;
		this.rubro = rubro;
		this.empleador = empleador;
	}

	public ILocacion getLocacion() {
		return locacion;
	}

	public IRubro getRubro() {
		return rubro;
	}

	public Simulacion_Empleador getEmpleador()
	{
		return empleador;
	}

	public void setLocacion(ILocacion locacion) {
		this.locacion = locacion;
	}

	public void setRubro(IRubro rubro) {
		this.rubro = rubro;
	}

	public void setEmpleador(Simulacion_Empleador empleador) {
		this.empleador = empleador;
	}
	

}
