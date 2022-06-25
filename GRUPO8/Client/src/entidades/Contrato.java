package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Contrato {
	private GregorianCalendar fechaDeCreacion;

    /**
     * @aggregation composite
     */
    private Persona_Empleador empleador;

    /**
     * @aggregation composite
     */
    private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos;
	
    public Contrato() {
    	
    }
    
	public void setFechaDeCreacion(GregorianCalendar fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public void setEmpleador(Persona_Empleador empleador) {
		this.empleador = empleador;
	}

	public void setEmpleadosPretensos(ArrayList<Persona_EmpleadoPretenso> empleadosPretensos) {
		this.empleadosPretensos = empleadosPretensos;
	}

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

	@Override
	public String toString() {
		return empleador + " contrato a "+ empleadosPretensos ;
	}
	
}
