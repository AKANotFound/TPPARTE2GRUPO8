package entidades;

import java.util.ArrayList;
import java.util.HashMap;

import sistema.FuncionalidadAdministrador;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
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
	private HashMap <String, Usuario> usuarios = new HashMap <>(); 
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
    private String tipoUsuarioActual = null;
    //private String usuarioActual = null;
    private FuncionalidadAdministrador funcAdministradorActual = null;
    private FuncionalidadEmpleador funcEmpleadorActual = null;
    private FuncionalidadEmpleadoPretenso funcEmpleadoPretensoActual = null;
    
    
    public final static String ADMINISTRADOR = "Administrador";
	public final static String EMPLEADOR = "Empleador";
	public final static String EMPLEADO_PRETENSO = "EmpleadoPretenso";
    
    private static Agencia instancia = null;
    
    private String codigoAdministrador="XAEA-12";
	 
	public static Agencia getInstancia() {
    	if (instancia == null)
    		instancia = new Agencia();
    	return instancia;
    }
	
	public FuncionalidadAdministrador getFuncAdministradorActual() {
		return funcAdministradorActual;
	}

	public void setFuncAdministradorActual(FuncionalidadAdministrador funcAdministradorActual) {
		this.funcAdministradorActual = funcAdministradorActual;
	}

	public FuncionalidadEmpleador getFuncEmpleadorActual() {
		return funcEmpleadorActual;
	}

	public void setFuncEmpleadorActual(FuncionalidadEmpleador funcEmpleadorActual) {
		this.funcEmpleadorActual = funcEmpleadorActual;
	}



	public FuncionalidadEmpleadoPretenso getFuncEmpleadoPretensoActual() {
		return funcEmpleadoPretensoActual;
	}


	
	public void setFuncEmpleadoPretensoActual(FuncionalidadEmpleadoPretenso funcEmpleadoPretensoActual) {
		this.funcEmpleadoPretensoActual = funcEmpleadoPretensoActual;
	}

	/*public String getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(String usuarioActual) {
		this.usuarioActual = usuarioActual;
	}*/

	public String getTipoUsuarioActual() {
		return tipoUsuarioActual;
	}
	
	public void setUsuarios(HashMap<String, Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setTipoUsuarioActual(String tipoUsuarioActual) {
		this.tipoUsuarioActual = tipoUsuarioActual;
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
	public HashMap<String, Usuario> getUsuarios() {
		return usuarios;
	}
	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public String getCodigoAdministrador()
	{
		return codigoAdministrador;
	}

	public void setEmpleadores(ArrayList<Persona_Empleador> empleadores) {
		this.empleadores = empleadores;
	}

	public void setEmpleadosPretensos(ArrayList<Persona_EmpleadoPretenso> empleadosPretensos) {
		this.empleadosPretensos = empleadosPretensos;
	}

	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratos = contratos;
	}


	
	
}
