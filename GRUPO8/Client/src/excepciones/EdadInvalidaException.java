package excepciones;

public class EdadInvalidaException extends DatoIngresadoInvalidoException {

	public EdadInvalidaException( String datoInvalido) {
		super("edad", datoInvalido);
		
	}
	
}
