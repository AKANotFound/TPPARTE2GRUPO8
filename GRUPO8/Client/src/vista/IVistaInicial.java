package vista;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

public interface IVistaInicial {
	void setActionListener(ActionListener actionListener);
	String getUsuario();
	String getContrasena();
	String getTipoUsuario();
	void limpiarVista();
}
