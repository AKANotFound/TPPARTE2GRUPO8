package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Contrato {
	private GregorianCalendar fechaDeCreacion;
	private Persona_Empleador empleador;
	private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos;
	
	
	public Contrato(Persona_Empleador empleador, ArrayList<Persona_EmpleadoPretenso> empleadosPretensos,GregorianCalendar fechaDeCreacion) {
		super();
		this.empleador = empleador;
		this.empleadosPretensos = empleadosPretensos;
		this.fechaDeCreacion=fechaDeCreacion;
	}

	public GregorianCalendar getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public Persona_Empleador getEmpleador() {
		return empleador;
	}


	public ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
	}


	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return "Contrato [fechaDeCreacion=" + fechaDeCreacion.getTime().toLocaleString() + ", empleador=" + empleador + ", empleadosPretensos="
				+ empleadosPretensos + "]";
	}



	
}
