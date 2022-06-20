package vista;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

public interface IVistaInicial {
	void setActionListener(ActionListener actionListener);
	boolean isRdbtn_Administrador_Selected();
	boolean isRdbtn_Empleador_Selected();
	boolean isRdbtn_EmpleadoPretenso_Selected();
}
