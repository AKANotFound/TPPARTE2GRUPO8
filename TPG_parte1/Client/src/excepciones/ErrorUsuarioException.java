package excepciones;

public class ErrorUsuarioException extends Exception {
	private String usuarioIngresado;

	public ErrorUsuarioException(String usuarioIngresado) {
		super("el nombre de usuario es incorrecto");
		this.usuarioIngresado = usuarioIngresado;
	}
	
	
	

}
