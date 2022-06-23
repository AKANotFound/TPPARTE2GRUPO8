package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import entidades.ListaDeAsignacion;
import entidades.PersonaElegida;

public interface IVistaFuncionalidadesPersona {
	void setActionListener(ActionListener actionListener);
	void setTextVista(String texto);
	int ventanaEmergenteConfirmar(String mensaje);
	void ventanaEmergente(String mensaje);
	void visualizarListaDeAsignacion(ListaDeAsignacion listaDeAsignacion);
	ArrayList<PersonaElegida> getPersonasElegidas();
}
