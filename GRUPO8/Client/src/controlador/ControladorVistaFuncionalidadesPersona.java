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
import persistencia.Persiste;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaFuncionalidadesPersona;

public class ControladorVistaFuncionalidadesPersona implements ActionListener {
	private IVistaFuncionalidadesPersona vista = null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private String tipoUsuarioActual = Agencia.getInstancia().getCuentaActual().getTipoUsuario();
	
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
		
		
		
		switch(comando) {
		case ACEPTAR_ELECCION:
			ArrayList<PersonaElegida> personasElegidas=null;
			try{
				personasElegidas= this.vista.getPersonasElegidas();
			
			}catch(ListaNoGeneradaException exception)
			{
				this.vista.ventanaEmergente(exception.getMessage());
			}
			switch(tipoUsuarioActual) {
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
			//NO SE USA LA CLASE INICIAR RONDA DE ELECCIONES
			break;
		case BORRAR_CUENTA:
			int result =this.vista.ventanaEmergenteConfirmar("�Est�s seguro de que deseas eliminar tu cuenta?");
	        if (result == 0) 
	        {
	        	Sistema.borrarCuenta();
	        	Persiste.getInstancia().persistir();
	        	cl.show(contentPane, ventana.getVistaInicial());
	        }
	        break;
		case CERRAR_SESION:
			Sistema.cerrarSesion();
			cl.show(contentPane, ventana.getVistaInicial());
			break;
		case GESTION_DE_TICKET:
			cl.show(contentPane, ventana.getVistaGestionTicketPersona());
			break;
		case INICIAR_RONDA_DE_ELECCION:
			switch(tipoUsuarioActual) {
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
			break;
		case VISUALIZAR_PERSONAS_ELEGIDAS:
			switch(tipoUsuarioActual) {
			case Agencia.EMPLEADOR:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadorActual().visualizarPersonasElegidas());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadoPretensoActual().visualizarPersonasElegidas());
				break;
			}
			break;
		case VISUALIZAR_RESULTADO:
			switch(tipoUsuarioActual) {
			case Agencia.EMPLEADOR:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadorActual().visualizaResultado());
				break;
			case Agencia.EMPLEADO_PRETENSO:
				vista.setTextVista(Agencia.getInstancia().getFuncEmpleadoPretensoActual().visualizaResultado());
				break;
			}
			break;
		}
	}
	
	
}
