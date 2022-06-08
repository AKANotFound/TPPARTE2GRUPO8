package excepciones;

public class ErrorUsuarioException extends DatoIngresadoInvalidoException {
	

	public ErrorUsuarioException(String datoInvalido) {
		super("usuario", datoInvalido);
		
	}
	
	
	

}
