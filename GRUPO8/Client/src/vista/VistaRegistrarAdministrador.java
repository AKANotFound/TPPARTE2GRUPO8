package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VistaRegistrarAdministrador extends JPanel {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JButton btn_Registrar;
	private JPanel panel_RegistroAdministrador;
	private JPanel panel_CodigoAdministrador_Border;
	private JLabel lbl_CodigoAdministrador;
	private JPanel panel__textField_CodigoAdministrador_Border;
	private JTextField textField;
	private JPanel panel_Usuario_Border;
	private JLabel lbl_Usuario;
	private JPanel panel_textField_Usuario_Border;
	private JTextField textField_1;
	private JPanel panel_Contrasena_Border;
	private JLabel lbl_Contrasena;
	private JPanel panel_textField_Contrasena_Border;
	private JTextField textField_2;
	private JPanel panel_RegistroAdministrador_Border;
	private JButton btn_Volver;
	private JPanel panel_Volver_Border;
	private JPanel panel_Registrar_Border;

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
		
		this.textField = new JTextField();
		this.textField.setColumns(10);
		this.panel__textField_CodigoAdministrador_Border.add(this.textField);
		
		this.panel_Usuario_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_Usuario_Border);
		
		this.lbl_Usuario = new JLabel("Usuario");
		this.panel_Usuario_Border.add(this.lbl_Usuario);
		
		this.panel_textField_Usuario_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_textField_Usuario_Border);
		
		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		this.panel_textField_Usuario_Border.add(this.textField_1);
		
		this.panel_Contrasena_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_Contrasena_Border);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_Contrasena_Border.add(this.lbl_Contrasena);
		
		this.panel_textField_Contrasena_Border = new JPanel();
		this.panel_RegistroAdministrador.add(this.panel_textField_Contrasena_Border);
		
		this.textField_2 = new JTextField();
		this.textField_2.setColumns(10);
		this.panel_textField_Contrasena_Border.add(this.textField_2);
		
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
		this.panel_Registrar_Border.add(this.btn_Registrar);
		this.btn_Registrar.setActionCommand("VistaRegistrarAdministrador_Registrar");

	}

}
