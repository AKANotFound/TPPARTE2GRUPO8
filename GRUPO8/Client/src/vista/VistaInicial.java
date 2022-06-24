package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import entidades.Agencia;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class VistaInicial extends JPanel implements IVistaInicial, KeyListener {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_TipoUsuario;
	private JPanel panel_TipoUsuario_Border;
	private JPanel panel_Login;
	private JButton btn_Simulacion;
	private JPanel panel_Login_Border;
	private ButtonGroup tipoUsuarioRadioButtonGroup;
	private ActionListener actionListener;//controlador
	private JPanel panel_Login_Centro;
	private JPanel panel_lbl_Usuario_Border;
	private JLabel lbl_Usuario;
	private JPanel panel_textField_Usuario_Border;
	private JTextField textField_Usuario;
	private JPanel panel_lbl_Contrasena_Border;
	private JLabel lbl_Contrasena;
	private JPanel panel_textField_Contrasena_Border;
	private JTextField textField_Contrasena;
	private JPanel panel_Login_Sur;
	private JPanel panel_btn_Ingresar_Border;
	private JButton btn_Login;
	private JPanel panel_TipoUsuario_Centro;
	private JRadioButton rdbtn_Administrador;
	private JRadioButton rdbtn_Empleador;
	private JRadioButton rdbtn_EmpleadoPretenso;
	private JPanel panel_TipoUsuario_Sur;
	private JPanel panel_btn_CrearCuenta_Border;
	private JButton btn_CrearCuenta;

	/**
	 * Create the panel.
	 */
	public VistaInicial() {		
		setLayout(new BorderLayout(0, 0));
		
		tipoUsuarioRadioButtonGroup = new ButtonGroup();
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new BorderLayout(0, 0));
		
		this.panel_TipoUsuario_Border = new JPanel();
		this.panel_TipoUsuario_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registro de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_TipoUsuario_Border, BorderLayout.CENTER);
		
		this.panel_TipoUsuario = new JPanel();
		this.panel_TipoUsuario_Border.add(this.panel_TipoUsuario);
		
		this.panel_Login_Border = new JPanel();
		this.panel_Login_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Acceso de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_Login_Border, BorderLayout.NORTH);
		
		this.panel_Login = new JPanel();
		this.panel_Login_Border.add(this.panel_Login);
		this.panel_Login.setLayout(new BorderLayout(0, 0));
		
		this.panel_Login_Centro = new JPanel();
		this.panel_Login.add(this.panel_Login_Centro);
		this.panel_Login_Centro.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_lbl_Usuario_Border = new JPanel();
		this.panel_Login_Centro.add(this.panel_lbl_Usuario_Border);
		
		this.lbl_Usuario = new JLabel("Usuario");
		this.panel_lbl_Usuario_Border.add(this.lbl_Usuario);
		
		this.panel_textField_Usuario_Border = new JPanel();
		this.panel_Login_Centro.add(this.panel_textField_Usuario_Border);
		
		this.textField_Usuario = new JTextField();
		this.textField_Usuario.addKeyListener(this);
		this.textField_Usuario.setColumns(10);
		this.panel_textField_Usuario_Border.add(this.textField_Usuario);
		
		this.panel_lbl_Contrasena_Border = new JPanel();
		this.panel_Login_Centro.add(this.panel_lbl_Contrasena_Border);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_lbl_Contrasena_Border.add(this.lbl_Contrasena);
		
		this.panel_textField_Contrasena_Border = new JPanel();
		this.panel_Login_Centro.add(this.panel_textField_Contrasena_Border);
		
		this.textField_Contrasena = new JTextField();
		this.textField_Contrasena.addKeyListener(this);
		this.textField_Contrasena.setColumns(10);
		this.panel_textField_Contrasena_Border.add(this.textField_Contrasena);
		
		this.panel_Login_Sur = new JPanel();
		this.panel_Login.add(this.panel_Login_Sur, BorderLayout.SOUTH);
		
		this.panel_btn_Ingresar_Border = new JPanel();
		this.panel_Login_Sur.add(this.panel_btn_Ingresar_Border);
		
		this.btn_Login = new JButton("Iniciar Sesi\u00F3n");
		this.btn_Login.setEnabled(false);
		this.btn_Login.setActionCommand("IniciarSesion");
		this.panel_btn_Ingresar_Border.add(this.btn_Login);
		
		this.panel_Sur = new JPanel();
		this.panel_Sur.setBorder(new TitledBorder(null, "Iniciar simulaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(this.panel_Sur, BorderLayout.SOUTH);
		
		this.btn_Simulacion = new JButton("Simulaci\u00F3n");
		this.btn_Simulacion.setActionCommand("Simulacion");
		this.panel_Sur.add(this.btn_Simulacion);
		this.panel_TipoUsuario.setLayout(new BorderLayout(0, 0));
		
		this.panel_TipoUsuario_Centro = new JPanel();
		this.panel_TipoUsuario.add(this.panel_TipoUsuario_Centro);
		this.panel_TipoUsuario_Centro.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.rdbtn_Administrador = new JRadioButton("Administrador");
		this.panel_TipoUsuario_Centro.add(this.rdbtn_Administrador);
		this.tipoUsuarioRadioButtonGroup.add(rdbtn_Administrador);
		
		this.rdbtn_Empleador = new JRadioButton("Empleador");
		this.panel_TipoUsuario_Centro.add(this.rdbtn_Empleador);
		this.tipoUsuarioRadioButtonGroup.add(rdbtn_Empleador);
		
		this.rdbtn_EmpleadoPretenso = new JRadioButton("Empleado pretenso");
		this.rdbtn_EmpleadoPretenso.setSelected(true);
		this.panel_TipoUsuario_Centro.add(this.rdbtn_EmpleadoPretenso);
		this.tipoUsuarioRadioButtonGroup.add(rdbtn_EmpleadoPretenso);
		
		this.panel_TipoUsuario_Sur = new JPanel();
		this.panel_TipoUsuario.add(this.panel_TipoUsuario_Sur, BorderLayout.SOUTH);
		
		this.panel_btn_CrearCuenta_Border = new JPanel();
		this.panel_TipoUsuario_Sur.add(this.panel_btn_CrearCuenta_Border);
		
		this.btn_CrearCuenta = new JButton("Crear cuenta");
		this.btn_CrearCuenta.setActionCommand("CrearCuenta");
		this.panel_btn_CrearCuenta_Border.add(this.btn_CrearCuenta);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_CrearCuenta.addActionListener(actionListener);
		this.btn_Login.addActionListener(actionListener);
		this.btn_Simulacion.addActionListener(actionListener);
		this.actionListener=actionListener;
	}

	
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (this.textField_Usuario.getText().length()!=0 && this.textField_Contrasena.getText().length()!=0)
			this.btn_Login.setEnabled(true);
		else
			this.btn_Login.setEnabled(false);
		
	}
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public String getUsuario()
	{
		
		return this.textField_Usuario.getText();
	}

	@Override
	public String getContrasena()
	{
		
		return this.textField_Contrasena.getText();
	}

	@Override
	public String getTipoUsuario()
	{
		String str=null;
		if (this.rdbtn_Administrador.isSelected())
			str=Agencia.ADMINISTRADOR;
		else
			if(this.rdbtn_Empleador.isSelected())
				str=Agencia.EMPLEADOR;
			else
				if(this.rdbtn_EmpleadoPretenso.isSelected())
					str=Agencia.EMPLEADO_PRETENSO;
			
		
		return str;
	}

	@Override
	public void limpiarVista()
	{
		this.rdbtn_EmpleadoPretenso.setSelected(true);
		this.rdbtn_Administrador.setSelected(false);
		this.rdbtn_Empleador.setSelected(false);
		this.textField_Usuario.setText("");
		this.textField_Contrasena.setText("");
		this.btn_Login.setEnabled(false);
	}

	@Override
	public void ventanaEmergente(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje );
		
	}
}
