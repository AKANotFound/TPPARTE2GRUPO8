package excepciones;

public class UsuarioYaRegistradoException extends Exception {

	public UsuarioYaRegistradoException(String usuarioInvalido) {
		
		super("El usuario "+usuarioInvalido+" ya esta registrado en el sistema.");
		
	}
}
