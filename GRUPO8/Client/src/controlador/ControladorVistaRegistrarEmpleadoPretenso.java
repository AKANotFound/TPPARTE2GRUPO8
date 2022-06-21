package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVentana;
import vista.IVistaRegistrarEmpleadoPretenso;
import vista.Ventana;

public class ControladorVistaRegistrarEmpleadoPretenso implements ActionListener {
	private IVistaRegistrarEmpleadoPretenso vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	public ControladorVistaRegistrarEmpleadoPretenso(IVentana ventana,IVistaRegistrarEmpleadoPretenso vista,JPanel contentPane) {
		super();
		this.vista = vista;
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane = contentPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		if(comando.equals(VOLVER)) {
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else if(comando.equals(REGISTRAR)) { //ponerle condiciones
			cl.show(contentPane, ventana.getVistaInicial());
		}
	}
}
