package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaRegistrarEmpleador extends JPanel {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_DatosEmpleador;
	private JPanel panel_PuntajeAspectos;
	private JLabel lbl_RazonSocial;
	private JTextField textField_RazonSocial;
	private JLabel lbl_TipoPersona;
	private JComboBox comboBox_TipoPersona;
	private JLabel lbl_Rubro;
	private JComboBox comboBox_Rubro;
	private JPanel panel_DatosEmpleador_Border;
	private JPanel panel_lbl_RazonSocial;
	private JPanel panel_textField_RazonSocial;
	private JPanel panel_lbl_TipoPersona;
	private JPanel panel_comboBox_TipoPersona;
	private JPanel panel_lbl_Rubro;
	private JPanel panel_comboBox_Rubro;
	private JLabel lbl_Locacion;
	private JTextField textField_Locacion;
	private JLabel lbl_CargaHoraria;
	private JTextField textField_CargaHoraria;
	private JLabel lbl_EstudiosCursados;
	private JTextField textField_EstudiosCursados;
	private JLabel lbl_ExperienciaPrevia;
	private JTextField textField_ExperienciaPrevia;
	private JLabel lbl_RangoEtario;
	private JTextField textField_RangoEtario;
	private JLabel lbl_Remuneracion;
	private JTextField textField_Remuneracion;
	private JPanel panel_PuntajeAspectos_Border;
	private JLabel lbl_TipoPuesto;
	private JTextField textField_TipoPuesto;
	private JPanel panel_Locacion;
	private JPanel panel_textField_Locacion;
	private JPanel panel_lbl_CargaHoraria;
	private JPanel panel_textField_CargaHoraria;
	private JPanel panel_lbl_EstudiosCursados;
	private JPanel panel_textField_EstudiosCursados;
	private JPanel panel_lbl_ExperienciaPrevia;
	private JPanel panel_textField_ExperienciaPrevia;
	private JPanel panel_lbl_RangoEtario;
	private JPanel panel_textField_RangoEtario;
	private JPanel panel_lbl_Remuneracion;
	private JPanel panel_textField_Remuneracion;
	private JPanel panel_lbl_TipoPuesto;
	private JPanel panel_textField_TipoPuesto;
	private JPanel panel_UsuarioContrasena_Border;
	private JPanel panel_UsuarioContrasena;
	private JLabel lbl_Usuario;
	private JTextField textField_Usuario;
	private JLabel lbl_Contrasena;
	private JTextField textField_Contrasena;
	private JPanel panel_lbl_Usuario;
	private JPanel panel_textField_Usuario;
	private JPanel panel_lbl_Contrasena;
	private JPanel panel_textField_Contrasena;
	private JButton btn_Volver;
	private JButton btn_Registrar;
	private JPanel panel_Volver;
	private JPanel panel_Registrar;

	/**
	 * Create the panel.
	 */
	public VentanaRegistrarEmpleador() {
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro);
		this.panel_Centro.setLayout(new BorderLayout(0, 0));
		
		this.panel_DatosEmpleador_Border = new JPanel();
		this.panel_DatosEmpleador_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos empleador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_DatosEmpleador_Border, BorderLayout.NORTH);
		
		this.panel_DatosEmpleador = new JPanel();
		this.panel_DatosEmpleador_Border.add(this.panel_DatosEmpleador);
		this.panel_DatosEmpleador.setLayout(new GridLayout(3, 2, 0, 0));
		
		this.panel_lbl_RazonSocial = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_lbl_RazonSocial);
		
		this.lbl_RazonSocial = new JLabel("Razon social");
		this.panel_lbl_RazonSocial.add(this.lbl_RazonSocial);
		
		this.panel_textField_RazonSocial = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_textField_RazonSocial);
		
		this.textField_RazonSocial = new JTextField();
		this.panel_textField_RazonSocial.add(this.textField_RazonSocial);
		this.textField_RazonSocial.setColumns(10);
		
		this.panel_lbl_TipoPersona = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_lbl_TipoPersona);
		
		this.lbl_TipoPersona = new JLabel("Tipo persona");
		this.panel_lbl_TipoPersona.add(this.lbl_TipoPersona);
		
		this.panel_comboBox_TipoPersona = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_comboBox_TipoPersona);
		
		this.comboBox_TipoPersona = new JComboBox();
		this.panel_comboBox_TipoPersona.add(this.comboBox_TipoPersona);
		
		this.panel_lbl_Rubro = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_lbl_Rubro);
		
		this.lbl_Rubro = new JLabel("Rubro");
		this.panel_lbl_Rubro.add(this.lbl_Rubro);
		
		this.panel_comboBox_Rubro = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_comboBox_Rubro);
		
		this.comboBox_Rubro = new JComboBox();
		this.panel_comboBox_Rubro.add(this.comboBox_Rubro);
		
		this.panel_PuntajeAspectos_Border = new JPanel();
		this.panel_PuntajeAspectos_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Puntaje aspectos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_PuntajeAspectos_Border, BorderLayout.CENTER);
		
		this.panel_PuntajeAspectos = new JPanel();
		this.panel_PuntajeAspectos_Border.add(this.panel_PuntajeAspectos);
		this.panel_PuntajeAspectos.setLayout(new GridLayout(7, 2, 0, 0));
		
		this.panel_Locacion = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_Locacion);
		
		this.lbl_Locacion = new JLabel("Locacion");
		this.panel_Locacion.add(this.lbl_Locacion);
		
		this.panel_textField_Locacion = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_Locacion);
		
		this.textField_Locacion = new JTextField();
		this.panel_textField_Locacion.add(this.textField_Locacion);
		this.textField_Locacion.setColumns(10);
		
		this.panel_lbl_CargaHoraria = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_CargaHoraria);
		
		this.lbl_CargaHoraria = new JLabel("Carga horaria");
		this.panel_lbl_CargaHoraria.add(this.lbl_CargaHoraria);
		
		this.panel_textField_CargaHoraria = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_CargaHoraria);
		
		this.textField_CargaHoraria = new JTextField();
		this.panel_textField_CargaHoraria.add(this.textField_CargaHoraria);
		this.textField_CargaHoraria.setColumns(10);
		
		this.panel_lbl_EstudiosCursados = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_EstudiosCursados);
		
		this.lbl_EstudiosCursados = new JLabel("Estudios cursados");
		this.panel_lbl_EstudiosCursados.add(this.lbl_EstudiosCursados);
		
		this.panel_textField_EstudiosCursados = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_EstudiosCursados);
		
		this.textField_EstudiosCursados = new JTextField();
		this.panel_textField_EstudiosCursados.add(this.textField_EstudiosCursados);
		this.textField_EstudiosCursados.setColumns(10);
		
		this.panel_lbl_ExperienciaPrevia = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_ExperienciaPrevia);
		
		this.lbl_ExperienciaPrevia = new JLabel("Experiencia previa");
		this.panel_lbl_ExperienciaPrevia.add(this.lbl_ExperienciaPrevia);
		
		this.panel_textField_ExperienciaPrevia = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_ExperienciaPrevia);
		
		this.textField_ExperienciaPrevia = new JTextField();
		this.panel_textField_ExperienciaPrevia.add(this.textField_ExperienciaPrevia);
		this.textField_ExperienciaPrevia.setColumns(10);
		
		this.panel_lbl_RangoEtario = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_RangoEtario);
		
		this.lbl_RangoEtario = new JLabel("Rango etario");
		this.panel_lbl_RangoEtario.add(this.lbl_RangoEtario);
		
		this.panel_textField_RangoEtario = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_RangoEtario);
		
		this.textField_RangoEtario = new JTextField();
		this.panel_textField_RangoEtario.add(this.textField_RangoEtario);
		this.textField_RangoEtario.setColumns(10);
		
		this.panel_lbl_Remuneracion = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_Remuneracion);
		
		this.lbl_Remuneracion = new JLabel("Remuneracion");
		this.panel_lbl_Remuneracion.add(this.lbl_Remuneracion);
		
		this.panel_textField_Remuneracion = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_Remuneracion);
		
		this.textField_Remuneracion = new JTextField();
		this.panel_textField_Remuneracion.add(this.textField_Remuneracion);
		this.textField_Remuneracion.setColumns(10);
		
		this.panel_lbl_TipoPuesto = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_TipoPuesto);
		
		this.lbl_TipoPuesto = new JLabel("Tipo de puesto");
		this.panel_lbl_TipoPuesto.add(this.lbl_TipoPuesto);
		
		this.panel_textField_TipoPuesto = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_TipoPuesto);
		
		this.textField_TipoPuesto = new JTextField();
		this.panel_textField_TipoPuesto.add(this.textField_TipoPuesto);
		this.textField_TipoPuesto.setColumns(10);
		
		this.panel_UsuarioContrasena_Border = new JPanel();
		this.panel_UsuarioContrasena_Border.setBorder(new TitledBorder(null, "Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Centro.add(this.panel_UsuarioContrasena_Border, BorderLayout.SOUTH);
		
		this.panel_UsuarioContrasena = new JPanel();
		this.panel_UsuarioContrasena_Border.add(this.panel_UsuarioContrasena);
		this.panel_UsuarioContrasena.setLayout(new GridLayout(2, 2, 0, 0));
		
		this.panel_lbl_Usuario = new JPanel();
		this.panel_UsuarioContrasena.add(this.panel_lbl_Usuario);
		
		this.lbl_Usuario = new JLabel("Usuario");
		this.panel_lbl_Usuario.add(this.lbl_Usuario);
		
		this.panel_textField_Usuario = new JPanel();
		this.panel_UsuarioContrasena.add(this.panel_textField_Usuario);
		
		this.textField_Usuario = new JTextField();
		this.panel_textField_Usuario.add(this.textField_Usuario);
		this.textField_Usuario.setColumns(10);
		
		this.panel_lbl_Contrasena = new JPanel();
		this.panel_UsuarioContrasena.add(this.panel_lbl_Contrasena);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_lbl_Contrasena.add(this.lbl_Contrasena);
		
		this.panel_textField_Contrasena = new JPanel();
		this.panel_UsuarioContrasena.add(this.panel_textField_Contrasena);
		
		this.textField_Contrasena = new JTextField();
		this.panel_textField_Contrasena.add(this.textField_Contrasena);
		this.textField_Contrasena.setColumns(10);
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		this.panel_Sur.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_Volver = new JPanel();
		this.panel_Sur.add(this.panel_Volver);
		
		this.btn_Volver = new JButton("Volver");
		this.panel_Volver.add(this.btn_Volver);
		
		this.panel_Registrar = new JPanel();
		this.panel_Sur.add(this.panel_Registrar);
		
		this.btn_Registrar = new JButton("Registrar");
		this.panel_Registrar.add(this.btn_Registrar);

	}

}
