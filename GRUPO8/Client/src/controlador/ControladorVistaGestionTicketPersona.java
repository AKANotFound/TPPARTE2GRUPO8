package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
import excepciones.CambioDeEstadoFallidoException;
import vista.IVentana;
import vista.IVistaGestionTicketPersona;

public class ControladorVistaGestionTicketPersona implements ActionListener {
	private IVistaGestionTicketPersona vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String CREAR = "Crear";
	private final String ACTIVAR = "Activar";
	private final String SUSPENDER = "Suspender";
	private final String CANCELAR = "Cancelar";
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
		
		switch(comando) {
		case ACTIVAR:
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) 
			{
			 case Agencia.EMPLEADOR:
				try
				{
					Agencia.getInstancia().getFuncEmpleadorActual().activarTicket();
					this.vista.ventanaEmergente("Ticket activado exitosamente");
				} catch (CambioDeEstadoFallidoException e1)
				{
					this.vista.ventanaEmergente(e1.getMessage());
					
				}
				 break;
			 case Agencia.EMPLEADO_PRETENSO:
				try
				{
					Agencia.getInstancia().getFuncEmpleadoPretensoActual().activarTicket();
					this.vista.ventanaEmergente("Ticket activado exitosamente");
				} catch (CambioDeEstadoFallidoException e1)
				{
					this.vista.ventanaEmergente(e1.getMessage());
				}
				 break;
			}

			break;
		case CANCELAR:
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) 
			{
			 case Agencia.EMPLEADOR:
				try
				{
					Agencia.getInstancia().getFuncEmpleadorActual().cancelarTicket();
					this.vista.ventanaEmergente("Ticket cancelado exitosamente");
				} catch (CambioDeEstadoFallidoException e1)
				{
					this.vista.ventanaEmergente(e1.getMessage());
				}
				 break;
			 case Agencia.EMPLEADO_PRETENSO:
				try
				{
					Agencia.getInstancia().getFuncEmpleadoPretensoActual().cancelarTicket();
					this.vista.ventanaEmergente("Ticket cancelado exitosamente");
				} catch (CambioDeEstadoFallidoException e1)
				{
					this.vista.ventanaEmergente(e1.getMessage());
				}
				 break;
			}
			break;
		case CREAR:
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) {
			case Agencia.EMPLEADOR:
				cl.show(contentPane, ventana.getVistaFormularioDeBusquedaEmpleador());				
				break;
			case Agencia.EMPLEADO_PRETENSO:
				cl.show(contentPane, ventana.getVistaFormularioDeBusquedaEmpleadoPretenso());				
				break;
			}
			break;
		case SUSPENDER:
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) 
			{
			 case Agencia.EMPLEADOR:
				try
				{
					Agencia.getInstancia().getFuncEmpleadorActual().suspenderTicket();
					this.vista.ventanaEmergente("Ticket suspendido exitosamente");
					
				} catch (CambioDeEstadoFallidoException e1)
				{
					this.vista.ventanaEmergente(e1.getMessage());
				}
				 break;
			 case Agencia.EMPLEADO_PRETENSO:
				try
				{
					Agencia.getInstancia().getFuncEmpleadoPretensoActual().suspenderTicket();
					this.vista.ventanaEmergente("Ticket suspendido exitosamente");
				} catch (CambioDeEstadoFallidoException e1)
				{
					this.vista.ventanaEmergente(e1.getMessage());
				}
				 break;
			}
			break;
		case VOLVER:
			cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());	
			break;
		}
	}
}
