package sistema;

import java.util.ArrayList;
import java.util.HashMap;

import entidades.Contrato;
import entidades.Cuenta;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket_EmpleadoPretenso;
import entidades.Ticket_Empleador;

class Agencia {
	private ArrayList<Persona_Empleador> empleadores = new ArrayList<Persona_Empleador>();
	private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = new ArrayList<Persona_EmpleadoPretenso>();
	private ArrayList<Ticket_EmpleadoPretenso> ticketsEmpleadosPretensos = new ArrayList<Ticket_EmpleadoPretenso>();
	private ArrayList<Ticket_Empleador> ticketsEmpleadores = new ArrayList<Ticket_Empleador>();
	private ArrayList<Cuenta> logins = new ArrayList<Cuenta>();
	private HashMap <String, Cuenta> cuentas = new HashMap <>();
	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	private static Agencia instancia = null;
	
	private Agencia() {}
	
	static Agencia getInstancia() {
    	if (instancia == null)
    		instancia = new Agencia();
    	return instancia;
    }
	
	ArrayList<Persona_Empleador> getEmpleadores() {
		return empleadores;
	}
	ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
	}
	ArrayList<Ticket_EmpleadoPretenso> getTicketsEmpleadosPretensos() {
		return ticketsEmpleadosPretensos;
	}
	ArrayList<Ticket_Empleador> getTicketsEmpleadores() {
		return ticketsEmpleadores;
	}
	ArrayList<Cuenta> getLogins() {
		return logins;
	}
	HashMap<String, Cuenta> getCuentas() {
		return cuentas;
	}
	ArrayList<Contrato> getContratos() {
		return contratos;
	}
}
