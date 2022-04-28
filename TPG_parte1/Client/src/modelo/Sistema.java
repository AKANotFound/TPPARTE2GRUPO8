package modelo;

public class Sistema {
	
	private static Sistema Instancia=null;
	private FuncionalidadAgencia funcionalidadAgencia;
	private FuncionalidadUsuario funcionaldadUsuario;
	
	private Sistema() {
		
	}

	public static Sistema getInstancia() {
		if (Instancia==null)
			Instancia=new Sistema();
		return Instancia;
	}



	public void agregarCuenta (Cuenta cuenta) ///tira excepcion
	{
		funcionalidadAgencia.agregarCuenta(cuenta);
	}
	
	public void eliminarCuenta (Cuenta cuenta)
	{
		funcionalidadAgencia.eliminarCuenta(cuenta);
	}
	
		public void addEmpleado (Persona_EmpleadoPretenso persona)
	{
		funcionalidadAgencia.addEmpleado(persona);
	}
		
	public void addEmpleador (Persona_Empleador empleador)
	{
		funcionalidadAgencia.getEmpleadores().add(empleador);
	}
	
	public void removeEmpleado (Persona_EmpleadoPretenso empleado)
	{
		funcionalidadAgencia.getEmpleadosPretensos().remove(empleado);
	}
	
	public void removeEmpleador (Persona_Empleador empleador)
	{
		funcionalidadAgencia.getEmpleadores().remove(empleador);
	}

	public void addLogins(Cuenta cuenta) {
		funcionalidadAgencia.getLogins().add(cuenta);
	}
	
	/*public static Persona registrarse(String tipo,String usuario, String contrasena) {
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
	} REVISAR CODIGO VER QUE HACER*/ 
	
	public void login(String usuario,String contrasena) {
		Cuenta cuenta = funcionalidadAgencia.getCuentas().get(usuario);
		
        if(cuenta != null) { //EXCEPCION mal el usuario
        	if(!(funcionalidadAgencia.getLogins().contains(cuenta)))
        		if(cuenta.confirmaContrasena(contrasena)) {//EXCEPCION mal contraseña
        			funcionalidadAgencia.getLogins().add(funcionalidadAgencia.getCuentas().get(usuario));
        		}
        }
    }
	
	public void VisualizacionEmpleadores()
	{
		funcionalidadAgencia.VisualizacionEmpleadores();
	}
	
	public void VisualizacionEmpleadosPretensos()
	{
		funcionalidadAgencia.VisualizacionEmpleadosPretensos();
	}
	
	public void VisualizacionSolicitudEmpleadores()
	{
		funcionalidadAgencia.VisualizacionSolicitudEmpleadores();
	}
	
	public void VisualizacionSolicitudEmpleadosPretensos()
	{
		funcionalidadAgencia.VisualizacionSolicitudEmpleadosPretensos();
	}
	
	public void CalculaComision()
	{
		funcionalidadAgencia.CalculaComision();
	}
	
	public void IniciaRondaDeEncuentrosLaborales()
	{
		funcionalidadAgencia.IniciaRondaDeEncuentrosLaborales();
	}
	
	public void IniciaRondaDeContrataciones()
	{
		funcionalidadAgencia.IniciaRondaDeContrataciones();
	}
	
	public void activar(Persona persona) {
		funcionaldadUsuario.activar(persona);	
	}
	
	public void suspender(Persona persona) {
		funcionaldadUsuario.suspender(persona);
	}
	
	public void cancelar(Persona persona) {
		funcionaldadUsuario.cancelar(persona);
	}
	
	public void finalizar(Persona persona) {
		funcionaldadUsuario.finalizar(persona);
	}
	
	public void modificarBusqueda(Persona persona,FormularioDeBusqueda form)
	{
		funcionaldadUsuario.modificarBusqueda(persona, form);
	}
	public void VisualizarListaDeAsignacion(Persona persona)
	{
		funcionaldadUsuario.VisualizarListaDeAsignacion(persona);
	}
	public void finalizarPuntaje(Persona persona) {
		funcionaldadUsuario.finalizar(persona);
	}	
	public void primerEmpleador(Persona_Empleador persona) {
		persona.setPuntaje(10);
	}
	
	public void cancelarTicket(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(-1);
	}
	
	public void ultimoEmpleadoPretenso(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(-5);
	}
	
	public void primerEmpleadoPretenso(Persona_EmpleadoPretenso persona) {
		persona.setPuntaje(5);
	}
	
	
}
