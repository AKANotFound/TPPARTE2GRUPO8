package modelo;

import java.util.ArrayList;
import java.util.HashMap;


public class Agencia {
    private ArrayList<Persona_Empleador> empleadores = new ArrayList<Persona_Empleador>();
    private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = new ArrayList<Persona_EmpleadoPretenso>();
    private ArrayList<Ticket_BusquedaEmpleo> ticketsEmpleado = new ArrayList<Ticket_BusquedaEmpleo>();
    private ArrayList<Ticket_BusquedaEmpleado> ticketsEmpleo = new ArrayList<Ticket_BusquedaEmpleado>();
    private ArrayList<Cuenta> logins = new ArrayList<Cuenta>();
    private HashMap <String, Cuenta> cuentas = new HashMap <>();
    private ArrayList<Contrato> contratos;
    
    private static Agencia instancia = null;
  
    
    private Agencia() 
    {	
    }
    
    public static Agencia getInstancia()
    {
    	if (instancia == null)
    		instancia = new Agencia();
    	return instancia;
    }
    
    
	public ArrayList<Ticket_BusquedaEmpleo> getTicketsEmpleado() {
		return ticketsEmpleado;
	}

	public ArrayList<Ticket_BusquedaEmpleado> getTicketsEmpleo() {
		return ticketsEmpleo;
	}

	public ArrayList<Cuenta> getLogins() {
		return logins;
	}

	public HashMap<String, Cuenta> getCuentas() {
		return cuentas;
	}

	

	public ArrayList<Persona_Empleador> getEmpleadores() {
		return empleadores;
	}

	public ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
	}

	public ArrayList<Contrato> getContratos() {
		return contratos;
	}
	
	
}
