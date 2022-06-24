package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JPanel;

import entidades.Agencia;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaFuncionalidadesAdministrador;




public class ControladorVistaFuncionalidadesAdministrador implements ActionListener
{
	IVistaFuncionalidadesAdministrador vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String INICIAR_RONDA_DE_ENCUENTROS_LABORALES = "IniciarRondaDeEncuentrosLaborales";
	private final String INICIAR_RONDA_DE_CONTRATACION = "IniciarRondaDeContratacion";
	private final String VISUALIZAR_EMPLEADOS_PRETENSOS = "EmpleadosPretensos";
	private final String VISUALIZAR_TICKETS_EMPLEADOS_PRETENSOS = "TicketsEmpleadosPretensos";
	private final String VISUALIZAR_EMPLEADORES = "Empleadores";
	private final String VISUALIZAR_TICKETS_EMPLEADORES= "TicketsEmpleadores";
	private final String VISUALIZAR_CUENTAS = "Cuentas";
	private final String VISUALIZAR_CONTRATOS = "Contratos";
	private final String CERRAR_SESION = "CerrarSesion";
	private final String BORRAR_CUENTA = "BorrarCuenta";
	
	public ControladorVistaFuncionalidadesAdministrador(IVentana ventana,IVistaFuncionalidadesAdministrador vista)
	{
		this.vista = vista;
		this.ventana = ventana;
		this.contentPane = ventana.getContentPane();
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		int result;
		
		switch(comando) {
		case CERRAR_SESION:
			Sistema.cerrarSesion();
			cl.show(contentPane, ventana.getVistaInicial());
			break;
		case BORRAR_CUENTA:
			result =this.vista.ventanaEmergenteConfirmar("¿Estás seguro de que deseas eliminar tu cuenta?"); 
	        if (result == 0) 
	        {
	        	Sistema.borrarCuenta();
	        	cl.show(contentPane, ventana.getVistaInicial());
	        }
			break;
		case INICIAR_RONDA_DE_ENCUENTROS_LABORALES:
			result =this.vista.ventanaEmergenteConfirmar("¿Estás seguro de que deseas iniciar la ronda de encuentros laborales?"); 
	        if (result == 0) 
	        {
	        	Agencia.getInstancia().getFuncAdministradorActual().iniciaRondaEncuentrosLaborales();
	        }
	        break;
		case INICIAR_RONDA_DE_CONTRATACION:
			result =this.vista.ventanaEmergenteConfirmar("¿Estás seguro de que deseas iniciar la ronda de contratación?"); 
	        if (result == 0) 
	        {
	        	Agencia.getInstancia().getFuncAdministradorActual().iniciaRondaContratacion();
	        	
	        }
	        break;
		case VISUALIZAR_EMPLEADOS_PRETENSOS:
			this.vista.setTextVista(Agencia.getInstancia().getFuncAdministradorActual().visualizarEmpleadosPretensos());
			break;
		case VISUALIZAR_TICKETS_EMPLEADOS_PRETENSOS:
			this.vista.setTextVista(Agencia.getInstancia().getFuncAdministradorActual().visualizarTicketsEmpleadosPretensos());
			break;
		case VISUALIZAR_EMPLEADORES:
			this.vista.setTextVista(Agencia.getInstancia().getFuncAdministradorActual().visualizarEmpleadores());
			break;
		case VISUALIZAR_TICKETS_EMPLEADORES:
			this.vista.setTextVista(Agencia.getInstancia().getFuncAdministradorActual().visualizarTicketsEmpleadores());
			break;
		case VISUALIZAR_CUENTAS:
			this.vista.setTextVista(Agencia.getInstancia().getFuncAdministradorActual().visualizarCuentas());
			break;
		case VISUALIZAR_CONTRATOS:
			this.vista.setTextVista(Agencia.getInstancia().getFuncAdministradorActual().visualizarContratos());
			break;
		}
	}
}
