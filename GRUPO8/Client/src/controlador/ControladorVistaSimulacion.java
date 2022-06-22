package controlador;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import entidades.Simulacion_EmpleadoPretenso;
import entidades.Simulacion_Empleador;
import vista.IVentana;
import vista.IVistaSimulacion;
import vista.VistaSimulacion;

public class ControladorVistaSimulacion extends JFrame implements ActionListener, Observer {
	
	IVistaSimulacion vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private final String VOLVER = "Volver";
	private final String INICIAR = "Iniciar";
	private final String DETENER = "Detener";
	private JTextArea area = new JTextArea();
	
	protected ArrayList<Simulacion_EmpleadoPretenso> empleadosObservados = new ArrayList<Simulacion_EmpleadoPretenso>();
	protected ArrayList<Simulacion_Empleador> empleadoresObservados = new ArrayList<Simulacion_Empleador>();
	
	public ControladorVistaSimulacion() { //esto no va, hay q agregarlo a la ventana, pero era pa probar
		JScrollPane scroll=new JScrollPane(area);
		this.getContentPane().add(scroll);
		this.setVisible(true);
		this.setSize(new Dimension(600,600));
	}
	
	public ControladorVistaSimulacion(IVentana ventana, IVistaSimulacion vistaSimulacion) {
		this.vista = vistaSimulacion;
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane = ventana.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout) (contentPane.getLayout());
		String comando = e.getActionCommand();
		if (comando.equals(VOLVER)) {
			cl.show(contentPane, ventana.getVistaInicial());
		} else if (comando.equals(INICIAR)) {
			vista.setIniciarDisabled();
		} else if (comando.equals(DETENER)) {
			vista.setDetenerDisabled();
		}

	}

	public void agregarObservable(Simulacion_Empleador empleador) {
		empleador.addObserver(this);
		this.empleadoresObservados.add(empleador);
	}

	public void borrarObservable(Simulacion_Empleador empleador) {

		empleador.deleteObserver(this);
		this.empleadoresObservados.remove(empleador);
	}

	public void agregarObservable(Simulacion_EmpleadoPretenso empleado) {

		empleado.addObserver(this);
		this.empleadosObservados.add(empleado);
	}

	public void borrarObservable(Simulacion_EmpleadoPretenso empleado) {

		empleado.deleteObserver(this);
		this.empleadosObservados.remove(empleado);
	}

	@Override
	public void update(Observable o, Object arg) {
		
	
		VistaSimulacion v = (VistaSimulacion) this.vista;
		if(o.getClass() == Simulacion_Empleador.class) 
		{
			Simulacion_Empleador empleador = (Simulacion_Empleador) o;
			//this.area.append((String) arg+"\n");
		}else
			if(o.getClass() == Simulacion_EmpleadoPretenso.class) 
			{
				Simulacion_EmpleadoPretenso empleado = (Simulacion_EmpleadoPretenso) o;
				//this.area.append((String) arg+"\n");
				v.getTextArea_EmpleadosPretensos().append((String) arg+"\n");
			}
	}
	
}
