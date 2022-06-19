package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaInicial extends JPanel {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_TipoUsuario;
	private JRadioButton rdbtn_Administrador;
	private JRadioButton rdbtn_Empleador;
	private JRadioButton rdbtn_EmpleadoPretenso;
	private JPanel panel_TipoUsuario_Border;
	private JPanel panel_Login;
	private JLabel lbl_Usuario;
	private JTextField textField_Usuario;
	private JLabel lbl_Contrasena;
	private JTextField textField_Contrasena;
	private JButton btn_CrearCuenta;
	private JButton btn_Login;
	private JPanel panel_lbl_Usuario_Border;
	private JPanel panel_textField_Usuario_Border;
	private JPanel panel_lbl_Contrasena_Border;
	private JPanel panel_textField_Contrasena_Border;
	private JPanel panel_btn_CrearCuenta_Border;
	private JPanel panel_btn_Ingresar_Border;
	private JButton btn_Simulacion;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public VistaInicial() {
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro);
		this.panel_Centro.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_TipoUsuario_Border = new JPanel();
		this.panel_TipoUsuario_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_TipoUsuario_Border);
		
		this.panel_TipoUsuario = new JPanel();
		this.panel_TipoUsuario_Border.add(this.panel_TipoUsuario);
		this.panel_TipoUsuario.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.rdbtn_Administrador = new JRadioButton("Administrador");
		this.panel_TipoUsuario.add(this.rdbtn_Administrador);
		
		this.rdbtn_Empleador = new JRadioButton("Empleador");
		this.panel_TipoUsuario.add(this.rdbtn_Empleador);
		
		this.rdbtn_EmpleadoPretenso = new JRadioButton("Empleado pretenso");
		this.panel_TipoUsuario.add(this.rdbtn_EmpleadoPretenso);
		
		this.panel = new JPanel();
		this.panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Acceso de usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel);
		
		this.panel_Login = new JPanel();
		this.panel.add(this.panel_Login);
		this.panel_Login.setLayout(new GridLayout(3, 2, 0, 0));
		
		this.panel_lbl_Usuario_Border = new JPanel();
		this.panel_Login.add(this.panel_lbl_Usuario_Border);
		
		this.lbl_Usuario = new JLabel("Usuario");
		this.panel_lbl_Usuario_Border.add(this.lbl_Usuario);
		
		this.panel_textField_Usuario_Border = new JPanel();
		this.panel_Login.add(this.panel_textField_Usuario_Border);
		
		this.textField_Usuario = new JTextField();
		this.panel_textField_Usuario_Border.add(this.textField_Usuario);
		this.textField_Usuario.setColumns(10);
		
		this.panel_lbl_Contrasena_Border = new JPanel();
		this.panel_Login.add(this.panel_lbl_Contrasena_Border);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_lbl_Contrasena_Border.add(this.lbl_Contrasena);
		
		this.panel_textField_Contrasena_Border = new JPanel();
		this.panel_Login.add(this.panel_textField_Contrasena_Border);
		
		this.textField_Contrasena = new JTextField();
		this.panel_textField_Contrasena_Border.add(this.textField_Contrasena);
		this.textField_Contrasena.setColumns(10);
		
		this.panel_btn_CrearCuenta_Border = new JPanel();
		this.panel_Login.add(this.panel_btn_CrearCuenta_Border);
		
		this.btn_CrearCuenta = new JButton("Crear cuenta");
		this.btn_CrearCuenta.setActionCommand("VistaInicial_CrearCuenta");
		this.panel_btn_CrearCuenta_Border.add(this.btn_CrearCuenta);
		
		this.panel_btn_Ingresar_Border = new JPanel();
		this.panel_Login.add(this.panel_btn_Ingresar_Border);
		
		this.btn_Login = new JButton("Login");
		this.panel_btn_Ingresar_Border.add(this.btn_Login);
		
		this.panel_Sur = new JPanel();
		this.panel_Sur.setBorder(new TitledBorder(null, "Iniciar simulaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(this.panel_Sur, BorderLayout.SOUTH);
		
		this.btn_Simulacion = new JButton("Simulacion");
		this.panel_Sur.add(this.btn_Simulacion);

	}

	public JButton getBtn_CrearCuenta() {
		return btn_CrearCuenta;
	}

	public JButton getBtn_Ingresar() {
		return btn_Login;
	}

	public JButton getBtn_Simulacion() {
		return btn_Simulacion;
	}
}
