package excepciones;

public class ListaNoGeneradaException extends Exception {
	
	public ListaNoGeneradaException()
	{
		super("la lista de asignaciones no ha sido generada");
	}

}
