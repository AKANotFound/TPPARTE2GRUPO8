package vista;

import java.awt.event.ActionListener;

public interface IVistaFormularioDeBusquedaEmpleador
{
	void setActionListener(ActionListener actionListener);
	void limpiarVista();
	String getLocacion();
	String getRemuneracion();
	String getCargaHoraria();
	String getTipoDePuesto();
	String getRangoEtario();
	String getExperienciaPrevia();
	String getEstudiosCursados();
	int getCantidadEmpleadosSolicitados();
	boolean CrearTicket();
	void ventanaEmergente(String mensaje);
}
