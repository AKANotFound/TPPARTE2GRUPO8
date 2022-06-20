package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVistaRegistrarEmpleadoPretenso;
import vista.Ventana;

public class ControladorVistaRegistrarEmpleadoPretenso implements ActionListener {
	private IVistaRegistrarEmpleadoPretenso vista = null;
	private JPanel contentPane = null;
	
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	public ControladorVistaRegistrarEmpleadoPretenso(IVistaRegistrarEmpleadoPretenso vista,JPanel contentPane) {
		super();
		this.vista = vista;
		this.vista.setActionListener(this);
		this.contentPane = contentPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		if(comando.equals(VOLVER)) {
			cl.show(contentPane, Ventana.VISTA_INICIAL);
		}
		else if(comando.equals(REGISTRAR)) { //ponerle condiciones
			cl.show(contentPane, Ventana.VISTA_INICIAL);
		}
	}
}
