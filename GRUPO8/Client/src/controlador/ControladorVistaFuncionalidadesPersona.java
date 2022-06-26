package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import entidades.Agencia;
import entidades.PersonaElegida;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import excepciones.ListaNoGeneradaException;
import excepciones.TicketNullException;
import persistencia.Persiste;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaFuncionalidadesPersona;

public class ControladorVistaFuncionalidadesPersona implements ActionListener {
	private IVistaFuncionalidadesPersona vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private boolean rondaEleccionActivada = false;
	
	private final String GESTION_DE_TICKET = "GestionDeTicket";
	private final String INICIAR_RONDA_DE_ELECCION = "IniciarRondaDeEleccion";
	private final String VISUALIZAR_RESULTADO = "VisualizarResultado";
	private final String VISUALIZAR_PERSONAS_ELEGIDAS = "VisualizarPersonasElegidas";
	private final String ACEPTAR_ELECCION = "AceptarEleccion";
	private final String CERRAR_SESION = "CerrarSesion";
	private final String BORRAR_CUENTA = "BorrarCuenta";
	
	
	public ControladorVistaFuncionalidadesPersona(IVentana ventana) {
		super();
		this.vista = ventana.getVistaFuncionalidadesPersona();
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane = ventana.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		
		
		switch(comando) {
		case ACEPTAR_ELECCION:
			ArrayList<PersonaElegida> personasElegidas=null;
			try{
				personasElegidas= this.vista.getPersonasElegidas();
			
			}catch(ListaNoGeneradaException exception)
			{
				this.vista.ventanaEmergente(exception.getMessage());
			}
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) {
			case Agencia.EMPLEADOR:
				Persona_Empleador empleador = (Persona_Empleador) Agencia.getInstancia().getFuncEmpleadorActual().getUsuario();
				empleador.setEmpleadosElegidos(personasElegidas);
				break;
			case Agencia.EMPLEADO_PRETENSO:
				if(personasElegidas!=null)
				{
					if(personasElegidas.size() > 1)
						this.vista.ventanaEmergente("Solo puede elegir un empleador");
					else {
						PersonaElegida personaElegida = personasElegidas.get(0);
						Persona_EmpleadoPretenso empleadoPretenso = (Persona_EmpleadoPretenso) Agencia.getInstancia().getFuncEmpleadoPretensoActual().getUsuario();
						empleadoPretenso.setEmpleadorElegido(personaElegida);
					}
				}
			}
			break;
		case BORRAR_CUENTA:
			int result =this.vista.ventanaEmergenteConfirmar("Estas seguro de que deseas eliminar tu cuenta?");
	        if (result == 0) 
	        {
	        	Sistema.borrarCuenta();
	        	Persiste.getInstancia().persistir();
	        	this.vista.ventanaEmergente("Cuenta borrada exitosamente");
	        	cl.show(contentPane, ventana.getID_VistaInicial());
	        	this.vista.limpiarVista();
	        }
	        break;
		case CERRAR_SESION:
			Sistema.cerrarSesion();
			cl.show(contentPane, ventana.getID_VistaInicial());
			this.vista.limpiarVista();
			break;
		case GESTION_DE_TICKET:
			cl.show(contentPane, ventana.getID_VistaGestionTicketPersona());
			break;
		case INICIAR_RONDA_DE_ELECCION:
			if(this.rondaEleccionActivada == false) {
				this.rondaEleccionActivada = true;
				switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) {
				case Agencia.EMPLEADOR:
					try
					{
						vista.visualizarListaDeAsignacion(Agencia.getInstancia().getFuncEmpleadorActual().getListaDeAsignacion());
					} catch (ListaNoGeneradaException e1)
					{
						this.vista.ventanaEmergente(e1.getMessage());
					}
					break;
				case Agencia.EMPLEADO_PRETENSO:
					try
					{
						vista.visualizarListaDeAsignacion(Agencia.getInstancia().getFuncEmpleadoPretensoActual().getListaDeAsignacion());
					} catch (ListaNoGeneradaException e1)
					{
						this.vista.ventanaEmergente(e1.getMessage());
					}
					break;
				}
			}
			else
				this.vista.ventanaEmergente("Ronda de eleccion ya ha sido activada");
			break;
		case VISUALIZAR_PERSONAS_ELEGIDAS:
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) {
			case Agencia.EMPLEADOR:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadorActual().visualizarPersonasElegidas());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadoPretensoActual().visualizarPersonasElegidas());
				break;
			}
			break;
		case VISUALIZAR_RESULTADO:
			switch(Agencia.getInstancia().getCuentaActual().getTipoUsuario()) {
			case Agencia.EMPLEADOR:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadorActual().visualizaResultado());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				try {
					vista.setTextVista(Agencia.getInstancia().getFuncEmpleadoPretensoActual().visualizaResultado());
				} catch (TicketNullException e1) {
					vista.ventanaEmergente(e1.getMessage());
				}
				break;
			}
			break;
		}
	}
	
	
}
