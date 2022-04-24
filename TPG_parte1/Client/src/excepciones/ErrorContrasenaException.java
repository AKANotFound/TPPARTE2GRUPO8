package excepciones;

public class ErrorContrasenaException extends Exception {
	private String contrasenaIngresada;

	public ErrorContrasenaException(String contrasenaIngresada) {
		super("la contrasena ingresada es incorrecta");
		this.contrasenaIngresada = contrasenaIngresada;
	}
	
	

}
