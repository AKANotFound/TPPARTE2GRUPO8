package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class VentanaInicial extends JFrame implements IVista
{

	private JPanel contentPane;
	private ActionListener actionListener;//el controlador
	private JPanel panel_Centro;
	private JPanel panel_SeleccionUsuario_Border;
	private JPanel panel_SeleccionUsuario;
	private JRadioButton rdbtn_Administrador;
	private JRadioButton rdbtn_Empleador;
	private JRadioButton rdbtn_EmpleadoPretenso;
	private JPanel panel_Login_Border;
	private JPanel panel_Login;
	private JPanel panel_Usuario_Border;
	private JLabel lbl_Usuario;
	private JTextField textField_Usuario;
	private JPanel panel_Contrasena_Border;
	private JLabel lbl_Contrasena;
	private JTextField textField_Contrasena;
	private JButton btn_Registrar;
	private JButton btn_Login;
	private JPanel panel_Simulacion_Border;
	private JButton btn_Simulacion;
	private ButtonGroup grupoRadioButton_TipoUsuario=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaInicial()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 343);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		this.contentPane.add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_SeleccionUsuario_Border = new JPanel();
		this.panel_SeleccionUsuario_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Selecci\u00F3n de tipo de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_SeleccionUsuario_Border);
		this.panel_SeleccionUsuario_Border.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panel_SeleccionUsuario = new JPanel();
		this.panel_SeleccionUsuario_Border.add(this.panel_SeleccionUsuario);
		this.panel_SeleccionUsuario.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.rdbtn_Administrador = new JRadioButton("Administrador");
		this.grupoRadioButton_TipoUsuario.add(this.rdbtn_Administrador);
		this.panel_SeleccionUsuario.add(this.rdbtn_Administrador);
		
		this.rdbtn_Empleador = new JRadioButton("Empleador");
		this.grupoRadioButton_TipoUsuario.add(this.rdbtn_Empleador);
		this.panel_SeleccionUsuario.add(this.rdbtn_Empleador);
		
		this.rdbtn_EmpleadoPretenso = new JRadioButton("Empleado pretenso");
		this.grupoRadioButton_TipoUsuario.add(this.rdbtn_EmpleadoPretenso);
		this.panel_SeleccionUsuario.add(this.rdbtn_EmpleadoPretenso);
		
		this.panel_Login_Border = new JPanel();
		this.panel_Login_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Gesti\u00F3n de cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_Login_Border);
		
		this.panel_Login = new JPanel();
		this.panel_Login_Border.add(this.panel_Login);
		this.panel_Login.setLayout(new GridLayout(3, 2, 0, 0));
		
		this.panel_Usuario_Border = new JPanel();
		this.panel_Login.add(this.panel_Usuario_Border);
		
		this.lbl_Usuario = new JLabel("Usuario");
		this.panel_Usuario_Border.add(this.lbl_Usuario);
		
		this.textField_Usuario = new JTextField();
		this.textField_Usuario.setColumns(10);
		this.panel_Login.add(this.textField_Usuario);
		
		this.panel_Contrasena_Border = new JPanel();
		this.panel_Login.add(this.panel_Contrasena_Border);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_Contrasena_Border.add(this.lbl_Contrasena);
		
		this.textField_Contrasena = new JTextField();
		this.textField_Contrasena.setColumns(10);
		this.panel_Login.add(this.textField_Contrasena);
		
		this.btn_Registrar = new JButton("Registrar");
		this.panel_Login.add(this.btn_Registrar);
		
		this.btn_Login = new JButton("Ingresar");
		this.panel_Login.add(this.btn_Login);
		
		this.panel_Simulacion_Border = new JPanel();
		this.panel_Simulacion_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inicio de simulaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.contentPane.add(this.panel_Simulacion_Border, BorderLayout.SOUTH);
		
		this.btn_Simulacion = new JButton("Simulaci\u00F3n");
		this.panel_Simulacion_Border.add(this.btn_Simulacion);
		
		this.setVisible(true);//borre main de ventana y puse esto
	}

	public void setActionListener(ActionListener actionListener)//ACA A LOS BOTONES LES AÑADO EL ACTION LISTENER
	{
		this.actionListener = actionListener;
	}
	
	

}
