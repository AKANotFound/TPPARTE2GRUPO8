package sistema;

import java.util.ArrayList;
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
import excepciones.TipoPersonaInvalidoException;

public abstract class Sistema {
	
	private static ArrayList<Persona_EmpleadoPretenso> empleadosPretensos = Agencia.getInstancia().getEmpleadosPretensos();
	private static ArrayList<Persona_Empleador> empleadores = Agencia.getInstancia().getEmpleadores();
	private static ArrayList<Cuenta> logins = Agencia.getInstancia().getLogins();
	private static ArrayList<Contrato> contratos = Agencia.getInstancia().getContratos();
	private static HashMap <String, Usuario> usuarios = Agencia.getInstancia().getUsuarios();
	private static Administrador administrador = Administrador.getInstancia();
	
	public static FuncionalidadUsuario login(String nombreUsuario,String contrasena) throws ErrorContrasenaException,ErrorUsuarioException 
	{
		Usuario usuario = usuarios.get(nombreUsuario);
		Cuenta cuenta = usuario.getCuenta();
		FuncionalidadUsuario funcionalidadUsuario = null;
		
        if(usuario != null) {
        	if(cuenta.confirmaContrasena(contrasena)) {
        		if(!(logins.contains(cuenta)))
        			logins.add(cuenta);
        		if(cuenta.getTipoUsuario().equals("empleador"))
        			funcionalidadUsuario = new FuncionalidadEmpleador((Persona_Empleador) usuario);
        		else if(cuenta.getTipoUsuario().equals("empleadoPretenso"))
        			funcionalidadUsuario = new FuncionalidadEmpleadoPretenso((Persona_EmpleadoPretenso) usuario);        		
        	}
        	else
        		throw new ErrorContrasenaException(contrasena);
        }
        else if(nombreUsuario.equals(administrador.getCuenta().getUsuario()) && contrasena.equals(administrador.getCuenta().getContrasena()))
        	funcionalidadUsuario = new FuncionalidadAdministrador(usuario);
        else
        	throw new ErrorUsuarioException(nombreUsuario);
        
		return funcionalidadUsuario;
    }
	
	public static void registrarEmpleador(String usuario, String contrasena, String razonSocial, String tipoPersona, IRubro rubro) throws TipoPersonaInvalidoException {
		if (!tipoPersona.equalsIgnoreCase("fisica") && !tipoPersona.equalsIgnoreCase("juridica"))
			throw new TipoPersonaInvalidoException(tipoPersona);
		Persona_Empleador empleador = (Persona_Empleador) PersonaFactory.getEmpleador(usuario, contrasena,razonSocial, tipoPersona, rubro);
		empleadores.add(empleador);
		Sistema.agregarUsuario(empleador);
	}
	
	public static void registrarEmpleadoPretenso(String usuario, String contrasena, String nya, String telefono, int edad) throws EdadInvalidaException {
		if (edad<16)
			throw new EdadInvalidaException(Integer.toString(edad));
		Persona_EmpleadoPretenso empleadoPretenso = (Persona_EmpleadoPretenso) PersonaFactory.getEmpleadoPretenso(usuario, contrasena, telefono, telefono, edad);
		empleadosPretensos.add(empleadoPretenso) ;
		Sistema.agregarUsuario(empleadoPretenso);
	}
	
	public static void agregarCuenta(Cuenta cuenta) {
		
	}
	
	static void agregarContrato(Persona_Empleador empleador, ArrayList<Persona_EmpleadoPretenso> empleadosPretensos) {
		contratos.add(new Contrato(empleador,empleadosPretensos));
	}
	
	private static void agregarUsuario (Usuario usuario) { 
		if (usuarios.putIfAbsent(usuario.getCuenta().getUsuario(), usuario) == null) 
			usuarios.put(usuario.getCuenta().getUsuario(), usuario);
	}
	
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
	
	static void calculaComision(Persona_EmpleadoPretenso empleadoPretenso) {
		String tipoDePuesto = empleadoPretenso.getTipoDePuesto();
		double remuneracion = empleadoPretenso.getRemuneracion();
		double comision = 0;
		
		if(tipoDePuesto.equalsIgnoreCase("junior"))
			comision = remuneracion * 0.8;
		else if(tipoDePuesto.equalsIgnoreCase("junior"))
			comision = remuneracion * 0.9;
		else if(tipoDePuesto.equalsIgnoreCase("junior"))
			comision = remuneracion;
		
		comision *= (100 - empleadoPretenso.getPuntaje())/100;
		
		empleadoPretenso.setCostoServicio(comision);
	}
	
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

	static void visualizarListaAsignacion(Persona persona) {
		System.out.println(persona.getListaDeAsignacion());
	}
	
	static void resultadoExito(Persona_EmpleadoPretenso empleadoPretenso) {
		Ticket ticket = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticket.setEstado("exito");
	}
	
	static void resultadoFracaso(Persona_EmpleadoPretenso empleadoPretenso) {
		Ticket ticket = (Ticket_EmpleadoPretenso) empleadoPretenso.getTicket();
		ticket.setEstado("fracaso");
	}
}
