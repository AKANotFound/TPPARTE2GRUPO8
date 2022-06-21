package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
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
	
	public ControladorVistaInicial(IVentana ventana,IVistaInicial vista,JPanel contentPane) {
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
		
		if(comando.equals(CREAR_CUENTA)) {
			if(this.vista.isRdbtn_Administrador_Selected())
				cl.show(contentPane, ventana.getVistaRegistrarAdministrador());
			else if(this.vista.isRdbtn_Empleador_Selected())
				cl.show(contentPane, ventana.getVistaRegistrarEmpleador());
			else if(this.vista.isRdbtn_EmpleadoPretenso_Selected())
				cl.show(contentPane, ventana.getVistaRegistrarEmpleadoPretenso());
		}
		else if(comando.equals(INICIAR_SESION)) {
			if(this.vista.isRdbtn_Administrador_Selected()) {
				Agencia.getInstancia().setUsuarioActual(ADMINISTRADOR);
				cl.show(contentPane, ventana.getVistaFuncionalidadesAdministrador());				
			}
			else if(this.vista.isRdbtn_Empleador_Selected()) {
				Agencia.getInstancia().setUsuarioActual(EMPLEADOR);
				cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());				
			}
			else if(this.vista.isRdbtn_EmpleadoPretenso_Selected()) {
				Agencia.getInstancia().setUsuarioActual(EMPLEADO_PRETENSO);
				cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());				
			}
		}
		else if(comando.equals(SIMULACION)) {
			cl.show(contentPane, ventana.getVistaSimulacion());
		}
	}
	
	
}
