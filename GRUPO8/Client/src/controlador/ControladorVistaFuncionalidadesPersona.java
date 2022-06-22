package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidades.Agencia;
import vista.IVentana;
import vista.IVistaFuncionalidadesPersona;
import vista.Ventana;

public class ControladorVistaFuncionalidadesPersona implements ActionListener {
	private IVistaFuncionalidadesPersona vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String GESTION_DE_TICKET = "GestionDeTicket";
	private final String INICIAR_RONDA_DE_ELECCION = "IniciarRondaDeEleccion";
	private final String VISUALIZAR_RESULTADO = "VisualizarResultado";
	private final String VISUALIZAR_PERSONAS_ELEGIDAS = "VisualizarPersonasElegidas";
	private final String ACEPTAR_ELECCION = "AceptarEleccion";
	private final String CERRAR_SESION = "CerrarSesion";
	private final String BORRAR_CUENTA = "BorrarCuenta";
	
	public ControladorVistaFuncionalidadesPersona(IVentana ventana,IVistaFuncionalidadesPersona vista) {
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
		
		if(comando.equals(ACEPTAR_ELECCION)) {
			
		}
		else if(comando.equals(BORRAR_CUENTA)) {
			JFrame jFrame = new JFrame();
			int result = JOptionPane.showConfirmDialog(jFrame, "¿Estás seguro de que deseas eliminar tu cuenta?");
	        if (result == 0) 
	        {
	        	Agencia.getInstancia().getUsuarios().remove(Agencia.getInstancia().getUsuarioActual());
	        	cl.show(contentPane, ventana.getVistaInicial());
	        }
		}
		else if(comando.equals(CERRAR_SESION)) {
			Agencia.getInstancia().setUsuarioActual("");
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else if(comando.equals(GESTION_DE_TICKET)) {
			cl.show(contentPane, ventana.getVistaGestionTicketPersona());
		}
		else if(comando.equals(INICIAR_RONDA_DE_ELECCION)) {
			
		}
		else if(comando.equals(VISUALIZAR_PERSONAS_ELEGIDAS)) {
			switch(Agencia.getInstancia().getUsuarioActual()) {
			case 
			}
			
			vista.setTextArea_Consola(null);
		}
		else if(comando.equals(VISUALIZAR_RESULTADO)) {
			
		}
	}
	
	
}
