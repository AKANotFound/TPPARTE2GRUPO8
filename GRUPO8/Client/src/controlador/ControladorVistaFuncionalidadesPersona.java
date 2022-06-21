package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

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
	
	public ControladorVistaFuncionalidadesPersona(IVentana ventana,IVistaFuncionalidadesPersona vista, JPanel contentPane) {
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
		
		if(comando.equals(ACEPTAR_ELECCION)) {
			
		}
		else if(comando.equals(BORRAR_CUENTA)) { //hacer pop up de si esta seguro
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else if(comando.equals(CERRAR_SESION)) {
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else if(comando.equals(GESTION_DE_TICKET)) {
			cl.show(contentPane, ventana.getVistaGestionTicketPersona());
		}
		else if(comando.equals(INICIAR_RONDA_DE_ELECCION)) {
			
		}
		else if(comando.equals(VISUALIZAR_PERSONAS_ELEGIDAS)) {
			
		}
		else if(comando.equals(VISUALIZAR_RESULTADO)) {
			
		}
	}
	
	
}
