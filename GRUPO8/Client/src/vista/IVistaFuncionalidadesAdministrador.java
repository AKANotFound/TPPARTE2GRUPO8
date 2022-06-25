package vista;

import java.awt.event.ActionListener;

public interface IVistaFuncionalidadesAdministrador
{
	void setActionListener(ActionListener actionListener);
	void setTextVista(String texto);
	int ventanaEmergenteConfirmar(String mensaje);
}
