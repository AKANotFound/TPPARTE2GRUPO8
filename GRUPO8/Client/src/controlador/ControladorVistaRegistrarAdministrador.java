package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import excepciones.ErrorCodigoException;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaRegistrarAdministrador;

public class ControladorVistaRegistrarAdministrador implements ActionListener {
	private IVistaRegistrarAdministrador vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	public ControladorVistaRegistrarAdministrador(IVentana ventana,IVistaRegistrarAdministrador vista) {
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
				Sistema.registrarAdministrador(vista.getUsuario(), vista.getContrasena(), 
						vista.getCodigoAdministrador());
				cl.show(contentPane, ventana.getVistaInicial());
				
			} catch (ErrorCodigoException e1)
			{
				vista.ventanaEmergente("C�digo �rroneo");
				e1.printStackTrace();
			}			
		}
		
		this.vista.limpiarVista();
		
	}
}
