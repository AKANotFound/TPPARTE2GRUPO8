package prueba;

import javax.swing.JPanel;

import controlador.ControladorVistaFormularioDeBusquedaEmpleadoPretenso;
import controlador.ControladorVistaFormularioDeBusquedaEmpleador;
import controlador.ControladorVistaFuncionalidadesAdministrador;
import controlador.ControladorVistaFuncionalidadesPersona;
import controlador.ControladorVistaGestionTicketPersona;
import controlador.ControladorVistaInicial;
import controlador.ControladorVistaRegistrarAdministrador;
import controlador.ControladorVistaRegistrarEmpleadoPretenso;
import controlador.ControladorVistaRegistrarEmpleador;
import controlador.ControladorVistaSimulacion;
import vista.Ventana;
import vista.VistaFormularioDeBusquedaEmpleadoPretenso;
import vista.VistaFormularioDeBusquedaEmpleador;
import vista.VistaFuncionalidadesAdministrador;
import vista.VistaFuncionalidadesPersona;
import vista.VistaGestionTicketPersona;
import vista.VistaInicial;
import vista.VistaRegistrarAdministrador;
import vista.VistaRegistrarEmpleadoPretenso;
import vista.VistaRegistrarEmpleador;
import vista.VistaSimulacion;

public class PruebaVista {

	public static void main(String[] args) {
		VistaInicial vistaInicial = new VistaInicial();
		VistaRegistrarAdministrador vistaRegistrarAdministrador = new VistaRegistrarAdministrador();
		VistaRegistrarEmpleadoPretenso vistaRegistrarEmpleadoPretenso = new VistaRegistrarEmpleadoPretenso();
		VistaRegistrarEmpleador vistaRegistrarEmpleador = new VistaRegistrarEmpleador();
		VistaFuncionalidadesAdministrador vistaFuncionalidadesAdministrador = new VistaFuncionalidadesAdministrador();
		VistaFuncionalidadesPersona vistaFuncionalidadesPersona = new VistaFuncionalidadesPersona();
		VistaFormularioDeBusquedaEmpleadoPretenso vistaFormularioDeBusquedaEmpleadoPretenso = new VistaFormularioDeBusquedaEmpleadoPretenso();
		VistaFormularioDeBusquedaEmpleador vistaFormularioDeBusquedaEmpleador = new VistaFormularioDeBusquedaEmpleador();
		VistaGestionTicketPersona vistaGestionTicketPersona = new VistaGestionTicketPersona();
		VistaSimulacion vistaSimulacion = new VistaSimulacion();
		
		Ventana ventana = new Ventana(vistaInicial,
				vistaRegistrarAdministrador,
				vistaRegistrarEmpleadoPretenso,
				vistaRegistrarEmpleador,
				vistaFuncionalidadesAdministrador,
				vistaFuncionalidadesPersona,
				vistaFormularioDeBusquedaEmpleadoPretenso,
				vistaFormularioDeBusquedaEmpleador,
				vistaGestionTicketPersona,
				vistaSimulacion);
		
		JPanel contentPane = ventana.getContentPane();
		
		ControladorVistaInicial controladorVistaInicial = new ControladorVistaInicial(vistaInicial,contentPane);
		ControladorVistaRegistrarAdministrador controladorVistaRegistrarAdministrador = new ControladorVistaRegistrarAdministrador(vistaRegistrarAdministrador,contentPane);
		ControladorVistaRegistrarEmpleadoPretenso controladorVistaRegistrarEmpleadoPretenso = new ControladorVistaRegistrarEmpleadoPretenso(vistaRegistrarEmpleadoPretenso,contentPane);
		ControladorVistaRegistrarEmpleador controladorVistaRegistrarEmpleador = new ControladorVistaRegistrarEmpleador(vistaRegistrarEmpleador,contentPane);
		ControladorVistaSimulacion controladorVistaSimulacion = new ControladorVistaSimulacion(vistaSimulacion,contentPane);
		ControladorVistaFuncionalidadesAdministrador controladorVistaFuncionalidadesAdministrador = new ControladorVistaFuncionalidadesAdministrador(vistaFuncionalidadesAdministrador,contentPane);
		ControladorVistaFuncionalidadesPersona controladorVistaFuncionalidadesPersona = new ControladorVistaFuncionalidadesPersona(vistaFuncionalidadesPersona,contentPane);
		ControladorVistaFormularioDeBusquedaEmpleador controladorVistaFormularioDeBusquedaEmpleador = new ControladorVistaFormularioDeBusquedaEmpleador(vistaFormularioDeBusquedaEmpleador,contentPane);
		ControladorVistaFormularioDeBusquedaEmpleadoPretenso controladorVistaFormularioDeBusquedaEmpleadoPretenso = new ControladorVistaFormularioDeBusquedaEmpleadoPretenso(vistaFormularioDeBusquedaEmpleadoPretenso,contentPane);
		ControladorVistaGestionTicketPersona controladoVistaGestionTicketPersona = new ControladorVistaGestionTicketPersona(vistaGestionTicketPersona,contentPane);
	}

}
