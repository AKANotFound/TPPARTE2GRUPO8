package modelo;

import java.util.ArrayList;
import java.util.HashMap;


public class Agencia {
    private ArrayList<Persona> empleadores = new ArrayList<Persona>();
    private ArrayList<Persona> empleadosPretensos = new ArrayList<Persona>();
    private ArrayList<Ticket_BusquedaEmpleo> ticketsEmpleado = new ArrayList<Ticket_BusquedaEmpleo>();
    private ArrayList<Ticket_BusquedaEmpleado> ticketsEmpleo = new ArrayList<Ticket_BusquedaEmpleado>();
    private ArrayList<Cuenta> logins = new ArrayList<Cuenta>();
    private HashMap <String, Cuenta> cuentas = new HashMap <>();
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
    
	public void agregarCuenta (Cuenta cuenta) ///tira excepcion
	{
		if (cuentas.putIfAbsent(cuenta.getUsuario(), cuenta) == null) //me devuelve null si no hay ningun elemento con este nombre
			this.cuentas.put(cuenta.getUsuario(), cuenta);
	}
	
	public void eliminarCuenta (Cuenta cuenta)
	{
		this.cuentas.remove(cuenta.getUsuario());
	}
	
		public void addEmpleado (Persona persona)
	{
		this.empleadosPretensos.add(persona);
	}
		
	public void addEmpleador (Persona empleador)
	{
		this.empleadores.add(empleador);
	}
	
	public void removeEmpleado (Persona empleado)
	{
		this.empleadosPretensos.remove(empleado);
	}
	
	public void removeEmpleador (Persona empleador)
	{
		this.empleadores.remove(empleador);
	}

	public ArrayList<Persona> getEmpleadores() {
		return empleadores;
	}

	public ArrayList<Persona> getEmpleadosPretensos() {
		return empleadosPretensos;
	}
	
	public void addLogins(Cuenta cuenta) {
		logins.add(cuenta);
	}
}
