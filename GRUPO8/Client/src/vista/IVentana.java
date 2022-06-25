package vista;

import javax.swing.JPanel;

public interface IVentana {
	JPanel getContentPane();
	String getID_VistaInicial();
	String getID_VistaRegistrarAdministrador();
	String getID_VistaRegistrarEmpleadoPretenso();
	String getID_VistaRegistrarEmpleador();
	String getID_VistaFuncionalidadesAdministrador();
	String getID_VistaFuncionalidadesPersona();
	String getID_VistaFormularioDeBusquedaEmpleadoPretenso();
	String getID_VistaFormularioDeBusquedaEmpleador();
	String getID_VistaGestionTicketPersona();
	String getID_VistaSimulacion();
	VistaInicial getVistaInicial();
	VistaRegistrarAdministrador getVistaRegistrarAdministrador();
	VistaRegistrarEmpleadoPretenso getVistaRegistrarEmpleadoPretenso();
	VistaRegistrarEmpleador getVistaRegistrarEmpleador();
	VistaFuncionalidadesAdministrador getVistaFuncionalidadesAdministrador();
	VistaFuncionalidadesPersona getVistaFuncionalidadesPersona();
	VistaFormularioDeBusquedaEmpleadoPretenso getVistaFormularioDeBusquedaEmpleadoPretenso();
	VistaFormularioDeBusquedaEmpleador getVistaFormularioDeBusquedaEmpleador();
	VistaGestionTicketPersona getVistaGestionTicketPersona();
	VistaSimulacion getVistaSimulacion();
}
