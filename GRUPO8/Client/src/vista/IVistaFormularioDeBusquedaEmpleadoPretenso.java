package vista;

import java.awt.event.ActionListener;

public interface IVistaFormularioDeBusquedaEmpleadoPretenso {

	void setActionListener(ActionListener actionListener);
	void limpiarVista();
	String getLocacion();
	String getRemuneracion();
	String getCargaHoraria();
	String getTipoDePuesto();
	String getRangoEtario();
	String getExperienciaPrevia();
	String getEstudiosCursados();
}
