package sistema;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

import entidades.Administrador;
import entidades.Agencia;
import entidades.Contrato;
import entidades.Cuenta;
import entidades.IRubro;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Ticket;
import entidades.Ticket_EmpleadoPretenso;
import entidades.Usuario;
import excepciones.EdadInvalidaException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.ListaNoGeneradaException;
import excepciones.TipoPersonaInvalidoException;
/**
 * 
 * @author Grupo 8 
 * Clase que representa al sistema, encargada de instanciar personas, realizar los registros de usuarios y sus logins.
 */
public abstract class Sistema {
	
	private static ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = Agencia.getInstancia().getEmpleadosPretensos();
	private static ArrayList<Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
	private static ArrayList<Cuenta> logins = Agencia.getInstancia().getLogins();
	private static ArrayList<Contrato> contratos = Agencia.getInstancia().getContratos();
	private static HashMap <String, Usuario> usuarios = Agencia.getInstancia().getUsuarios();
	private static boolean InicioRondaEncuentrosLaborales=false;
	
	/**
	 * Crea un empleador y su cuenta, lo agrega en la lista donde se preservan a todos los empleadores. Se llama el metodo que agrega la cuenta al hashmap de usuarios. <br>
	 * <b>Pre: </b> usuario debe ser distinto de null <br>
	 * <b>Pre: </b> contrasena debe ser distinto de null <br> 
	 * <b>Pre: </b> razonSocial debe ser distinto de null <br>
	 * tipoPersona si es un tipo de persona invalido, lanza la excepcion TipoPersonaInvalidoException <br>
	 * <b>Pre: </b> rubro	debe ser distinto de null <br>
	 * <b>Pre: </b> puntajeAspectos debe ser distinto de null y que el array posea 7 elementos <br>
	 * <b>Post: </b> Crea un empleador y su cuenta, lo agrega en la lista donde se preservan a todos los empleadores. Se llama el metodo que agrega la cuenta al hashmap de usuarios.
	 * @throws TipoPersonaInvalidoException <br>
	 */
	
	public static void registrarEmpleador(String usuario, String contrasena, String razonSocial, String tipoPersona, IRubro rubro,double[] puntajeAspectos) throws TipoPersonaInvalidoException {
		if (!tipoPersona.equalsIgnoreCase("fisica") && !tipoPersona.equalsIgnoreCase("juridica"))
			throw new TipoPersonaInvalidoException(tipoPersona);
		Persona_Empleador empleador = (Persona_Empleador) PersonaFactory.getEmpleador(usuario, contrasena,razonSocial, tipoPersona, rubro,puntajeAspectos);
		empleadores.add(empleador);
		Sistema.agregarUsuario(empleador);
	}
	
	public static void registrarEmpleadoPretenso(String usuario, String contrasena, String nya, String telefono, int edad) throws EdadInvalidaException {
		if (edad<16)
			throw new EdadInvalidaException(Integer.toString(edad));
		Persona_EmpleadoPretenso empleadoPretenso = (Persona_EmpleadoPretenso) PersonaFactory.getEmpleadoPretenso(usuario, contrasena, nya, telefono, edad);
		empleadosPretensos.add(empleadoPretenso) ;
		Sistema.agregarUsuario(empleadoPretenso);
	} 
	
	/**
	 *  Si el usuario esta registrado en el sistema y la contrasenia es correcta, hace su login.
	 * @param nombreUsuario Parametro de tipo String que representa el nombre de usuario de la persona.
	 * @param contrasena	Parametro de tipo String que representa la contrasenia del usuario.
	 * @return Retorna una instancia de Funcionalidad Empleador.
	 * @throws ErrorContrasenaException	Excepcion que es lanzada cuando la contrasenia es incorrecta.
	 * @throws ErrorUsuarioException Excepcion que es lanzada cuando la cuenta no existe, o el usuario es incorrecto.
	 */
		
	public static FuncionalidadEmpleador loginEmpleador(String nombreUsuario,String contrasena) throws ErrorContrasenaException,ErrorUsuarioException 
	{
		Usuario usuario = usuarios.get(nombreUsuario);
		Cuenta cuenta = usuario.getCuenta();
		FuncionalidadEmpleador funcionalidadUsuario = null;
		
        if(cuenta!= null) {
        	if(cuenta.confirmaContrasena(contrasena)) {
        		if(!(logins.contains(cuenta)))
        			logins.add(cuenta);
        		funcionalidadUsuario = new FuncionalidadEmpleador((Persona_Empleador) usuario);		       		
        	}
        	else
        		throw new ErrorContrasenaException(contrasena);
        }
        else
        	throw new ErrorUsuarioException(nombreUsuario);
        
		return funcionalidadUsuario;
    }
	
	public static boolean isInicioRondaEncuentrosLaborales() {
		return InicioRondaEncuentrosLaborales;
	}

	public static void setInicioRondaEncuentrosLaborales(boolean inicioRondaEncuentrosLaborales) {
		InicioRondaEncuentrosLaborales = inicioRondaEncuentrosLaborales;
	}

	public static FuncionalidadEmpleadoPretenso loginEmpleadoPretenso(String nombreUsuario,String contrasena) throws ErrorContrasenaException,ErrorUsuarioException 
	{
		Usuario usuario = usuarios.get(nombreUsuario);
		Cuenta cuenta = usuario.getCuenta();
		FuncionalidadEmpleadoPretenso funcionalidadUsuario = null;
		
        if(cuenta!= null) {
        	if(cuenta.confirmaContrasena(contrasena)) {
        		if(!(logins.contains(cuenta)))
        			logins.add(cuenta);
        		funcionalidadUsuario = new FuncionalidadEmpleadoPretenso((Persona_EmpleadoPretenso) usuario);		       		
        	}
        	else
        		throw new ErrorContrasenaException(contrasena);
        }
        else
        	throw new ErrorUsuarioException(nombreUsuario);
        
		return funcionalidadUsuario;
    }
	
	public static FuncionalidadAdministrador loginAdmin(String nombreUsuario,String contrasena) throws ErrorContrasenaException,ErrorUsuarioException 
	{
		Usuario usuario = usuarios.get(nombreUsuario);
		Cuenta cuenta = usuario.getCuenta();
		FuncionalidadAdministrador funcionalidadUsuario = null;
		
        if(cuenta!= null) {
        	if(cuenta.confirmaContrasena(contrasena)) {
        		if(!(logins.contains(cuenta)))
        			logins.add(cuenta);
        		funcionalidadUsuario = new FuncionalidadAdministrador();		       		
        	}
        	else
        		throw new ErrorContrasenaException(contrasena);
        }
        else
        	throw new ErrorUsuarioException(nombreUsuario);
        
		return funcionalidadUsuario;
    }
	
	static void agregarContrato(Persona_Empleador empleador, ArrayList<Persona_EmpleadoPretenso> empleadosPretensos,GregorianCalendar fechaDeCreacion) {
		contratos.add(new Contrato(empleador,empleadosPretensos,fechaDeCreacion));
	}
	
	private static void agregarUsuario (Usuario usuario) { 
		if (usuarios.putIfAbsent(usuario.getCuenta().getUsuario(), usuario) == null) 
			usuarios.put(usuario.getCuenta().getUsuario(), usuario);
	}
	
	/** 
	 * Metodo que calcula la comision que obtiene la agencia cuando un empleador contrata un empleado.
	 * @param empleador Parametro de tipo Persona_Empleador representa a un empleador.
	 * <b>Pre: </b> Empleador debe ser distinto de null <b>
	 * <b>Post: </b> Setea el valor de la comision calculada (dependiendo el tipo de persona del empleador) en el atributo CostoServicio del empleador.
	 */
	
	static void calculaComision(Persona_Empleador empleador) {
		String tipoPersona = empleador.getTipoPersona();
		IRubro rubro = empleador.getRubro();
		double remuneracion = empleador.getRemuneracion();
		double comision = 0;
		
		if(tipoPersona.equalsIgnoreCase("fisica"))
			comision = rubro.calculaComisionPersonaFisica(remuneracion);
		else if(tipoPersona.equalsIgnoreCase("juridica"))
			comision = rubro.calculaComisionPersonaJuridica(remuneracion);
		
		comision *= (100 - empleador.getPuntaje())/100;
		
		empleador.setCostoServicio(comision);
	}
	
	/** 
	 * Metodo que calcula la comision que obtiene la agencia cuando un empleado es  contratado.
	 * @param empleadoPretenso Parametro de tipo Persona_EmpleadoPretenso representa a un empleado.
	 * <b>Pre: </b> empleadoPretenso debe ser distinto de null <b>
	 * <b>Post: </b> Setea el valor de la comision calculada (dependiendo el tipo de puesto) en el atributo CostoServicio del empleador.
	 */
	static void calculaComision(Persona_EmpleadoPretenso empleadoPretenso) {
		String tipoDePuesto = empleadoPretenso.getTipoDePuesto();
		double remuneracion = empleadoPretenso.getRemuneracion();
		double comision = 0;
		
		if(tipoDePuesto.equalsIgnoreCase("junior"))
			comision = remuneracion * 0.8;
		else if(tipoDePuesto.equalsIgnoreCase("senior"))
			comision = remuneracion * 0.9;
		else if(tipoDePuesto.equalsIgnoreCase("managment"))
			comision = remuneracion;
		
		comision *= (100 - empleadoPretenso.getPuntaje())/100;
		
		empleadoPretenso.setCostoServicio(comision);
	}
	/**
	 * Metodo que modifica el estado del ticket de un empleador a finalizado, una vez que se completo el contrato.
	 * @param empleador
	 * <b>Post: </b> El estado del ticket pasa a finalizado, y el puntaje del empleador aumenta en 50.
	 */
	
	static void finalizarTicket(Persona_Empleador empleador) {
		empleador.getTicket().setEstado("finalizado");
		Sistema.puntajeFinalizar(empleador);
	}
	
	static void finalizarTicket(Persona_EmpleadoPretenso empleadoPretenso) {
		empleadoPretenso.getTicket().setEstado("finalizado");
		Sistema.puntajeFinalizar(empleadoPretenso);
	}
	
	private static void puntajeFinalizar(Persona_EmpleadoPretenso empleadoPretenso) {
		empleadoPretenso.setPuntaje(empleadoPretenso.getPuntaje() + 10);
	}
	
	private static void puntajeFinalizar(Persona_Empleador empleador) {
		empleador.setPuntaje(empleador.getPuntaje() + 50);
	}
	
	static void puntajeCancelar(Persona_EmpleadoPretenso empleadoPretenso) {
		empleadoPretenso.setPuntaje(empleadoPretenso.getPuntaje() - 1);
	}
	
	static void puntajeUltimo(Persona_EmpleadoPretenso empleadoPretenso) {
		empleadoPretenso.setPuntaje(empleadoPretenso.getPuntaje() - 5);
	}

	static void puntajePrimero(Persona_EmpleadoPretenso empleadoPretenso) {
		empleadoPretenso.setPuntaje(empleadoPretenso.getPuntaje() + 5);
	}

	static void puntajePrimero(Persona_Empleador empleador) {
		empleador.setPuntaje(empleador.getPuntaje() + 10);
	}
	
	static void puntajeNoElegido(Persona_Empleador empleador) {
		empleador.setPuntaje(empleador.getPuntaje() - 20);
	}
	
	static void modificarResultado(Persona_EmpleadoPretenso empleadoPretenso,String resultado) {
		Ticket_EmpleadoPretenso ticketEmpleadoPretenso = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticketEmpleadoPretenso.setResultado(resultado);
	}

	public static void visualizarListaAsignacion(Persona persona) throws ListaNoGeneradaException
	{
		if(persona.getListaDeAsignacion() != null)
			System.out.println(persona.getListaDeAsignacion());
		else
			throw new ListaNoGeneradaException();
	}
	
	static void resultadoExito(Persona_EmpleadoPretenso empleadoPretenso) 
	{ 
		Ticket ticket = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticket.setEstado("exito");
	}
	
	static void resultadoFracaso(Persona_EmpleadoPretenso empleadoPretenso) {
		Ticket ticket = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticket.setEstado("fracaso");
	}
	public static void muestra (Persona persona)
	{
		System.out.println(persona);
	}
	
	public static void visualizarContratos() {
		for(int i=0;i<contratos.size();i++)
			System.out.println("Empleador: "+contratos.get(i).getEmpleador().getCuenta().getUsuario()+"Empleados: "+contratos.get(i).getEmpleadosPretensos());
	}
}
