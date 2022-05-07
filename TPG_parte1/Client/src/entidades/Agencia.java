package entidades;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Clase singleton que contiene la informacion de todo el sistema, incluyendo a los empleadores, empleados, con sus respectivos tickets,contratos y logeos.
 * <br>Patron aplicado: Singleton.
 * <br>@author Grupo 8 
 */

public class Agencia {
    /**
     * @aggregation composite
     */
    private ArrayList<Persona_Empleador> empleadores = new ArrayList<Persona_Empleador>();

    /**
     * @aggregation composite
     */
    private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = new ArrayList<Persona_EmpleadoPretenso>();

    /**
     * @aggregation composite
     */
    private ArrayList<Ticket_EmpleadoPretenso> ticketsEmpleadosPretensos = new ArrayList<Ticket_EmpleadoPretenso>();

    /**
     * @aggregation composite
     */
    private ArrayList<Ticket_Empleador> ticketsEmpleadores = new ArrayList<Ticket_Empleador>();

    /**
     * @aggregation composite
     */
    private ArrayList<Cuenta> logins = new ArrayList<Cuenta>();
	private HashMap <String, Usuario> usuarios = new HashMap <>();

    /**
     * @aggregation composite
     */
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

    /**
     * @aggregation composite
     */
    private static Agencia instancia = null;
	 
	private Agencia() {}
	 
	public static Agencia getInstancia() {
    	if (instancia == null)
    		instancia = new Agencia();
    	return instancia;
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
