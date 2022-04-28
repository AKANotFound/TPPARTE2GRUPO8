package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class FuncionalidadAgencia {
	
	private ArrayList<Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
    private ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = Agencia.getInstancia().getEmpleadosPretensos();
    private ArrayList<Ticket_BusquedaEmpleo> ticketsEmpleado = Agencia.getInstancia().getTicketsEmpleado();
    private ArrayList<Ticket_BusquedaEmpleado> ticketsEmpleo = Agencia.getInstancia().getTicketsEmpleo();
    private ArrayList<Cuenta> logins = Agencia.getInstancia().getLogins();
    private HashMap <String, Cuenta> cuentas = Agencia.getInstancia().getCuentas();
    private ArrayList<Contrato> contratos = Agencia.getInstancia().getContratos();
	
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

	public void addLogins(Cuenta cuenta) {
		logins.add(cuenta);
	}
	
	
	
	public void login(String usuario,String contrasena) {
		Cuenta cuenta = this.cuentas.get(usuario);
		
        if(cuenta != null) { //EXCEPCION mal el usuario
        	if(!(this.logins.contains(cuenta)))
        		if(cuenta.confirmaContrasena(contrasena)) {//EXCEPCION mal contraseña
        			this.logins.add(this.cuentas.get(usuario));
        		}
        }
    }

	public ArrayList<Persona_Empleador> getEmpleadores() {
		return empleadores;
	}

	public ArrayList<Persona_EmpleadoPretenso> getEmpleadosPretensos() {
		return empleadosPretensos;
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
	
	public void VisualizacionEmpleadores()
	{
		for (int i=0;i<this.empleadores.size();i++)
			System.out.println(this.empleadores.get(i));
	}
	
	public void VisualizacionEmpleadosPretensos()
	{
		for (int i=0;i<this.empleadosPretensos.size();i++)
			System.out.println(this.empleadosPretensos.get(i));
	}
	
	public void VisualizacionSolicitudEmpleadores()
	{
		for (int i=0;i<this.ticketsEmpleo.size();i++)
			System.out.println(this.ticketsEmpleo.get(i));
	}
	
	public void VisualizacionSolicitudEmpleadosPretensos()
	{
		for (int i=0;i<this.ticketsEmpleado.size();i++)
			System.out.println(this.ticketsEmpleado.get(i));
	}
	
	public void CalculaComision()
	{
		//HACER
	}
	
	public void IniciaRondaDeEncuentrosLaborales()
	{
		RondaDeEncuentrosLaborales.generaListaAsignaciones();
		
	}
	
	public void IniciaRondaDeContrataciones()
	{
		//HACER
	}
	
	public void addContrato(Contrato contrato) 
	{
		this.contratos.add(contrato);
	}

}
