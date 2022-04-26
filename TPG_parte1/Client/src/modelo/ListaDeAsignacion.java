package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ListaDeAsignacion {
	private GregorianCalendar fechaDeCreacion = null;
	private ArrayList<PersonaAsignada> lista =null;
	
	public GregorianCalendar getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(GregorianCalendar fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public ArrayList<PersonaAsignada> getLista() {
		return lista;
	}
	public void setLista(ArrayList<PersonaAsignada> listaDeAsignacion) {
		this.lista = listaDeAsignacion;
	}
	
	@Override
	public String toString() {
		return "ListaDeAsignacion [fechaDeCreacion=" + fechaDeCreacion + ", lista=" + lista + "]";
	}
	
}
