package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VistaFormularioDeBusquedaEmpleadoPretenso extends JPanel implements IVistaFormularioDeBusquedaEmpleadoPretenso, KeyListener, ItemListener
{
	private JPanel panel_Sur;
	private JPanel panel_Centro_Border;
	private JPanel panel_Centro;
	private JLabel lbl_Locacion;
	private JComboBox<String> comboBox_Locacion;
	private DefaultComboBoxModel<String> defaultcomboBox_Locacion;
	private JLabel lbl_Remuneracion;
	private JComboBox<String> comboBox_Remuneracion;
	private DefaultComboBoxModel<String> defaultcomboBox_Remuneracion;
	private JLabel lbl_CargaHoraria;
	private JComboBox<String> comboBox_CargaHoraria;
	private DefaultComboBoxModel<String> defaultcomboBox_CargaHoraria;
	private JLabel lbl_TipoDePuesto;
	private JComboBox<String> comboBox_TipoDePuesto;
	private DefaultComboBoxModel<String> defaultcomboBox_TipoDePuesto;
	private JLabel lbl_RangoEtario;
	private JComboBox<String> comboBox_RangoEtario;
	private DefaultComboBoxModel<String> defaultcomboBox_RangoEtario;
	private JLabel lbl_ExperienciaPrevia;
	private JComboBox <String>comboBox_ExperienciaPrevia;
	private DefaultComboBoxModel<String> defaultcomboBox_ExperienciaPrevia;
	private JLabel lbl_EstudiosCursados;
	private JComboBox<String> comboBox_EstudiosCursados;
	private DefaultComboBoxModel<String> defaultcomboBox_EstudiosCursados;
	private JButton btn_Cancelar;
	private JButton btn_Aceptar;
	private JPanel panel_Cancelar;
	private JPanel panel_Aceptar;
	private JPanel panel_lbl_Locacion;
	private JPanel panel_comboBox_Locacion;
	private JPanel panel_lbl_Remuneracion;
	private JPanel panel_comboBox_Remuneracion;
	private JPanel panel_lbl_CargaHoraria;
	private JPanel panel_comboBox_CargaHoraria;
	private JPanel panel_lbl_TipoDePuesto;
	private JPanel panel_comboBox_TipoDePuesto;
	private JPanel panel_lbl_RangoEtario;
	private JPanel panel_comboBox_RangoEtario;
	private JPanel panel_lbl_ExperienciaPrevia;
	private JPanel panel_comboBox_ExperienciaPrevia;
	private JPanel panel_lbl_EstudiosCursados;
	private JPanel panel_comboBox_EstudiosCursados;
	private ActionListener actionListener;//controlador
	
	private final String SELECCIONE="(Seleccione)";
	private final String LOCACION_INDIFERENTE="Indiferente";
	private final String LOCACION_HOME_OFFICE="Home Office";
	private final String LOCACION_PRESENCIAL="Presencial";
	private final String REMUNERACION_30MIL="30 mil";
	private final String REMUNERACION_60MIL="60 mil";
	private final String REMUNERACION_90MIL="90 mil";
	private final String CARGA_HORARIA_COMPLETA="Completa";
	private final String CARGA_HORARIA_EXTENDIDA="Extendida";
	private final String CARGA_HORARIA_MEDIA="Media";
	private final String TIPO_DE_PUESTO_JUNIOR="Junior";
	private final String TIPO_DE_PUESTO_SENIOR="Senior";
	private final String TIPO_DE_PUESTO_MANAGEMENT="Management";
	private final String RANGO_ETARIO_DE_40_A_50="De 40 a 50";
	private final String RANGO_ETARIO_MENOS_DE_40="Menos de 40";
	private final String RANGO_ETARIO_MAS_DE_50="Mas de 50";
	private final String EXPERIENCIA_PREVIA_NADA="Nada";
	private final String EXPERIENCIA_PREVIA_MEDIA="Media";
	private final String EXPERIENCIA_PREVIA_MUCHA="Mucha";
	private final String ESTUDIOS_CURSADOS_PRIMARIO="Primario";
	private final String ESTUDIOS_CURSADOS_SECUNDARIO="Secundario";
	private final String ESTUDIOS_CURSADOS_TERCIARIO="Terciario";
	
	/**
	 * Create the panel.
	 */
	public VistaFormularioDeBusquedaEmpleadoPretenso()
	{
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		this.panel_Sur.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_Cancelar = new JPanel();
		this.panel_Sur.add(this.panel_Cancelar);
		
		this.btn_Cancelar = new JButton("Cancelar");
		this.panel_Cancelar.add(this.btn_Cancelar);
		
		this.panel_Aceptar = new JPanel();
		this.panel_Sur.add(this.panel_Aceptar);
		
		this.btn_Aceptar = new JButton("Aceptar");
		this.btn_Aceptar.setEnabled(false);
		this.panel_Aceptar.add(this.btn_Aceptar);
		
		this.panel_Centro_Border = new JPanel();
		this.panel_Centro_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Creaci\u00F3n de ticket empleado pretenso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(this.panel_Centro_Border, BorderLayout.CENTER);
		
		this.panel_Centro = new JPanel();
		this.panel_Centro_Border.add(this.panel_Centro);
		this.panel_Centro.setLayout(new GridLayout(7, 2, 0, 0));
		
		this.panel_lbl_Locacion = new JPanel();
		this.panel_Centro.add(this.panel_lbl_Locacion);
		
		this.lbl_Locacion = new JLabel("Locaci\u00F3n");
		this.panel_lbl_Locacion.add(this.lbl_Locacion);
		
		this.panel_comboBox_Locacion = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_Locacion);
		
		this.comboBox_Locacion = new JComboBox<String>();
		this.comboBox_Locacion.addItemListener(this);
		this.defaultcomboBox_Locacion=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_Locacion.addElement(SELECCIONE);
		this.defaultcomboBox_Locacion.addElement(LOCACION_INDIFERENTE);
		this.defaultcomboBox_Locacion.addElement(LOCACION_HOME_OFFICE);
		this.defaultcomboBox_Locacion.addElement(LOCACION_PRESENCIAL);
		this.comboBox_Locacion.setModel(defaultcomboBox_Locacion);
		this.panel_comboBox_Locacion.add(this.comboBox_Locacion);
		
		this.panel_lbl_Remuneracion = new JPanel();
		this.panel_Centro.add(this.panel_lbl_Remuneracion);
		
		this.lbl_Remuneracion = new JLabel("Remuneraci\u00F3n");
		this.panel_lbl_Remuneracion.add(this.lbl_Remuneracion);
		
		this.panel_comboBox_Remuneracion = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_Remuneracion);
		
		this.comboBox_Remuneracion = new JComboBox<String>();
		this.comboBox_Remuneracion.addItemListener(this);
		this.defaultcomboBox_Remuneracion=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_Remuneracion.addElement(SELECCIONE);
		this.defaultcomboBox_Remuneracion.addElement(REMUNERACION_30MIL);
		this.defaultcomboBox_Remuneracion.addElement(REMUNERACION_60MIL);
		this.defaultcomboBox_Remuneracion.addElement(REMUNERACION_90MIL);
		this.comboBox_Remuneracion.setModel(defaultcomboBox_Remuneracion);
		this.panel_comboBox_Remuneracion.add(this.comboBox_Remuneracion);
		
		this.panel_lbl_CargaHoraria = new JPanel();
		this.panel_Centro.add(this.panel_lbl_CargaHoraria);
		
		this.lbl_CargaHoraria = new JLabel("Carga horaria ");
		this.panel_lbl_CargaHoraria.add(this.lbl_CargaHoraria);
		
		this.panel_comboBox_CargaHoraria = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_CargaHoraria);
		
		this.comboBox_CargaHoraria = new JComboBox<String>();
		this.comboBox_CargaHoraria.addItemListener(this);
		this.defaultcomboBox_CargaHoraria=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_CargaHoraria.addElement(SELECCIONE);
		this.defaultcomboBox_CargaHoraria.addElement(CARGA_HORARIA_COMPLETA);
		this.defaultcomboBox_CargaHoraria.addElement(CARGA_HORARIA_EXTENDIDA);
		this.defaultcomboBox_CargaHoraria.addElement(CARGA_HORARIA_MEDIA);
		this.comboBox_CargaHoraria.setModel(defaultcomboBox_CargaHoraria);
		this.panel_comboBox_CargaHoraria.add(this.comboBox_CargaHoraria);
		
		this.panel_lbl_TipoDePuesto = new JPanel();
		this.panel_Centro.add(this.panel_lbl_TipoDePuesto);
		
		this.lbl_TipoDePuesto = new JLabel("Tipo de puesto");
		this.panel_lbl_TipoDePuesto.add(this.lbl_TipoDePuesto);
		
		this.panel_comboBox_TipoDePuesto = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_TipoDePuesto);
		
		this.comboBox_TipoDePuesto = new JComboBox<String>();
		this.comboBox_TipoDePuesto.addItemListener(this);
		this.defaultcomboBox_TipoDePuesto=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_TipoDePuesto.addElement(SELECCIONE);
		this.defaultcomboBox_TipoDePuesto.addElement(TIPO_DE_PUESTO_JUNIOR);
		this.defaultcomboBox_TipoDePuesto.addElement(TIPO_DE_PUESTO_SENIOR);
		this.defaultcomboBox_TipoDePuesto.addElement(TIPO_DE_PUESTO_MANAGEMENT);
		this.comboBox_TipoDePuesto.setModel(defaultcomboBox_TipoDePuesto);
		this.panel_comboBox_TipoDePuesto.add(this.comboBox_TipoDePuesto);
		
		this.panel_lbl_RangoEtario = new JPanel();
		this.panel_Centro.add(this.panel_lbl_RangoEtario);
		
		this.lbl_RangoEtario = new JLabel("Rango etario");
		this.panel_lbl_RangoEtario.add(this.lbl_RangoEtario);
		
		this.panel_comboBox_RangoEtario = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_RangoEtario);
		
		this.comboBox_RangoEtario = new JComboBox<String>();
		this.comboBox_RangoEtario.addItemListener(this);
		this.defaultcomboBox_RangoEtario=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_RangoEtario.addElement(SELECCIONE);
		this.defaultcomboBox_RangoEtario.addElement(RANGO_ETARIO_DE_40_A_50);
		this.defaultcomboBox_RangoEtario.addElement(RANGO_ETARIO_MENOS_DE_40);
		this.defaultcomboBox_RangoEtario.addElement(RANGO_ETARIO_MAS_DE_50);
		this.comboBox_RangoEtario.setModel(defaultcomboBox_RangoEtario);
		this.panel_comboBox_RangoEtario.add(this.comboBox_RangoEtario);
		
		this.panel_lbl_ExperienciaPrevia = new JPanel();
		this.panel_Centro.add(this.panel_lbl_ExperienciaPrevia);
		
		this.lbl_ExperienciaPrevia = new JLabel("Experiencia previa");
		this.panel_lbl_ExperienciaPrevia.add(this.lbl_ExperienciaPrevia);
		
		this.panel_comboBox_ExperienciaPrevia = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_ExperienciaPrevia);
		
		this.comboBox_ExperienciaPrevia = new JComboBox<String>();
		this.comboBox_ExperienciaPrevia.addItemListener(this);
		this.defaultcomboBox_ExperienciaPrevia=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_ExperienciaPrevia.addElement(SELECCIONE);
		this.defaultcomboBox_ExperienciaPrevia.addElement(EXPERIENCIA_PREVIA_NADA);
		this.defaultcomboBox_ExperienciaPrevia.addElement(EXPERIENCIA_PREVIA_MEDIA);
		this.defaultcomboBox_ExperienciaPrevia.addElement(EXPERIENCIA_PREVIA_MUCHA);
		this.comboBox_ExperienciaPrevia.setModel(defaultcomboBox_ExperienciaPrevia);
		this.panel_comboBox_ExperienciaPrevia.add(this.comboBox_ExperienciaPrevia);
		
		this.panel_lbl_EstudiosCursados = new JPanel();
		this.panel_Centro.add(this.panel_lbl_EstudiosCursados);
		
		this.lbl_EstudiosCursados = new JLabel("Estudios cursados");
		this.panel_lbl_EstudiosCursados.add(this.lbl_EstudiosCursados);
		
		this.panel_comboBox_EstudiosCursados = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_EstudiosCursados);
		
		this.comboBox_EstudiosCursados = new JComboBox<String>();
		this.comboBox_EstudiosCursados.addItemListener(this);
		this.defaultcomboBox_EstudiosCursados=new DefaultComboBoxModel<String>();
		this.defaultcomboBox_EstudiosCursados.addElement(SELECCIONE);
		this.defaultcomboBox_EstudiosCursados.addElement(ESTUDIOS_CURSADOS_PRIMARIO);
		this.defaultcomboBox_EstudiosCursados.addElement(ESTUDIOS_CURSADOS_SECUNDARIO);
		this.defaultcomboBox_EstudiosCursados.addElement(ESTUDIOS_CURSADOS_TERCIARIO);
		this.comboBox_EstudiosCursados.setModel(defaultcomboBox_EstudiosCursados);
		this.panel_comboBox_EstudiosCursados.add(this.comboBox_EstudiosCursados);

	}

	@Override
	public void setActionListener(ActionListener actionListener)
	{
		this.btn_Aceptar.addActionListener(actionListener);
		this.btn_Cancelar.addActionListener(actionListener);
		this.actionListener=actionListener;
		
	}

	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		
		
		if ( this.comboBox_Locacion.getSelectedItem()!=SELECCIONE
				&& this.comboBox_Remuneracion.getSelectedItem()!=SELECCIONE
				&& this.comboBox_CargaHoraria.getSelectedItem()!=SELECCIONE
				&& this.comboBox_TipoDePuesto.getSelectedItem()!=SELECCIONE
				&& this.comboBox_RangoEtario.getSelectedItem()!=SELECCIONE
				&& this.comboBox_ExperienciaPrevia.getSelectedItem()!=SELECCIONE
				&& this.comboBox_EstudiosCursados.getSelectedItem()!=SELECCIONE)
		{
			this.btn_Aceptar.setEnabled(true);
		}
		else
			this.btn_Aceptar.setEnabled(false);
		
	}
	public void keyTyped(KeyEvent e) {
	}
	public void itemStateChanged(ItemEvent e) {
		
		
		if (this.comboBox_Locacion.getSelectedItem()!=SELECCIONE
				&& this.comboBox_Remuneracion.getSelectedItem()!=SELECCIONE
				&& this.comboBox_CargaHoraria.getSelectedItem()!=SELECCIONE
				&& this.comboBox_TipoDePuesto.getSelectedItem()!=SELECCIONE
				&& this.comboBox_RangoEtario.getSelectedItem()!=SELECCIONE
				&& this.comboBox_ExperienciaPrevia.getSelectedItem()!=SELECCIONE
				&& this.comboBox_EstudiosCursados.getSelectedItem()!=SELECCIONE)
		{
			this.btn_Aceptar.setEnabled(true);
		}
		else
			this.btn_Aceptar.setEnabled(false);
	}

	

	@Override
	public String getLocacion()
	{
		
		return (String) this.comboBox_Locacion.getSelectedItem();
	}

	@Override
	public String getRemuneracion()
	{
		
		return (String) this.comboBox_Remuneracion.getSelectedItem();
	}

	@Override
	public String getCargaHoraria()
	{
		
		return (String) this.comboBox_CargaHoraria.getSelectedItem();
	}

	@Override
	public String getTipoDePuesto()
	{
		
		return (String) this.comboBox_TipoDePuesto.getSelectedItem();
	}

	@Override
	public String getRangoEtario()
	{
		
		return (String) this.comboBox_RangoEtario.getSelectedItem();
	}

	@Override
	public String getExperienciaPrevia()
	{
		
		return (String) this.comboBox_ExperienciaPrevia.getSelectedItem();
	}

	@Override
	public String getEstudiosCursados()
	{
		return (String) this.comboBox_EstudiosCursados.getSelectedItem();
	}

	@Override
	public void limpiarVista()
	{
		this.comboBox_CargaHoraria.setSelectedItem(SELECCIONE);
		this.comboBox_Locacion.setSelectedItem(SELECCIONE);
		this.comboBox_Remuneracion.setSelectedItem(SELECCIONE);
		this.comboBox_RangoEtario.setSelectedItem(SELECCIONE);
		this.comboBox_ExperienciaPrevia.setSelectedItem(SELECCIONE);
		this.comboBox_EstudiosCursados.setSelectedItem(SELECCIONE);
		this.comboBox_TipoDePuesto.setSelectedItem(SELECCIONE);
		
	}
}
