package modelo;

public interface IPersona {
	
	public void registrarse(String usuario, String contrasena);
	public void login(String usuario, String contrasena);
	public void eleccion();
	public void visualizarLista();
	public void activarTicket();
	public void suspenderTicket();
	public void cancelarTicket();
	public void finalizarTicket();
}
