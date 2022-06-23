package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import excepciones.EdadInvalidaException;
import persistencia.Persiste;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaRegistrarEmpleadoPretenso;

public class ControladorVistaRegistrarEmpleadoPretenso implements ActionListener {
	private IVistaRegistrarEmpleadoPretenso vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	public ControladorVistaRegistrarEmpleadoPretenso(IVentana ventana,IVistaRegistrarEmpleadoPretenso vista) {
		super();
		this.vista = vista;
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane = ventana.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		switch(comando) {
		case VOLVER:
			cl.show(contentPane, ventana.getVistaInicial());
			break;
		case REGISTRAR:
			try
			{
				Sistema.registrarEmpleadoPretenso(vista.getUsuario(),vista.getContrasena(),vista.getNya()
						,vista.getTelefono(),vista.getEdad());
				Persiste.getInstancia().persistir();
				cl.show(contentPane, ventana.getVistaInicial());
			} catch (EdadInvalidaException e1)
			{
				e1.printStackTrace();
			}
			break;
		}
		
		this.vista.limpiarVentana();
	}
}
