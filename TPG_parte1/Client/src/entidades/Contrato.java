package entidades;

import java.util.ArrayList;

public class Contrato {

	private Persona_Empleador empleador;
	private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos;
	
	
	public Contrato(Persona_Empleador empleador, ArrayList<Persona_EmpleadoPretenso> empleadosPretensos) {
		super();
		this.empleador = empleador;
		this.empleadosPretensos = empleadosPretensos;
	}

	
	
	public Persona_Empleador getEmpleador() {
		return empleador;
	}



	public ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
	}



	@Override
	public String toString() {
		return "Contrato [empleador=" + empleador + ", empleadosPretensos=" + empleadosPretensos
				+ "]";
	}
	 
}
