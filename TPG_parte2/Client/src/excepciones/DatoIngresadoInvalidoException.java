package excepciones;

public class DatoIngresadoInvalidoException extends Exception {
private String datoInvalido;
	
	public DatoIngresadoInvalidoException(String descripcion,String datoInvalido) {
		super("dato ingresado invalido: "+descripcion+"("+datoInvalido+")");
		this.datoInvalido=datoInvalido;
	}
	

}
