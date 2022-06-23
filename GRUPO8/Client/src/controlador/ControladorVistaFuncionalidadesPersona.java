package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidades.Agencia;
import entidades.PersonaElegida;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import vista.IVentana;
import vista.IVistaFuncionalidadesPersona;
import vista.Ventana;

public class ControladorVistaFuncionalidadesPersona implements ActionListener {
	private IVistaFuncionalidadesPersona vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String GESTION_DE_TICKET = "GestionDeTicket";
	private final String INICIAR_RONDA_DE_ELECCION = "IniciarRondaDeEleccion";
	private final String VISUALIZAR_RESULTADO = "VisualizarResultado";
	private final String VISUALIZAR_PERSONAS_ELEGIDAS = "VisualizarPersonasElegidas";
	private final String ACEPTAR_ELECCION = "AceptarEleccion";
	private final String CERRAR_SESION = "CerrarSesion";
	private final String BORRAR_CUENTA = "BorrarCuenta";
	
	public ControladorVistaFuncionalidadesPersona(IVentana ventana,IVistaFuncionalidadesPersona vista) {
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
		
		ArrayList<PersonaElegida> personasElegidas = this.vista.getPersonasElegidas();
		
		if(comando.equals(ACEPTAR_ELECCION))
		{
			switch(Agencia.getInstancia().getTipoUsuarioActual()) {
			case Agencia.EMPLEADOR:
				Persona_Empleador empleador = (Persona_Empleador) Agencia.getInstancia().getFuncEmpleadorActual().getUsuario();
				empleador.setEmpleadosElegidos(personasElegidas);
				break;
			case Agencia.EMPLEADO_PRETENSO:
				if(personasElegidas.size() > 1)
					this.vista.ventanaEmergente("Solo puede elegir un empleador");
				else {
					PersonaElegida personaElegida = personasElegidas.get(0);
					Persona_EmpleadoPretenso empleadoPretenso = (Persona_EmpleadoPretenso) Agencia.getInstancia().getFuncEmpleadoPretensoActual().getUsuario();
					empleadoPretenso.setEmpleadorElegido(personaElegida);
				}
			}
		}
		else if(comando.equals(BORRAR_CUENTA)) {
			int result =this.vista.ventanaEmergenteConfirmar("¿Estás seguro de que deseas eliminar tu cuenta?");
	        if (result == 0) 
	        {
	        	Agencia.getInstancia().getUsuarios().remove(Agencia.getInstancia().getTipoUsuarioActual());
	        	cl.show(contentPane, ventana.getVistaInicial());
	        }
		}
		else if(comando.equals(CERRAR_SESION)) {
			Agencia.getInstancia().setTipoUsuarioActual("");
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else if(comando.equals(GESTION_DE_TICKET)) {
			cl.show(contentPane, ventana.getVistaGestionTicketPersona());
		}
		else if(comando.equals(INICIAR_RONDA_DE_ELECCION)) {
			switch(Agencia.getInstancia().getTipoUsuarioActual()) {
			case Agencia.EMPLEADOR:
				vista.visualizarListaDeAsignacion(Agencia.getInstancia().getFuncEmpleadorActual().getListaDeAsignacion());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				vista.visualizarListaDeAsignacion(Agencia.getInstancia().getFuncEmpleadoPretensoActual().getListaDeAsignacion());
				break;
			}
		}
		else if(comando.equals(VISUALIZAR_PERSONAS_ELEGIDAS)) {
			switch(Agencia.getInstancia().getTipoUsuarioActual()) {
			case Agencia.EMPLEADOR:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadorActual().visualizarPersonasElegidas());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadoPretensoActual().visualizarPersonasElegidas());
				break;
			}
		}
		else if(comando.equals(VISUALIZAR_RESULTADO)) {
			switch(Agencia.getInstancia().getTipoUsuarioActual()) {
			case Agencia.EMPLEADOR:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadorActual().visualizaResultado());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadoPretensoActual().visualizaResultado());
				break;
			}
		}
	}
	
	
}
