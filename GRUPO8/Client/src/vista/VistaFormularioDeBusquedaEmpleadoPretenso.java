package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VistaFormularioDeBusquedaEmpleadoPretenso extends JPanel implements IVistaFormularioDeBusquedaEmpleadoPretenso
{
	private JPanel panel_Sur;
	private JPanel panel_Centro_Border;
	private JPanel panel_Centro;
	private JLabel lbl_Locacion;
	private JComboBox comboBox_Locacion;
	private JLabel lbl_Remuneracion;
	private JComboBox comboBox_Remuneracion;
	private JLabel lbl_CargaHoraria;
	private JComboBox comboBox_CargaHoraria;
	private JLabel lbl_TipoDePuesto;
	private JComboBox comboBox_TipoDePuesto;
	private JLabel lbl_RangoEtario;
	private JComboBox comboBox_RangoEtario;
	private JLabel lbl_ExperienciaPrevia;
	private JComboBox comboBox_ExperienciaPrevia;
	private JLabel lbl_EstudiosCursados;
	private JComboBox comboBox_EstudiosCursados;
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
		
		this.comboBox_Locacion = new JComboBox();
		this.panel_comboBox_Locacion.add(this.comboBox_Locacion);
		
		this.panel_lbl_Remuneracion = new JPanel();
		this.panel_Centro.add(this.panel_lbl_Remuneracion);
		
		this.lbl_Remuneracion = new JLabel("Remuneraci\u00F3n");
		this.panel_lbl_Remuneracion.add(this.lbl_Remuneracion);
		
		this.panel_comboBox_Remuneracion = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_Remuneracion);
		
		this.comboBox_Remuneracion = new JComboBox();
		this.panel_comboBox_Remuneracion.add(this.comboBox_Remuneracion);
		
		this.panel_lbl_CargaHoraria = new JPanel();
		this.panel_Centro.add(this.panel_lbl_CargaHoraria);
		
		this.lbl_CargaHoraria = new JLabel("Carga horaria ");
		this.panel_lbl_CargaHoraria.add(this.lbl_CargaHoraria);
		
		this.panel_comboBox_CargaHoraria = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_CargaHoraria);
		
		this.comboBox_CargaHoraria = new JComboBox();
		this.panel_comboBox_CargaHoraria.add(this.comboBox_CargaHoraria);
		
		this.panel_lbl_TipoDePuesto = new JPanel();
		this.panel_Centro.add(this.panel_lbl_TipoDePuesto);
		
		this.lbl_TipoDePuesto = new JLabel("Tipo de puesto");
		this.panel_lbl_TipoDePuesto.add(this.lbl_TipoDePuesto);
		
		this.panel_comboBox_TipoDePuesto = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_TipoDePuesto);
		
		this.comboBox_TipoDePuesto = new JComboBox();
		this.panel_comboBox_TipoDePuesto.add(this.comboBox_TipoDePuesto);
		
		this.panel_lbl_RangoEtario = new JPanel();
		this.panel_Centro.add(this.panel_lbl_RangoEtario);
		
		this.lbl_RangoEtario = new JLabel("Rango etario");
		this.panel_lbl_RangoEtario.add(this.lbl_RangoEtario);
		
		this.panel_comboBox_RangoEtario = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_RangoEtario);
		
		this.comboBox_RangoEtario = new JComboBox();
		this.panel_comboBox_RangoEtario.add(this.comboBox_RangoEtario);
		
		this.panel_lbl_ExperienciaPrevia = new JPanel();
		this.panel_Centro.add(this.panel_lbl_ExperienciaPrevia);
		
		this.lbl_ExperienciaPrevia = new JLabel("Experiencia previa");
		this.panel_lbl_ExperienciaPrevia.add(this.lbl_ExperienciaPrevia);
		
		this.panel_comboBox_ExperienciaPrevia = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_ExperienciaPrevia);
		
		this.comboBox_ExperienciaPrevia = new JComboBox();
		this.panel_comboBox_ExperienciaPrevia.add(this.comboBox_ExperienciaPrevia);
		
		this.panel_lbl_EstudiosCursados = new JPanel();
		this.panel_Centro.add(this.panel_lbl_EstudiosCursados);
		
		this.lbl_EstudiosCursados = new JLabel("Estudios cursados");
		this.panel_lbl_EstudiosCursados.add(this.lbl_EstudiosCursados);
		
		this.panel_comboBox_EstudiosCursados = new JPanel();
		this.panel_Centro.add(this.panel_comboBox_EstudiosCursados);
		
		this.comboBox_EstudiosCursados = new JComboBox();
		this.panel_comboBox_EstudiosCursados.add(this.comboBox_EstudiosCursados);
	}

	@Override
	public void setActionListener(ActionListener actionListener)
	{
		this.btn_Aceptar.addActionListener(actionListener);
		this.btn_Cancelar.addActionListener(actionListener);
		
	}

	

}
