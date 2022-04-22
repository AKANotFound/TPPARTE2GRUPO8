package client;

import java.util.ArrayList;
import java.util.HashMap;


public class Agencia {
    ArrayList<Persona_Empleador> empleadores = new ArrayList<Persona_Empleador>();
    ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = new ArrayList<Persona_EmpleadoPretenso>();
    ArrayList<Ticket_BusquedaEmpleo> ticketsEmpleado = new ArrayList<Ticket_BusquedaEmpleo>();
    ArrayList<Ticket_BusquedaEmpleado> ticketsEmpleo = new ArrayList<Ticket_BusquedaEmpleado>();
    ArrayList<Cuenta> logins = new ArrayList<Cuenta>();
    HashMap <String, Cuenta> cuentas = new HashMap <>();
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
	
	public boolean login (String usuario, String contrasena) //Excepcion a chequear
	{														// pre condicion : el usuario no se logee 2 veces
		boolean aux;
		aux = this.cuentas.get(usuario).verificaLogin(contrasena);
		if(aux == true)
			this.logins.add(this.cuentas.get(usuario));
		return aux;
	}
		public void addEmpleado (Persona_EmpleadoPretenso empleado)
	{
		this.empleadosPretensos.add(empleado);
	}
	public void addEmpleador (Persona_Empleador empleador)
	{
		this.empleadores.add(empleador);
	}
	public void removeEmpleado (Persona_EmpleadoPretenso empleado)
	{
		this.empleadosPretensos.remove(empleado);
	}
	public void removeEmpleador (Persona_Empleador empleador)
	{
		this.empleadores.remove(empleador);
	}
	
}
