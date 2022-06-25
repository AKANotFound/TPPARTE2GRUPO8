package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ListaDeAsignacion {
	private GregorianCalendar fechaDeCreacion = null;
    private ArrayList<PersonaElegida> lista =null;
	
    public ListaDeAsignacion(){
    	
    }
    
	public String getFechaDeCreacion() {
		if (fechaDeCreacion == null)
			return "null";
		else
		    return fechaDeCreacion.getTime().toLocaleString();
	}
	public void setFechaDeCreacion(GregorianCalendar fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public ArrayList<PersonaElegida> getLista() {
		return lista;
	}
	public void setLista(ArrayList<PersonaElegida> lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "ListadeAsignacion ="+ lista ;
	}
}
 