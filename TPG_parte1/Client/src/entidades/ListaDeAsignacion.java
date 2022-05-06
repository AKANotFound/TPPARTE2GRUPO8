package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ListaDeAsignacion {
	private GregorianCalendar fechaDeCreacion = null;
	private ArrayList<PersonaAsignada> lista =null;
	
	public String getFechaDeCreacion() {
		if (fechaDeCreacion == null)
			return "null";
		else
		    return fechaDeCreacion.getTime().toLocaleString();
	}
	public void setFechaDeCreacion(GregorianCalendar fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public ArrayList<PersonaAsignada> getLista() {
		return lista;
	}
	public void setLista(ArrayList<PersonaAsignada> lista) {
		this.lista = lista;
	}
	
	
	
	@Override
	public String toString() {
		return "ListadeAsignacion ="+ lista ;
	}
}
 