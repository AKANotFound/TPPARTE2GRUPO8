package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import entidades.Agencia;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.UsuarioYaRegistradoException;
import persistencia.Persiste;
import sistema.FuncionalidadAdministrador;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaInicial;

public class ControladorVistaInicial implements ActionListener {
	private IVistaInicial vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;

	private final String CREAR_CUENTA = "CrearCuenta";
	private final String SIMULACION = "Simulacion";
	private final String INICIAR_SESION = "IniciarSesion";

	public ControladorVistaInicial(IVentana ventana) {
		super();
		this.vista = ventana.getVistaInicial();
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane = ventana.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout) (contentPane.getLayout());
		String comando = e.getActionCommand();

		switch(comando) {
		case CREAR_CUENTA:
			switch (this.vista.getTipoUsuario()) {
			case Agencia.ADMINISTRADOR:
				cl.show(contentPane, ventana.getID_VistaRegistrarAdministrador());
				break;
			case Agencia.EMPLEADOR:
				cl.show(contentPane, ventana.getID_VistaRegistrarEmpleador());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				cl.show(contentPane, ventana.getID_VistaRegistrarEmpleadoPretenso());
				break;
			}
			break;
		case INICIAR_SESION:			
			if (Agencia.getInstancia().getUsuarios().containsKey(this.vista.getUsuario()) == false)
				this.vista.ventanaEmergente("No existe la cuenta. Intente registrarse.");
			else
			{
				Agencia.getInstancia().setCuentaActual(Agencia.getInstancia().getUsuarios().get(this.vista.getUsuario()).getCuenta());
				String tipoUsuario = Agencia.getInstancia().getCuentaActual().getTipoUsuario();
				switch(tipoUsuario)
				{
				  case Agencia.ADMINISTRADOR:
				  	try {
				  		Agencia.getInstancia().setFuncAdministradorActual(Sistema.loginAdministrador(vista.getUsuario(), vista.getContrasena()));
				  		cl.show(contentPane, ventana.getID_VistaFuncionalidadesAdministrador());
					} catch (ErrorContrasenaException e2) {
						vista.ventanaEmergente("Contrase�a err�nea");
						vista.limpiarVista();
						e2.printStackTrace();
					} catch (ErrorUsuarioException e2) {
						vista.ventanaEmergente("Usuario err�neo");
						vista.limpiarVista();
						e2.printStackTrace();
					} catch (UsuarioYaRegistradoException e1) {
						vista.ventanaEmergente(e1.getMessage());
					}
					
					break;
					
				  case Agencia.EMPLEADOR:
				  	try {
				  		Agencia.getInstancia().setFuncEmpleadorActual(Sistema.loginEmpleador(vista.getUsuario(), vista.getContrasena()));
				  		cl.show(contentPane, ventana.getID_VistaFuncionalidadesPersona());
					} catch (ErrorContrasenaException e1) {
						vista.ventanaEmergente("Contrase�a err�nea");
						vista.limpiarVista();
						e1.printStackTrace();
					} catch (ErrorUsuarioException e1) {
						vista.ventanaEmergente("Usuario err�neo");
						vista.limpiarVista();
						e1.printStackTrace();
					}
					
				    break;
				    
				  case Agencia.EMPLEADO_PRETENSO:
				  	try {
				  		Agencia.getInstancia().setFuncEmpleadoPretensoActual(Sistema.loginEmpleadoPretenso(vista.getUsuario(), vista.getContrasena()));
				  		cl.show(contentPane, ventana.getID_VistaFuncionalidadesPersona());		
					} catch (ErrorContrasenaException e1) {
						vista.ventanaEmergente("Contrase�a err�nea");
						vista.limpiarVista();
						e1.printStackTrace();
					} catch (ErrorUsuarioException e1) {
						vista.ventanaEmergente("Usuario err�neo");
						vista.limpiarVista();
						e1.printStackTrace();
					}
				  	break;

				}
			}
			break;
		case SIMULACION:
			cl.show(contentPane, ventana.getID_VistaSimulacion());			
		}
		
		this.vista.limpiarVista();
	}

}
