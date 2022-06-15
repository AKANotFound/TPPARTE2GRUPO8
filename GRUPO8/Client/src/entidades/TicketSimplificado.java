package entidades;

import tablas.ILocacion;

public class TicketSimplificado
{
	private ILocacion locacion;
	private IRubro rubro;
	private Persona_Empleador empleador=null;
	
	public TicketSimplificado(ILocacion locacion, IRubro rubro, Persona_Empleador empleador)
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

	public Persona_Empleador getEmpleador()
	{
		return empleador;
	}
	
	

}
