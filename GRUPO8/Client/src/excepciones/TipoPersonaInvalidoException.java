package excepciones;

public class TipoPersonaInvalidoException extends DatoIngresadoInvalidoException{

	public TipoPersonaInvalidoException(String datoInvalido) {
		
		super("tipoPersona",datoInvalido);
		
	}
	
	
	
	

}
