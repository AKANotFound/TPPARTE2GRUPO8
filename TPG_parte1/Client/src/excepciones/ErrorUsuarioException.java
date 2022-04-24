package excepciones;

public class ErrorUsuarioException extends Exception {
	private String usuarioIngresado;

	public ErrorUsuarioException(String usuarioIngresado) {
		super();
		this.usuarioIngresado = usuarioIngresado;
	}
	
	
	

}
