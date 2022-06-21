package vista;

import java.awt.event.ActionListener;

public interface IVistaRegistrarEmpleadoPretenso {
	void setActionListener(ActionListener actionListener);
	String getNya();
	String getTelefono();
	int getEdad();
	String getUsuario();
	String getContrasena();
	void limpiarVentana();
}
