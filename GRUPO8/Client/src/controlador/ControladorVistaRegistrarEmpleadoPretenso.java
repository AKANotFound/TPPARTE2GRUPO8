package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import excepciones.EdadInvalidaException;
import excepciones.UsuarioYaRegistradoException;
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
	
	public ControladorVistaRegistrarEmpleadoPretenso(IVentana ventana) {
		super();
		this.vista = ventana.getVistaRegistrarEmpleadoPretenso();
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
			cl.show(contentPane, ventana.getID_VistaInicial());
			break;
		case REGISTRAR:
			try
			{
				Sistema.registrarEmpleadoPretenso(vista.getUsuario(),vista.getContrasena(),vista.getNya()
						,vista.getTelefono(),vista.getEdad());
				Persiste.getInstancia().persistir();
				cl.show(contentPane, ventana.getID_VistaInicial());
			} catch (EdadInvalidaException e1)
			{
				e1.printStackTrace();
			} catch (UsuarioYaRegistradoException e1) {
				vista.ventanaEmergente(e1.getMessage());
			}
			break;
		}
		
		this.vista.limpiarVentana();
	}
}
