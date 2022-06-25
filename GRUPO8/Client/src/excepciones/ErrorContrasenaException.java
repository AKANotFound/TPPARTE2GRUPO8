package excepciones;

public class ErrorContrasenaException extends DatoIngresadoInvalidoException {
	

	public ErrorContrasenaException(String datoInvalido) {
		super("contrasena", datoInvalido);
		
	}
	
	

}
