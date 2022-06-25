package vista;

import java.awt.event.ActionListener;

public interface IVistaInicial {
	void setActionListener(ActionListener actionListener);
	String getUsuario();
	String getContrasena();
	String getTipoUsuario();
	void limpiarVista();
	void ventanaEmergente(String mensaje);
}
