package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VistaRegistrarEmpleador extends JPanel implements IVistaRegistrarEmpleador, KeyListener, ItemListener {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_DatosEmpleador;
	private JPanel panel_PuntajeAspectos;
	private JLabel lbl_RazonSocial;
	private JTextField textField_RazonSocial;
	private JLabel lbl_TipoPersona;
	private JComboBox<String> comboBox_TipoPersona;
	private DefaultComboBoxModel<String> defaultComboBox_TipoPersona;
	private JLabel lbl_Rubro;
	private JComboBox<String> comboBox_Rubro;
	private DefaultComboBoxModel <String>defaultComboBox_Rubro;
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
	private ActionListener actionListener;//controlador
	
	private final String PERSONA_FISICA="Fisica";
	private final String PERSONA_JURIDICA="Juridica";
	private final String SELECCIONE="(Seleccione)";
	private final String RUBRO_COMERCIO_LOCAL="Comercio local";
	private final String RUBRO_COMERCIO_INTERNACIONAL="Comercio internacional";
	private final String RUBRO_SALUD="Salud";

	/**
	 * Create the panel.
	 */
	public VistaRegistrarEmpleador() {
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
		this.textField_RazonSocial.addKeyListener(this);
		this.panel_textField_RazonSocial.add(this.textField_RazonSocial);
		this.textField_RazonSocial.setColumns(10);
		
		this.panel_lbl_TipoPersona = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_lbl_TipoPersona);
		
		this.lbl_TipoPersona = new JLabel("Tipo persona");
		this.panel_lbl_TipoPersona.add(this.lbl_TipoPersona);
		
		this.panel_comboBox_TipoPersona = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_comboBox_TipoPersona);
		
		this.comboBox_TipoPersona = new JComboBox<String>();
		this.comboBox_TipoPersona.addItemListener(this);
		this.defaultComboBox_TipoPersona=new DefaultComboBoxModel<String>();
		this.defaultComboBox_TipoPersona.addElement(SELECCIONE);
		this.defaultComboBox_TipoPersona.addElement(PERSONA_FISICA);
		this.defaultComboBox_TipoPersona.addElement(PERSONA_JURIDICA);
		this.comboBox_TipoPersona.setModel(defaultComboBox_TipoPersona);
		this.panel_comboBox_TipoPersona.add(this.comboBox_TipoPersona);
		
		this.panel_lbl_Rubro = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_lbl_Rubro);
		
		this.lbl_Rubro = new JLabel("Rubro");
		this.panel_lbl_Rubro.add(this.lbl_Rubro);
		
		this.panel_comboBox_Rubro = new JPanel();
		this.panel_DatosEmpleador.add(this.panel_comboBox_Rubro);
		
		this.comboBox_Rubro = new JComboBox<String>();
		this.comboBox_Rubro.addItemListener(this);
		this.defaultComboBox_Rubro=new DefaultComboBoxModel<String>();
		this.defaultComboBox_Rubro.addElement(SELECCIONE);
		this.defaultComboBox_Rubro.addElement(RUBRO_COMERCIO_LOCAL);
		this.defaultComboBox_Rubro.addElement(RUBRO_COMERCIO_INTERNACIONAL);
		this.defaultComboBox_Rubro.addElement(RUBRO_SALUD);
		this.comboBox_Rubro.setModel(defaultComboBox_Rubro);
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
		this.textField_Locacion.addKeyListener(this);
		this.panel_textField_Locacion.add(this.textField_Locacion);
		this.textField_Locacion.setColumns(10);
		
		this.panel_lbl_CargaHoraria = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_CargaHoraria);
		
		this.lbl_CargaHoraria = new JLabel("Carga horaria");
		this.panel_lbl_CargaHoraria.add(this.lbl_CargaHoraria);
		
		this.panel_textField_CargaHoraria = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_CargaHoraria);
		
		this.textField_CargaHoraria = new JTextField();
		this.textField_CargaHoraria.addKeyListener(this);
		this.panel_textField_CargaHoraria.add(this.textField_CargaHoraria);
		this.textField_CargaHoraria.setColumns(10);
		
		this.panel_lbl_EstudiosCursados = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_EstudiosCursados);
		
		this.lbl_EstudiosCursados = new JLabel("Estudios cursados");
		this.panel_lbl_EstudiosCursados.add(this.lbl_EstudiosCursados);
		
		this.panel_textField_EstudiosCursados = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_EstudiosCursados);
		
		this.textField_EstudiosCursados = new JTextField();
		this.textField_EstudiosCursados.addKeyListener(this);
		this.panel_textField_EstudiosCursados.add(this.textField_EstudiosCursados);
		this.textField_EstudiosCursados.setColumns(10);
		
		this.panel_lbl_ExperienciaPrevia = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_ExperienciaPrevia);
		
		this.lbl_ExperienciaPrevia = new JLabel("Experiencia previa");
		this.panel_lbl_ExperienciaPrevia.add(this.lbl_ExperienciaPrevia);
		
		this.panel_textField_ExperienciaPrevia = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_ExperienciaPrevia);
		
		this.textField_ExperienciaPrevia = new JTextField();
		this.textField_ExperienciaPrevia.addKeyListener(this);
		this.panel_textField_ExperienciaPrevia.add(this.textField_ExperienciaPrevia);
		this.textField_ExperienciaPrevia.setColumns(10);
		
		this.panel_lbl_RangoEtario = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_RangoEtario);
		
		this.lbl_RangoEtario = new JLabel("Rango etario");
		this.panel_lbl_RangoEtario.add(this.lbl_RangoEtario);
		
		this.panel_textField_RangoEtario = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_RangoEtario);
		
		this.textField_RangoEtario = new JTextField();
		this.textField_RangoEtario.addKeyListener(this);
		this.panel_textField_RangoEtario.add(this.textField_RangoEtario);
		this.textField_RangoEtario.setColumns(10);
		
		this.panel_lbl_Remuneracion = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_Remuneracion);
		
		this.lbl_Remuneracion = new JLabel("Remuneracion");
		this.panel_lbl_Remuneracion.add(this.lbl_Remuneracion);
		
		this.panel_textField_Remuneracion = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_Remuneracion);
		
		this.textField_Remuneracion = new JTextField();
		this.textField_Remuneracion.addKeyListener(this);
		this.panel_textField_Remuneracion.add(this.textField_Remuneracion);
		this.textField_Remuneracion.setColumns(10);
		
		this.panel_lbl_TipoPuesto = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_lbl_TipoPuesto);
		
		this.lbl_TipoPuesto = new JLabel("Tipo de puesto");
		this.panel_lbl_TipoPuesto.add(this.lbl_TipoPuesto);
		
		this.panel_textField_TipoPuesto = new JPanel();
		this.panel_PuntajeAspectos.add(this.panel_textField_TipoPuesto);
		
		this.textField_TipoPuesto = new JTextField();
		this.textField_TipoPuesto.addKeyListener(this);
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
		this.textField_Usuario.addKeyListener(this);
		this.panel_textField_Usuario.add(this.textField_Usuario);
		this.textField_Usuario.setColumns(10);
		
		this.panel_lbl_Contrasena = new JPanel();
		this.panel_UsuarioContrasena.add(this.panel_lbl_Contrasena);
		
		this.lbl_Contrasena = new JLabel("Contrase\u00F1a");
		this.panel_lbl_Contrasena.add(this.lbl_Contrasena);
		
		this.panel_textField_Contrasena = new JPanel();
		this.panel_UsuarioContrasena.add(this.panel_textField_Contrasena);
		
		this.textField_Contrasena = new JTextField();
		this.textField_Contrasena.addKeyListener(this);
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
		this.btn_Registrar.setEnabled(false);
		this.panel_Registrar.add(this.btn_Registrar);

	}

	@Override
	public void setActionListener(ActionListener actionListener)
	{
		this.btn_Volver.addActionListener(actionListener);
		this.btn_Registrar.addActionListener(actionListener);
		this.actionListener=actionListener;
		
	}

	

	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		double EstudiosCursados=-1;
		double ExperienciaPrevia=-1;
		double Locacion=-1;
		double RangoEtario=-1;
		double Remuneracion=-1;
		double TipoPuesto=-1;
		double CargaHoraria=-1;
		
		
		try
		{
			EstudiosCursados=Double.parseDouble(this.textField_EstudiosCursados.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			ExperienciaPrevia=Double.parseDouble(this.textField_ExperienciaPrevia.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			Locacion=Double.parseDouble(this.textField_Locacion.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			RangoEtario=Double.parseDouble(this.textField_RangoEtario.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			CargaHoraria=Double.parseDouble(this.textField_CargaHoraria.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			Remuneracion=Double.parseDouble(this.textField_Remuneracion.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			TipoPuesto=Double.parseDouble(this.textField_TipoPuesto.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		
		
		
		if(0<=CargaHoraria
			&& this.textField_Contrasena.getText().length() != 0
			&& 0<=EstudiosCursados
			&& 0<=ExperienciaPrevia
			&& 0<=Locacion
			&& 0<=RangoEtario
			&& this.textField_RazonSocial.getText().length() != 0
			&& 0<=Remuneracion
			&& 0<=TipoPuesto
			&& this.textField_Usuario.getText().length() != 0
			&& this.comboBox_TipoPersona.getSelectedItem() != SELECCIONE
			&& this.comboBox_Rubro.getSelectedItem() != SELECCIONE) {
			this.btn_Registrar.setEnabled(true);
		}
		else
			this.btn_Registrar.setEnabled(false);
	}
	public void keyTyped(KeyEvent e) {
	}
	
	public void itemStateChanged(ItemEvent e) {
		double EstudiosCursados=-1;
		double ExperienciaPrevia=-1;
		double Locacion=-1;
		double RangoEtario=-1;
		double Remuneracion=-1;
		double TipoPuesto=-1;
		double CargaHoraria=-1;
		
		
		try
		{
			EstudiosCursados=Double.parseDouble(this.textField_EstudiosCursados.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			ExperienciaPrevia=Double.parseDouble(this.textField_ExperienciaPrevia.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			Locacion=Double.parseDouble(this.textField_Locacion.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			RangoEtario=Double.parseDouble(this.textField_RangoEtario.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			CargaHoraria=Double.parseDouble(this.textField_CargaHoraria.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			Remuneracion=Double.parseDouble(this.textField_Remuneracion.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		try
		{
			TipoPuesto=Double.parseDouble(this.textField_TipoPuesto.getText());
		}catch(NumberFormatException exception)
		{
			
		}
		
		
		
		if(0<=CargaHoraria
			&& this.textField_Contrasena.getText().length() != 0
			&& 0<=EstudiosCursados
			&& 0<=ExperienciaPrevia
			&& 0<=Locacion
			&& 0<=RangoEtario
			&& this.textField_RazonSocial.getText().length() != 0
			&& 0<=Remuneracion
			&& 0<=TipoPuesto
			&& this.textField_Usuario.getText().length() != 0
			&& this.comboBox_TipoPersona.getSelectedItem() != SELECCIONE
			&& this.comboBox_Rubro.getSelectedItem() != SELECCIONE) {
			this.btn_Registrar.setEnabled(true);
		}
		else
			this.btn_Registrar.setEnabled(false);
	}

	@Override
	public String getRazonSocial()
	{
		return this.textField_RazonSocial.getText();
	}

	@Override
	public String getTipoPersona()
	{
		
		return (String)this.comboBox_TipoPersona.getSelectedItem();
	}

	@Override
	public String getRubro()
	{
		
		return (String)this.comboBox_Rubro.getSelectedItem();
	}

	@Override
	public double getPuntajeLocacion()
	{
		
		return Integer.parseInt(this.textField_Locacion.getText());
	}

	@Override
	public double getPuntajeCargaHoraria()
	{
		
		return Integer.parseInt(this.textField_CargaHoraria.getText());
	}

	@Override
	public double getPuntajeEstudiosCursados()
	{
		
		return Integer.parseInt(this.textField_EstudiosCursados.getText());
	}

	@Override
	public double getPuntajeExperienciaPrevia()
	{
		
		return Integer.parseInt(this.textField_ExperienciaPrevia.getText());
	}

	@Override
	public double getPuntajeRangoEtario()
	{
		
		return Integer.parseInt(this.textField_RangoEtario.getText());
	}

	@Override
	public double getPuntajeRemuneracion()
	{
		
		return Integer.parseInt(this.textField_Remuneracion.getText());
	}

	@Override
	public double getPuntajeTipoDePuesto()
	{
		
		return Integer.parseInt(this.textField_TipoPuesto.getText());
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
	public void limpiarVista()
	{
		this.textField_RazonSocial.setText("");
		this.comboBox_TipoPersona.setSelectedItem(SELECCIONE);
		this.comboBox_Rubro.setSelectedItem(SELECCIONE);
		this.textField_CargaHoraria.setText("");
		this.textField_EstudiosCursados.setText("");
		this.textField_ExperienciaPrevia.setText("");
		this.textField_Locacion.setText("");
		this.textField_RangoEtario.setText("");
		this.textField_Remuneracion.setText("");
		this.textField_TipoPuesto.setText("");
		this.textField_Usuario.setText("");
		this.textField_Contrasena.setText("");
	}
}
