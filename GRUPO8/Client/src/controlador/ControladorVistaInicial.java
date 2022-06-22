package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidades.Agencia;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import sistema.FuncionalidadAdministrador;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
import sistema.Sistema;
import entidades.Usuario;
import vista.IVentana;
import vista.IVistaInicial;

public class ControladorVistaInicial implements ActionListener {
	private IVistaInicial vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;

	private final String CREAR_CUENTA = "CrearCuenta";
	private final String SIMULACION = "Simulacion";
	private final String INICIAR_SESION = "IniciarSesion";

	public ControladorVistaInicial(IVentana ventana, IVistaInicial vista) {
		super();
		this.vista = vista;
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane = ventana.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout) (contentPane.getLayout());
		String comando = e.getActionCommand();
		Usuario u;

		if (comando.equals(CREAR_CUENTA)) {

			switch (this.vista.getTipoUsuario()) {
			case Agencia.ADMINISTRADOR:
				cl.show(contentPane, ventana.getVistaRegistrarAdministrador());
				break;
			case Agencia.EMPLEADOR:
				cl.show(contentPane, ventana.getVistaRegistrarEmpleador());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				cl.show(contentPane, ventana.getVistaRegistrarEmpleadoPretenso());
				break;
			}

		} else if (comando.equals(INICIAR_SESION)) {
			if (!Agencia.getInstancia().getUsuarios().containsKey(this.vista.getUsuario()))
				this.vista.ventanaEmergente("No existe la cuenta. Intente registrarse.");
			else
			{
				switch(this.vista.getTipoUsuario())
				{
				  case Agencia.ADMINISTRADOR:Agencia.getInstancia().setUsuarioActual(Agencia.ADMINISTRADOR);
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
					
				  case Agencia.EMPLEADOR:Agencia.getInstancia().setUsuarioActual(Agencia.EMPLEADOR);
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
				    
				  case Agencia.EMPLEADO_PRETENSO:Agencia.getInstancia().setUsuarioActual(Agencia.EMPLEADO_PRETENSO);
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
				
		}
		 else if (comando.equals(SIMULACION)) {
			cl.show(contentPane, ventana.getVistaSimulacion());

		}

		this.vista.limpiarVista();
	}

}
