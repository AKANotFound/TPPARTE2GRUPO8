package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidades.Agencia;
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

	public final static String ADMINISTRADOR = "Administrador";
	public final static String EMPLEADOR = "Empleador";
	public final static String EMPLEADO_PRETENSO = "EmpleadoPretenso";

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
			case "Administrador":
				cl.show(contentPane, ventana.getVistaRegistrarAdministrador());
				break;
			case "Empleador":
				cl.show(contentPane, ventana.getVistaRegistrarEmpleador());
				break;
			case "Empleado pretenso":
				cl.show(contentPane, ventana.getVistaRegistrarEmpleadoPretenso());
				break;
			}

		} else if (comando.equals(INICIAR_SESION)) {

			switch (this.vista.getTipoUsuario()) {
			case "Administrador":
				Agencia.getInstancia().setUsuarioActual(ADMINISTRADOR);
				cl.show(contentPane, ventana.getVistaFuncionalidadesAdministrador());
				break;
			case "Empleador":
				Agencia.getInstancia().setUsuarioActual(EMPLEADOR);
				if (Agencia.getInstancia().getUsuarios().containsKey(EMPLEADOR))
					cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());
				else
					JOptionPane.showMessageDialog(null, "No estas papa, registrate");
				break;
			case "Empleado pretenso":
				Agencia.getInstancia().setUsuarioActual(EMPLEADO_PRETENSO);
				if (Agencia.getInstancia().getUsuarios().containsKey(EMPLEADO_PRETENSO))
					cl.show(contentPane, ventana.getVistaFuncionalidadesPersona());
				else
					JOptionPane.showMessageDialog(null, "No estas papa, registrate");
				break;
			}

		} else if (comando.equals(SIMULACION)) {
			cl.show(contentPane, ventana.getVistaSimulacion());

		}

		this.vista.limpiarVista();
	}

}
