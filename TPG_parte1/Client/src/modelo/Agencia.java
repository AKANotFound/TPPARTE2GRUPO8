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
	
		public void addEmpleado (Persona_EmpleadoPretenso persona)
	{
		this.empleadosPretensos.add(persona);
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

	public ArrayList<Persona_Empleador> getEmpleadores() {
		return empleadores;
	}

	public ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
	}
	
	public void addLogins(Cuenta cuenta) {
		logins.add(cuenta);
	}
	
	public static Persona registrarse(String tipo,String usuario, String contrasena) {
		Persona persona = null;
		
		if(tipo.equals("empleado")) {
			persona = new Persona_EmpleadoPretenso(new Cuenta(usuario, contrasena));
			Agencia.getInstancia().addEmpleado((Persona_EmpleadoPretenso)persona);
		}
		else if(tipo.equals("empleador")) {
			persona = new Persona_Empleador(new Cuenta(usuario, contrasena));
			Agencia.getInstancia().addEmpleador((Persona_Empleador)persona);
		}
		
		return persona;
	}
	
	public void login(String usuario,String contrasena) {
        if(this.cuentas.get(usuario) != null) { //EXCEPCION
        	if(this.cuentas.get(usuario).confirmaContrasena(contrasena)) {//EXCEPCION
        		this.logins.add(this.cuentas.get(usuario));
        	}
        }
    }
}
