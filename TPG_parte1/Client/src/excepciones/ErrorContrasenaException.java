package excepciones;

public class ErrorContrasenaException extends Exception {
	private String contrasenaIngresada;

	public ErrorContrasenaException(String contrasenaIngresada) {
		super();
		this.contrasenaIngresada = contrasenaIngresada;
	}
	
	

}
