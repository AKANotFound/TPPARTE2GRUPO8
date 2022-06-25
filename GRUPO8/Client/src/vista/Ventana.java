package vista;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Ventana extends JFrame implements IVentana {

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

	private final String VISTA_INICIAL = "VistaInicial";
	private final String VISTA_REGISTRAR_ADMINISTRADOR = "VistaRegistrarAdministrador";
	private final String VISTA_REGISTRAR_EMPLEADO_PRETENSO = "VistaRegistrarEmpleadoPretenso";
	private final String VISTA_REGISTRAR_EMPLEADOR = "VistaRegistrarEmpleador";
	private final String VISTA_FUNCIONALIDADES_ADMINISTRADOR = "VistaFuncionalidadesAdministrador";
	private final String VISTA_FUNCIONALIDADES_PERSONA = "VistaFuncionalidadesPersona";
	private final String VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADO_PRETENSO = "VistaFormularioDeBusquedaEmpleadoPretenso";
	private final String VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADOR = "VistaFormularioDeBusquedaEmpleador";
	private final String VISTA_GESTION_TICKET_PERSONA = "VistaGestionTicketPersona";
	private final String VISTA_SIMULACION = "VistaSimulacion";
	
	private final int posicion = 100;

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
		setBounds(posicion, posicion, 300, 350);
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

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}
	
	public VistaInicial getVistaInicial() {
		return vistaInicial;
	}

	public VistaRegistrarAdministrador getVistaRegistrarAdministrador() {
		return vistaRegistrarAdministrador;
	}

	public VistaRegistrarEmpleadoPretenso getVistaRegistrarEmpleadoPretenso() {
		return vistaRegistrarEmpleadoPretenso;
	}

	public VistaRegistrarEmpleador getVistaRegistrarEmpleador() {
		return vistaRegistrarEmpleador;
	}

	public VistaFuncionalidadesAdministrador getVistaFuncionalidadesAdministrador() {
		return vistaFuncionalidadesAdministrador;
	}

	public VistaFuncionalidadesPersona getVistaFuncionalidadesPersona() {
		return vistaFuncionalidadesPersona;
	}

	public VistaFormularioDeBusquedaEmpleadoPretenso getVistaFormularioDeBusquedaEmpleadoPretenso() {
		return vistaFormularioDeBusquedaEmpleadoPretenso;
	}

	public VistaFormularioDeBusquedaEmpleador getVistaFormularioDeBusquedaEmpleador() {
		return vistaFormularioDeBusquedaEmpleador;
	}

	public VistaGestionTicketPersona getVistaGestionTicketPersona() {
		return vistaGestionTicketPersona;
	}

	public VistaSimulacion getVistaSimulacion() {
		return vistaSimulacion;
	}

	@Override
	public String getID_VistaInicial() {
		this.setSize(posicion + 200,posicion + 300);
		return VISTA_INICIAL;
	}

	@Override
	public String getID_VistaRegistrarAdministrador() {
		this.setSize(posicion + 255,posicion + 120);
		return VISTA_REGISTRAR_ADMINISTRADOR;
	}

	@Override
	public String getID_VistaRegistrarEmpleadoPretenso() {
		this.setSize(posicion + 200,posicion + 200);
		return VISTA_REGISTRAR_EMPLEADO_PRETENSO;
	}

	@Override
	public String getID_VistaRegistrarEmpleador() {
		this.setSize(posicion + 280,posicion + 470);
		return VISTA_REGISTRAR_EMPLEADOR;
	}

	@Override
	public String getID_VistaFuncionalidadesAdministrador() {
		this.setSize(posicion + 450,posicion + 400);
		return VISTA_FUNCIONALIDADES_ADMINISTRADOR;
	}

	@Override
	public String getID_VistaFuncionalidadesPersona() {
		this.setSize(posicion + 400,posicion + 400);
		return VISTA_FUNCIONALIDADES_PERSONA;
	}

	@Override
	public String getID_VistaFormularioDeBusquedaEmpleadoPretenso() {
		this.setSize(posicion + 250,posicion + 260);
		return VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADO_PRETENSO;
	}

	@Override
	public String getID_VistaFormularioDeBusquedaEmpleador() {
		this.setSize(posicion + 280,posicion + 360);
		return VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADOR;
	}

	@Override
	public String getID_VistaGestionTicketPersona() {
		this.setSize(posicion + 135,posicion + 230);
		return VISTA_GESTION_TICKET_PERSONA;
	}

	@Override
	public String getID_VistaSimulacion() {
		this.setSize(posicion + 450,posicion + 400);
		return VISTA_SIMULACION;
	}

	@Override
	public String toString() {
		return "Ventana []";
	}
}
