package entidades;

import java.util.ArrayList;
import java.util.HashMap;

import sistema.FuncionalidadAdministrador;
/**
 * Clase singleton que contiene la informacion de todo el sistema, incluyendo a los empleadores, empleados, con sus respectivos tickets,contratos y logeos.
 * <br>Patron aplicado: Singleton.
 * <br>@author Grupo 8 
 */

public class Agencia {
	private ArrayList<Persona_Empleador> empleadores = new ArrayList<Persona_Empleador>();
	private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = new ArrayList<Persona_EmpleadoPretenso>();
	private ArrayList<Ticket_EmpleadoPretenso> ticketsEmpleadosPretensos = new ArrayList<Ticket_EmpleadoPretenso>();
	private ArrayList<Ticket_Empleador> ticketsEmpleadores = new ArrayList<Ticket_Empleador>();
	private ArrayList<Cuenta> logins = new ArrayList<Cuenta>();
	private HashMap <String, Usuario> usuarios = new HashMap <>();
	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	private static Agencia instancia = null;
	private FuncionalidadAdministrador funcionalidad = new FuncionalidadAdministrador();
	 
	private Agencia() {}
	 
	public static Agencia getInstancia() {
    	if (instancia == null)
    		instancia = new Agencia();
    	return instancia;
    }
	 
	
	public FuncionalidadAdministrador getFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(FuncionalidadAdministrador funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
 
	public ArrayList<Persona_Empleador> getEmpleadores() {
		return empleadores;
	}
	public ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
	}
	public ArrayList<Ticket_EmpleadoPretenso> getTicketsEmpleadosPretensos() {
		return ticketsEmpleadosPretensos;
	}
	public ArrayList<Ticket_Empleador> getTicketsEmpleadores() {
		return ticketsEmpleadores;
	}
	public ArrayList<Cuenta> getLogins() {
		return logins;
	}
	public HashMap<String, Usuario> getUsuarios() {
		return usuarios;
	}
	public ArrayList<Contrato> getContratos() {
		return contratos;
	}
}
