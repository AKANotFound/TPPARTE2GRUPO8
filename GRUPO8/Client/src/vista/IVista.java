package vista;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

public interface IVista
{
	void setActionListener(ActionListener actionListener);
	JPanel getContentPane();
	VistaInicial getVistaInicial();
	VistaRegistrarAdministrador getVistaRegistrarAdministrador();
}
