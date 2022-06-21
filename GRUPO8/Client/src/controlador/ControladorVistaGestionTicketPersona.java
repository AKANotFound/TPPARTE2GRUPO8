package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
import vista.IVentana;
import vista.IVistaGestionTicketPersona;
import vista.Ventana;

public class ControladorVistaGestionTicketPersona implements ActionListener {
	private IVistaGestionTicketPersona vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String CREAR = "Crear";
	private final String ACTIVAR = "Activar";
	private final String SUSPENDER = "Suspender";
	private final String CANCELAR = "Cancelar";
	private final String MODIFICAR = "Modificar";
	private final String VOLVER = "Volver";
	
	public ControladorVistaGestionTicketPersona(IVentana ventana,IVistaGestionTicketPersona vista) {
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
		
		if(comando.equals(ACTIVAR)) {
			
		}
		else if(comando.equals(CANCELAR)) {
			
		}
		else if(comando.equals(CREAR)) {
			if(Agencia.getInstancia().getUsuarioActual().equals(ControladorVistaInicial.EMPLEADOR)) {
				cl.show(contentPane, ventana.getVistaFormularioDeBusquedaEmpleador());				
			}
			else if(Agencia.getInstancia().getUsuarioActual().equals(ControladorVistaInicial.EMPLEADO_PRETENSO)){
				cl.show(contentPane, ventana.getVistaFormularioDeBusquedaEmpleadoPretenso());				
			}
		}
		else if(comando.equals(MODIFICAR)) {
			if(Agencia.getInstancia().getUsuarioActual().equals(ControladorVistaInicial.EMPLEADOR)) {
				cl.show(contentPane, ventana.getVistaFormularioDeBusquedaEmpleador());				
			}
			else if(Agencia.getInstancia().getUsuarioActual().equals(ControladorVistaInicial.EMPLEADO_PRETENSO)){
				cl.show(contentPane, ventana.getVistaFormularioDeBusquedaEmpleadoPretenso());				
			}
		}
		else if(comando.equals(SUSPENDER)) {
			
		}
		else if(comando.equals(VOLVER)) {
			cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());
		}
	}
	
	
}
