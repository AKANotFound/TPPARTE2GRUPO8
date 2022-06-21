package vista;

import java.awt.event.ActionListener;

public interface IVistaRegistrarAdministrador {
	void setActionListener(ActionListener actionListener);
	String getUsuario();
	String getContrasena();
	String getCodigoAdministrador();
	void codigoErroneo();
	void limpiarVista();
}
