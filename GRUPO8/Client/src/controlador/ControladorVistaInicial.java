package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import sistema.FuncionalidadAdministrador;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaInicial;
import vista.Ventana;

public class ControladorVistaInicial implements ActionListener {
	private IVistaInicial vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;

	private final String CREAR_CUENTA = "CrearCuenta";
	private final String SIMULACION = "Simulacion";
	private final String INICIAR_SESION = "IniciarSesion";
	
	public final static String ADMINISTRADOR = "Administrador";
	public final static String EMPLEADOR = "Empleador";
	public final static String EMPLEADO_PRETENSO = "EmpleadoPretenso";
	
	public ControladorVistaInicial(IVentana ventana,IVistaInicial vista) {
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
		
		if(comando.equals(CREAR_CUENTA)) {
			
			switch(this.vista.getTipoUsuario())
			{
			  case"Administrador":cl.show(contentPane, ventana.getVistaRegistrarAdministrador());
				break;
			  case "Empleador":cl.show(contentPane, ventana.getVistaRegistrarEmpleador());
			    break;
			  case"Empleado pretenso":cl.show(contentPane, ventana.getVistaRegistrarEmpleadoPretenso());
			  	break;
			}
			
				
		}
		else if(comando.equals(INICIAR_SESION)) {
			
			switch(this.vista.getTipoUsuario())
			{
			  case"Administrador":Agencia.getInstancia().setUsuarioActual(ADMINISTRADOR);
			  	FuncionalidadAdministrador loginAdministrador = null;
			  	try {
					loginAdministrador = Sistema.loginAdministrador(vista.getUsuario(), vista.getContrasena());
				} catch (ErrorContrasenaException e2) {
					vista.ventanaEmergente("Contraseña errónea");
					vista.limpiarVista();
					e2.printStackTrace();
				} catch (ErrorUsuarioException e2) {
					vista.ventanaEmergente("Usuario erróneo");
					vista.limpiarVista();
					e2.printStackTrace();
				}
				cl.show(contentPane, ventana.getVistaFuncionalidadesAdministrador());
				Agencia.getInstancia().setFuncAdministradorActual(loginAdministrador);
				break;
				
			  case "Empleador":Agencia.getInstancia().setUsuarioActual(EMPLEADOR);
			  	FuncionalidadEmpleador loginEmpleador = null;
			  	try {
					loginEmpleador = Sistema.loginEmpleador(vista.getUsuario(), vista.getContrasena());
				} catch (ErrorContrasenaException e1) {
					vista.ventanaEmergente("Contraseña errónea");
					vista.limpiarVista();
					e1.printStackTrace();
				} catch (ErrorUsuarioException e1) {
					vista.ventanaEmergente("Usuario erróneo");
					vista.limpiarVista();
					e1.printStackTrace();
				}
				cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());
				Agencia.getInstancia().setFuncEmpleadorActual(loginEmpleador);
			    break;
			    
			  case"Empleado pretenso":Agencia.getInstancia().setUsuarioActual(EMPLEADO_PRETENSO);
			  	FuncionalidadEmpleadoPretenso loginEmpleadoPretenso = null;
			  	try {
					loginEmpleadoPretenso = Sistema.loginEmpleadoPretenso(vista.getUsuario(), vista.getContrasena());
				} catch (ErrorContrasenaException e1) {
					vista.ventanaEmergente("Contraseña errónea");
					vista.limpiarVista();
					e1.printStackTrace();
				} catch (ErrorUsuarioException e1) {
					vista.ventanaEmergente("Usuario erróneo");
					vista.limpiarVista();
					e1.printStackTrace();
				}
			  	Agencia.getInstancia().setFuncEmpleadoPretensoActual(loginEmpleadoPretenso);
				cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());		
			  	break;
			}
			
				
			
		}
		else if(comando.equals(SIMULACION)) {
			cl.show(contentPane, ventana.getVistaSimulacion());
			
		}
		
		this.vista.limpiarVista();
	}
	
	
}
