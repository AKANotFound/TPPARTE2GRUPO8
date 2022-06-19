package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VistaRegistrarEmpleadoPretenso extends JPanel {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_UsuarioContrasena;
	private JPanel panel_DatosEmpleado_Border;
	private JPanel panel_DatosEmpleadoPretenso;
	private JLabel lbl_Nya;
	private JTextField textField_Nya;
	private JLabel lbl_Telefono;
	private JTextField textField_Telefono;
	private JLabel lbl_Edad;
	private JTextField textField_Edad;
	private JPanel panel_lbl_Nya;
	private JPanel panel_textField_Nya;
	private JPanel panel_lbl_Telefono;
	private JPanel panel_textField_Telefono;
	private JPanel panel_lbl_Edad;
	private JPanel panel_texField_Edad;

	/**
	 * Create the panel.
	 */
	public VistaRegistrarEmpleadoPretenso() {
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new BorderLayout(0, 0));
		
		this.panel_UsuarioContrasena = new JPanel();
		this.panel_Centro.add(this.panel_UsuarioContrasena, BorderLayout.SOUTH);
		
		this.panel_DatosEmpleado_Border = new JPanel();
		this.panel_Centro.add(this.panel_DatosEmpleado_Border, BorderLayout.NORTH);
		
		this.panel_DatosEmpleadoPretenso = new JPanel();
		this.panel_DatosEmpleadoPretenso.setBorder(new TitledBorder(null, "Datos empleado pretenso", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_DatosEmpleado_Border.add(this.panel_DatosEmpleadoPretenso);
		this.panel_DatosEmpleadoPretenso.setLayout(new GridLayout(3, 2, 0, 0));
		
		this.panel_lbl_Nya = new JPanel();
		this.panel_DatosEmpleadoPretenso.add(this.panel_lbl_Nya);
		
		this.lbl_Nya = new JLabel("Nombre y apellido");
		this.panel_lbl_Nya.add(this.lbl_Nya);
		
		this.panel_textField_Nya = new JPanel();
		this.panel_DatosEmpleadoPretenso.add(this.panel_textField_Nya);
		
		this.textField_Nya = new JTextField();
		this.panel_textField_Nya.add(this.textField_Nya);
		this.textField_Nya.setColumns(10);
		
		this.panel_lbl_Telefono = new JPanel();
		this.panel_DatosEmpleadoPretenso.add(this.panel_lbl_Telefono);
		
		this.lbl_Telefono = new JLabel("Telefono");
		this.panel_lbl_Telefono.add(this.lbl_Telefono);
		
		this.panel_textField_Telefono = new JPanel();
		this.panel_DatosEmpleadoPretenso.add(this.panel_textField_Telefono);
		
		this.textField_Telefono = new JTextField();
		this.panel_textField_Telefono.add(this.textField_Telefono);
		this.textField_Telefono.setColumns(10);
		
		this.panel_lbl_Edad = new JPanel();
		this.panel_DatosEmpleadoPretenso.add(this.panel_lbl_Edad);
		
		this.lbl_Edad = new JLabel("Edad");
		this.panel_lbl_Edad.add(this.lbl_Edad);
		
		this.panel_texField_Edad = new JPanel();
		this.panel_DatosEmpleadoPretenso.add(this.panel_texField_Edad);
		
		this.textField_Edad = new JTextField();
		this.panel_texField_Edad.add(this.textField_Edad);
		this.textField_Edad.setColumns(10);
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);

	}

}
