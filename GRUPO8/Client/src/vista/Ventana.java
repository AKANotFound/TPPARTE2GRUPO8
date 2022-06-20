package vista;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Ventana extends JFrame {

	private ActionListener actionListener; //controlador
	private JPanel contentPane;
	
	private VistaInicial vistaInicial;
	private VistaRegistrarAdministrador vistaRegistrarAdministrador;
	private VistaRegistrarEmpleadoPretenso vistaRegistrarEmpleadoPretenso;
	private VistaRegistrarEmpleador vistaRegistrarEmpleador;
	private VistaFuncionalidadesAdministrador vistaFuncionalidadesAdministrador;
	private VistaFuncionalidadesPersona vistaFuncionalidadesPersona;
	private VistaFormularioDeBusquedaEmpleadoPretenso vistaFormularioDeBusquedaEmpleadoPretenso;
	private VistaFormularioDeBusquedaEmpleador vistaFormularioDeBusquedaEmpleador;
	private VistaGestionTicketPersona vistaGestionTicketPersona;
	private VistaSimulacion vistaSimulacion;

	public final static String VISTA_INICIAL = "VistaInicial";
	public final static String VISTA_REGISTRAR_ADMINISTRADOR = "VistaRegistrarAdministrador";
	public final static String VISTA_REGISTRAR_EMPLEADO_PRETENSO = "VistaRegistrarEmpleadoPretenso";
	public final static String VISTA_REGISTRAR_EMPLEADOR = "VistaRegistrarEmpleador";
	public final static String VISTA_FUNCIONALIDADES_ADMINISTRADOR = "VistaFuncionalidadesAdministrador";
	public final static String VISTA_FUNCIONALIDADES_PERSONA = "VistaFuncionalidadesPersona";
	public final static String VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADO_PRETENSO = "VistaFormularioDeBusquedaEmpleadoPretenso";
	public final static String VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADOR = "VistaFormularioDeBusquedaEmpleador";
	public final static String VISTA_GESTION_TICKET_PERSONA = "VistaGestionTicketPersona";
	public final static String VISTA_SIMULACION = "VistaSimulacion";

	public Ventana(VistaInicial vistaInicial, VistaRegistrarAdministrador vistaRegistrarAdministrador,
			VistaRegistrarEmpleadoPretenso vistaRegistrarEmpleadoPretenso,VistaRegistrarEmpleador vistaRegistrarEmpleador,
			VistaFuncionalidadesAdministrador vistaFuncionalidadesAdministrador,VistaFuncionalidadesPersona vistaFuncionalidadesPersona,
			VistaFormularioDeBusquedaEmpleadoPretenso vistaFormularioDeBusquedaEmpleadoPretenso,
			VistaFormularioDeBusquedaEmpleador vistaFormularioDeBusquedaEmpleador,
			VistaGestionTicketPersona vistaGestionTicketPersona, VistaSimulacion vistaSimulacion) {
		
		this.vistaInicial = vistaInicial;
		this.vistaRegistrarAdministrador = vistaRegistrarAdministrador;
		this.vistaRegistrarEmpleadoPretenso = vistaRegistrarEmpleadoPretenso;
		this.vistaRegistrarEmpleador = vistaRegistrarEmpleador;
		this.vistaFuncionalidadesAdministrador = vistaFuncionalidadesAdministrador;
		this.vistaFuncionalidadesPersona = vistaFuncionalidadesPersona;
		this.vistaFormularioDeBusquedaEmpleadoPretenso = vistaFormularioDeBusquedaEmpleadoPretenso;
		this.vistaFormularioDeBusquedaEmpleador = vistaFormularioDeBusquedaEmpleador;
		this.vistaGestionTicketPersona = vistaGestionTicketPersona;
		this.vistaSimulacion = vistaSimulacion;
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 415);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new CardLayout(0, 0));

		contentPane.add(vistaInicial,VISTA_INICIAL);
		contentPane.add(vistaRegistrarAdministrador,VISTA_REGISTRAR_ADMINISTRADOR);
		contentPane.add(vistaRegistrarEmpleadoPretenso,VISTA_REGISTRAR_EMPLEADO_PRETENSO);
		contentPane.add(vistaRegistrarEmpleador,VISTA_REGISTRAR_EMPLEADOR);
		contentPane.add(vistaFuncionalidadesAdministrador,VISTA_FUNCIONALIDADES_ADMINISTRADOR);
		contentPane.add(vistaFuncionalidadesPersona,VISTA_FUNCIONALIDADES_PERSONA);
		contentPane.add(vistaFormularioDeBusquedaEmpleadoPretenso,VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADO_PRETENSO);
		contentPane.add(vistaFormularioDeBusquedaEmpleador,VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADOR);
		contentPane.add(vistaGestionTicketPersona,VISTA_GESTION_TICKET_PERSONA);
		contentPane.add(vistaSimulacion,VISTA_SIMULACION);
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
	
}
