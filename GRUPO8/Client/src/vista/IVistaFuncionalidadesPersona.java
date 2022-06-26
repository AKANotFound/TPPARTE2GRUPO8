package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JList;

import entidades.ListaDeAsignacion;
import entidades.PersonaElegida;
import excepciones.ListaNoGeneradaException;

public interface IVistaFuncionalidadesPersona {
	void setActionListener(ActionListener actionListener);
	void setTextVista(String texto);
	int ventanaEmergenteConfirmar(String mensaje);
	void ventanaEmergente(String mensaje);
	void visualizarListaDeAsignacion(ListaDeAsignacion listaDeAsignacion) throws ListaNoGeneradaException;
	ArrayList<PersonaElegida> getPersonasElegidas() throws ListaNoGeneradaException ;
	void limpiarVista();
	JList<PersonaElegida> getList_ListaDeAsignacion();
}
