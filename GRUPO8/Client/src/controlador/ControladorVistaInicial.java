package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVistaInicial;
import vista.Ventana;

public class ControladorVistaInicial implements ActionListener {
	private IVistaInicial vistaInicial = null;
	private JPanel contentPane = null;

	private final String VISTA_INICIAL_CREAR_CUENTA = "VistaInicial_CrearCuenta";
	private final String VISTA_INICIAL_SIMULACION = "VistaInicial_Simulacion";
	private final String VISTA_INICIAL_INICIAR_SESION = "VistaInicial_IniciarSesion";
	
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
		
		if(comando.equals(VISTA_INICIAL_CREAR_CUENTA)) {
			if(this.vistaInicial.isRdbtn_Administrador_Selected())
				cl.show(contentPane, Ventana.VISTA_REGISTRAR_ADMINISTRADOR);
			else if(this.vistaInicial.isRdbtn_Empleador_Selected())
				cl.show(contentPane, Ventana.VISTA_REGISTRAR_EMPLEADOR);
			else if(this.vistaInicial.isRdbtn_EmpleadoPretenso_Selected())
				cl.show(contentPane, Ventana.VISTA_REGISTRAR_EMPLEADO_PRETENSO);
		}
		else if(comando.equals(VISTA_INICIAL_SIMULACION)) {
			cl.show(contentPane, Ventana.VISTA_SIMULACION);
		}
	}
	
	
}
