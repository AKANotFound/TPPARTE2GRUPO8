package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
import vista.IVistaInicial;
import vista.Ventana;

public class ControladorVistaInicial implements ActionListener {
	private IVistaInicial vistaInicial = null;
	private JPanel contentPane = null;

	private final String CREAR_CUENTA = "CrearCuenta";
	private final String SIMULACION = "Simulacion";
	private final String INICIAR_SESION = "IniciarSesion";
	
	public final static String ADMINISTRADOR = "Administrador";
	public final static String EMPLEADOR = "Empleador";
	public final static String EMPLEADO_PRETENSO = "EmpleadoPretenso";
	
	public ControladorVistaInicial(IVistaInicial vistaInicial,JPanel contentPane) {
		super();
		this.vistaInicial = vistaInicial;
		this.vistaInicial.setActionListener(this);
		this.contentPane = contentPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		if(comando.equals(CREAR_CUENTA)) {
			if(this.vistaInicial.isRdbtn_Administrador_Selected())
				cl.show(contentPane, Ventana.VISTA_REGISTRAR_ADMINISTRADOR);
			else if(this.vistaInicial.isRdbtn_Empleador_Selected())
				cl.show(contentPane, Ventana.VISTA_REGISTRAR_EMPLEADOR);
			else if(this.vistaInicial.isRdbtn_EmpleadoPretenso_Selected())
				cl.show(contentPane, Ventana.VISTA_REGISTRAR_EMPLEADO_PRETENSO);
		}
		else if(comando.equals(INICIAR_SESION)) {
			if(this.vistaInicial.isRdbtn_Administrador_Selected()) {
				Agencia.getInstancia().setUsuarioActual(ADMINISTRADOR);
				cl.show(contentPane, Ventana.VISTA_FUNCIONALIDADES_ADMINISTRADOR);				
			}
			else if(this.vistaInicial.isRdbtn_Empleador_Selected()) {
				Agencia.getInstancia().setUsuarioActual(EMPLEADOR);
				cl.show(contentPane, Ventana.VISTA_FUNCIONALIDADES_PERSONA);				
			}
			else if(this.vistaInicial.isRdbtn_EmpleadoPretenso_Selected()) {
				Agencia.getInstancia().setUsuarioActual(EMPLEADO_PRETENSO);
				cl.show(contentPane, Ventana.VISTA_FUNCIONALIDADES_PERSONA);				
			}
		}
		else if(comando.equals(SIMULACION)) {
			cl.show(contentPane, Ventana.VISTA_SIMULACION);
		}
	}
	
	
}
