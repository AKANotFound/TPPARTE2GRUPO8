package excepciones;

public class ListaNoGeneradaException extends Exception {
	
	public ListaNoGeneradaException()
	{
		super("La lista de asignaciones no ha sido generada");
	}

}
