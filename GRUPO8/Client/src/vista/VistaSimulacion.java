package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;

public class VistaSimulacion extends JPanel
{
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_textArea_Consola;
	private JPanel panel_1;
	private JTextArea textArea_Consola;
	private JPanel panel_textArea_Empleadores;
	private JPanel panel_textArea_EmpleadosPretensos;
	private JTextArea textArea_Empleadores;
	private JTextArea textArea_EmpleadosPretensos;
	private JPanel panel_border_Empleadores;
	private JPanel panel_border_EmpleadosPretensos;
	private JPanel panel_border_Consola;
	private JPanel panel_IniciarDetener;
	private JPanel panel_Volver;
	private JButton btn_Iniciar;
	private JButton btn_Detener;
	private JButton btn_Volver;
	private JPanel panel_Iniciar;
	private JPanel panel_Detener;

	/**
	 * Create the panel.
	 */
	public VistaSimulacion()
	{
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_1 = new JPanel();
		this.panel_Centro.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_border_Empleadores = new JPanel();
		this.panel_border_Empleadores.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_1.add(this.panel_border_Empleadores);
		this.panel_border_Empleadores.setLayout(new BorderLayout(0, 0));
		
		this.panel_textArea_Empleadores = new JPanel();
		this.panel_border_Empleadores.add(this.panel_textArea_Empleadores);
		this.panel_textArea_Empleadores.setLayout(new BorderLayout(0, 0));
		
		this.textArea_Empleadores = new JTextArea();
		this.panel_textArea_Empleadores.add(this.textArea_Empleadores);
		
		this.panel_border_EmpleadosPretensos = new JPanel();
		this.panel_border_EmpleadosPretensos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleados pretensos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_1.add(this.panel_border_EmpleadosPretensos);
		this.panel_border_EmpleadosPretensos.setLayout(new BorderLayout(0, 0));
		
		this.panel_textArea_EmpleadosPretensos = new JPanel();
		this.panel_border_EmpleadosPretensos.add(this.panel_textArea_EmpleadosPretensos);
		this.panel_textArea_EmpleadosPretensos.setLayout(new BorderLayout(0, 0));
		
		this.textArea_EmpleadosPretensos = new JTextArea();
		this.panel_textArea_EmpleadosPretensos.add(this.textArea_EmpleadosPretensos);
		
		this.panel_border_Consola = new JPanel();
		this.panel_border_Consola.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Consola", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Centro.add(this.panel_border_Consola);
		this.panel_border_Consola.setLayout(new BorderLayout(0, 0));
		
		this.panel_textArea_Consola = new JPanel();
		this.panel_border_Consola.add(this.panel_textArea_Consola);
		this.panel_textArea_Consola.setLayout(new BorderLayout(0, 0));
		
		this.textArea_Consola = new JTextArea();
		this.panel_textArea_Consola.add(this.textArea_Consola);
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		this.panel_Sur.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_IniciarDetener = new JPanel();
		this.panel_Sur.add(this.panel_IniciarDetener);
		this.panel_IniciarDetener.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_Iniciar = new JPanel();
		this.panel_IniciarDetener.add(this.panel_Iniciar);
		
		this.btn_Iniciar = new JButton("Iniciar");
		this.panel_Iniciar.add(this.btn_Iniciar);
		
		this.panel_Detener = new JPanel();
		this.panel_IniciarDetener.add(this.panel_Detener);
		
		this.btn_Detener = new JButton("Detener");
		this.panel_Detener.add(this.btn_Detener);
		
		this.panel_Volver = new JPanel();
		this.panel_Sur.add(this.panel_Volver);
		
		this.btn_Volver = new JButton("Volver");
		this.panel_Volver.add(this.btn_Volver);

	}

}
