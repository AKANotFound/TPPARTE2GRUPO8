package vista;

import javax.swing.JPanel;

public interface IVentana {
	JPanel getContentPane();
	String getVistaInicial();
	String getVistaRegistrarAdministrador();
	String getVistaRegistrarEmpleadoPretenso();
	String getVistaRegistrarEmpleador();
	String getVistaFuncionalidadesAdministrador();
	String getVistaFuncionalidadesPersona();
	String getVistaFormularioDeBusquedaEmpleadoPretenso();
	String getVistaFormularioDeBusquedaEmpleador();
	String getVistaGestionTicketPersona();
	String getVistaSimulacion();
}
