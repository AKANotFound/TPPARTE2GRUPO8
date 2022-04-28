package modelo;

import java.util.ArrayList;

public class Contrato {

	private Persona_Empleador empleadorContrata;
	private ArrayList<Persona_EmpleadoPretenso> empleadosContratados;
	
	
	public Contrato(Persona_Empleador empleador) {
		super();
		this.empleadorContrata = empleador;
	}
	
	public void addEmpleadosContratados(Persona_EmpleadoPretenso empleado) {
		this.empleadosContratados.add(empleado);
	}

	@Override
	public String toString() {
		return "Contrato [empleadorContrata=" + empleadorContrata + ", empleadosContratados=" + empleadosContratados
				+ "]";
	}
	
	
}
