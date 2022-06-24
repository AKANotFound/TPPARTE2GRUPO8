package vista;

import java.awt.event.ActionListener;

public interface IVistaRegistrarEmpleador
{
	void setActionListener(ActionListener actionListener);
	String getRazonSocial();
	String getTipoPersona();
	String getRubro();
	double getPuntajeLocacion();
	double getPuntajeCargaHoraria();
	double getPuntajeEstudiosCursados();
	double getPuntajeExperienciaPrevia();
	double getPuntajeRangoEtario();
	double getPuntajeRemuneracion();
	double getPuntajeTipoDePuesto();
	String getUsuario();
	String getContrasena();
	void limpiarVista();
	void ventanaEmergente(String mensaje);
}
