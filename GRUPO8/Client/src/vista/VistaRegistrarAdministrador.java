package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class VistaRegistrarAdministrador extends JPanel implements IVistaRegistrarAdministrador, KeyListener {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JButton btn_Registrar;
	private JPanel panel_RegistroAdministrador;
	private JPanel panel_CodigoAdministrador_Border;
	private JLabel lbl_CodigoAdministrador;
	private JPanel panel__textField_CodigoAdministrador_Border;
	private JTextField textField_CodigoAdministrador;
	private JPanel panel_Usuario_Border;
	private JLabel lbl_Usuario;
	private JPanel panel_textField_Usuario_Border;
	private JTextField textField_Usuario;
	private JPanel panel_Contrasena_Border;
	private JLabel lbl_Contrasena;
	private JPanel panel_textField_Contrasena_Border;
	private JTextField textField_Contrasena;
	private JPanel panel_RegistroAdministrador_Border;
	private JButton btn_Volver;
	private JPanel panel_Volver_Border;
	private JPanel panel_Registrar_Border;
	private ActionListener actionListener;//controlador

	/**
	 * Create the panel.
	 */
	public VistaRegistrarAdministrador() {
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panel_RegistroAdministrador_Border = new JPanel();
		this.panel_RegistroAdministrador_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registro administrador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_RegistroAdministrador_Border);
		
		this.panel_RegistroAdministrador = new JPanel();
		this.panel_RegistroAdministrador_Border.add(this.panel_RegistroAdministrador);
		this.panel_RegistroAdministrador.setLayout(new GridLayout(3, 2, 0, 0));
		
		this.panel_CodigoAdministrador_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_CodigoAdministrador_Border);
		
		this.lbl_CodigoAdministrador = new JLabel("C\u00F3digo administrador");
		this.panel_CodigoAdministrador_Border.add(this.lbl_CodigoAdministrador);
		
		this.panel__textField_CodigoAdministrador_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel__textField_CodigoAdministrador_Border);
		
		this.textField_CodigoAdministrador = new JTextField();
		this.textField_CodigoAdministrador.addKeyListener(this);
		this.textField_CodigoAdministrador.setColumns(10);
		this.panel__textField_CodigoAdministrador_Border.add(this.textField_CodigoAdministrador);
		
		this.panel_Usuario_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_Usuario_Border);
		
		this.lbl_Usuario = new JLabel("Usuario");
		this.panel_Usuario_Border.add(this.lbl_Usuario);
		
		this.panel_textField_Usuario_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_textField_Usuario_Border);
		
		this.textField_Usuario = new JTextField();
		this.textField_Usuario.addKeyListener(this);
		this.textField_Usuario.setColumns(10);
		this.panel_textField_Usuario_Border.add(this.textField_Usuario);
		
		this.panel_Contrasena_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_Contrasena_Border);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_Contrasena_Border.add(this.lbl_Contrasena);
		
		this.panel_textField_Contrasena_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_textField_Contrasena_Border);
		
		this.textField_Contrasena = new JTextField();
		this.textField_Contrasena.addKeyListener(this);
		this.textField_Contrasena.setColumns(10);
		this.panel_textField_Contrasena_Border.add(this.textField_Contrasena);
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		this.panel_Sur.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_Volver_Border = new JPanel();
		this.panel_Sur.add(this.panel_Volver_Border);
		
		this.btn_Volver = new JButton("Volver");
		this.panel_Volver_Border.add(this.btn_Volver);
		
		this.panel_Registrar_Border = new JPanel();
		this.panel_Sur.add(this.panel_Registrar_Border);
		
		this.btn_Registrar = new JButton("Registrar");
		this.btn_Registrar.setEnabled(false);
		this.panel_Registrar_Border.add(this.btn_Registrar);

	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_Registrar.addActionListener(actionListener);
		this.btn_Volver.addActionListener(actionListener);
		this.actionListener=actionListener;
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (this.textField_CodigoAdministrador.getText().length()!=0
				&& this.textField_Usuario.getText().length()!=0 
				&& this.textField_Contrasena.getText().length()!=0)
			this.btn_Registrar.setEnabled(true);
		else
			this.btn_Registrar.setEnabled(false);
		
		
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
	public String getCodigoAdministrador()
	{
		
		return this.textField_CodigoAdministrador.getText();
	}

	@Override
	public void codigoErroneo() //VER COMO HACERLO
	{
		JDialog cartel=new JDialog();
		cartel.setModal(true);
		cartel.setVisible(true);
		
		
	}

	@Override
	public void limpiarVista()
	{
		this.textField_Usuario.setText("");
		this.textField_Contrasena.setText("");
		this.textField_CodigoAdministrador.setText("");
		
	}
}
