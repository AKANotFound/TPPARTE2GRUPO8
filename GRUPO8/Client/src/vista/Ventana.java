package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Ventana extends JFrame implements IVista {

	private ActionListener actionListener; //controlador
	private JPanel contentPane;
	
	private VistaInicial vistaInicial;
	private VistaRegistrarAdministrador vistaRegistrarAdministrador;
	
	public final static String VISTA_INICIAL = "VistaInicial";
	public final static String VISTA_REGISTRAR_ADMINISTRADOR = "VistaRegistrarAdministrador";
	public final static String VISTA_REGISTRAR_EMPLEADO_PRETENSO = "VistaRegistrarEmpleadoPretenso";
	public final static String VISTA_REGISTRAR_EMPLEADOR = "VistaRegistrarEmpleador";
	public final static String VISTA_FUNCIONALIDADES_ADMINISTRADOR = "VistaFuncionalidadesAdministrador";
	public final static String VISTA_FUNCIONALIDADES_PERSONA = "VistaFuncionalidadesAdministrador";
	public final static String VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADO_PRETENSO = "VistaFormularioDeBusquedaEmpleadoPretenso";
	public final static String VISTA_FORMULARIO_DE_BUSQUEDA_EMPLEADOR = "VistaFormularioDeBusquedaEmpleador";
	public final static String VISTA_GESTION_TICKET_PERSONA = "VistaGestionTicketPersona";
	public final static String VISTA_SIMULACION = "VistaSimulacion";

	public Ventana() {
		vistaInicial = new VistaInicial();
		vistaRegistrarAdministrador = new VistaRegistrarAdministrador();
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 415);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new CardLayout(0, 0));

		contentPane.add(vistaInicial,VISTA_INICIAL);
		contentPane.add(vistaRegistrarAdministrador,VISTA_REGISTRAR_ADMINISTRADOR);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		vistaInicial.getBtn_Ingresar().addActionListener(actionListener);
		vistaInicial.getBtn_CrearCuenta().addActionListener(actionListener);
		vistaInicial.getBtn_Simulacion().addActionListener(actionListener);
	}

	public VistaInicial getVistaInicial() {
		return vistaInicial;
	}

	public VistaRegistrarAdministrador getVistaRegistrarAdministrador() {
		return vistaRegistrarAdministrador;
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
	public void setSizeVentana(int ancho, int alto) {
		setSize(ancho,alto);
	}
}
