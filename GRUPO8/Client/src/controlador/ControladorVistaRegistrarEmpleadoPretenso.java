package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import excepciones.EdadInvalidaException;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaRegistrarEmpleadoPretenso;
import vista.Ventana;

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
		
		if(comando.equals(VOLVER)) {
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else if(comando.equals(REGISTRAR)) { 
			
			try
			{
				Sistema.registrarEmpleadoPretenso(vista.getUsuario(),vista.getContrasena(),vista.getNya()
						, vista.getTelefono(), vista.getEdad());
			} catch (EdadInvalidaException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			cl.show(contentPane, ventana.getVistaInicial());
		}
		this.vista.limpiarVentana();
	}
}
