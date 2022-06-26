package prueba;

import java.io.IOException;

import controlador.ControladorVistaFormularioDeBusquedaEmpleadoPretenso;
import controlador.ControladorVistaFormularioDeBusquedaEmpleador;
import controlador.ControladorVistaFuncionalidadesAdministrador;
import controlador.ControladorVistaFuncionalidadesPersona;
import controlador.ControladorVistaGestionTicketPersona;
import controlador.ControladorVistaInicial;
import controlador.ControladorVistaRegistrarAdministrador;
import controlador.ControladorVistaRegistrarEmpleadoPretenso;
import controlador.ControladorVistaRegistrarEmpleador;
import controlador.ControladorVistaSimulacion;
import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;
import excepciones.EdadInvalidaException;
import excepciones.ErrorCodigoException;
import excepciones.ErrorContrasenaException;
import excepciones.ErrorUsuarioException;
import excepciones.TipoPersonaInvalidoException;
import persistencia.Persiste;
import sistema.FuncionalidadAdministrador;
import sistema.FuncionalidadEmpleadoPretenso;
import sistema.FuncionalidadEmpleador;
import sistema.Sistema;
import tablas.CargaHoraria_Completa;
import tablas.CargaHoraria_Extendida;
import tablas.CargaHoraria_Media;
import tablas.EstudiosCursados_Primario;
import tablas.EstudiosCursados_Secundario;
import tablas.EstudiosCursados_Terciario;
import tablas.ExperienciaPrevia_Media;
import tablas.ExperienciaPrevia_Mucha;
import tablas.ExperienciaPrevia_Nada;
import tablas.LocacionFactory;
import tablas.RangoEtario_MasDe50;
import tablas.RangoEtario_MenosDe40;
import tablas.Remuneracion_30mil;
import tablas.Remuneracion_60mil;
import tablas.Remuneracion_90mil;
import tablas.TipoDePuesto_Junior;
import tablas.TipoDePuesto_Management;
import tablas.TipoDePuesto_Senior;
import vista.Ventana;
import vista.VistaFormularioDeBusquedaEmpleadoPretenso;
import vista.VistaFormularioDeBusquedaEmpleador;
import vista.VistaFuncionalidadesAdministrador;
import vista.VistaFuncionalidadesPersona;
import vista.VistaGestionTicketPersona;
import vista.VistaInicial;
import vista.VistaRegistrarAdministrador;
import vista.VistaRegistrarEmpleadoPretenso;
import vista.VistaRegistrarEmpleador;
import vista.VistaSimulacion;

public class PruebaVista {

	public static void main(String[] args) {

		VistaInicial vistaInicial = new VistaInicial();
		VistaRegistrarAdministrador vistaRegistrarAdministrador = new VistaRegistrarAdministrador();
		VistaRegistrarEmpleadoPretenso vistaRegistrarEmpleadoPretenso = new VistaRegistrarEmpleadoPretenso();
		VistaRegistrarEmpleador vistaRegistrarEmpleador = new VistaRegistrarEmpleador();
		VistaFuncionalidadesAdministrador vistaFuncionalidadesAdministrador = new VistaFuncionalidadesAdministrador();
		VistaFuncionalidadesPersona vistaFuncionalidadesPersona = new VistaFuncionalidadesPersona();
		VistaFormularioDeBusquedaEmpleadoPretenso vistaFormularioDeBusquedaEmpleadoPretenso = new VistaFormularioDeBusquedaEmpleadoPretenso();
		VistaFormularioDeBusquedaEmpleador vistaFormularioDeBusquedaEmpleador = new VistaFormularioDeBusquedaEmpleador();
		VistaGestionTicketPersona vistaGestionTicketPersona = new VistaGestionTicketPersona();
		VistaSimulacion vistaSimulacion = new VistaSimulacion();

		Ventana ventana = new Ventana(vistaInicial, vistaRegistrarAdministrador, vistaRegistrarEmpleadoPretenso,
				vistaRegistrarEmpleador, vistaFuncionalidadesAdministrador, vistaFuncionalidadesPersona,
				vistaFormularioDeBusquedaEmpleadoPretenso, vistaFormularioDeBusquedaEmpleador,
				vistaGestionTicketPersona, vistaSimulacion);

		ControladorVistaInicial controladorVistaInicial = new ControladorVistaInicial(ventana, vistaInicial);
		ControladorVistaRegistrarAdministrador controladorVistaRegistrarAdministrador = new ControladorVistaRegistrarAdministrador(
				ventana, vistaRegistrarAdministrador);
		ControladorVistaRegistrarEmpleadoPretenso controladorVistaRegistrarEmpleadoPretenso = new ControladorVistaRegistrarEmpleadoPretenso(
				ventana, vistaRegistrarEmpleadoPretenso);
		ControladorVistaRegistrarEmpleador controladorVistaRegistrarEmpleador = new ControladorVistaRegistrarEmpleador(
				ventana, vistaRegistrarEmpleador);
		ControladorVistaSimulacion controladorVistaSimulacion = new ControladorVistaSimulacion(ventana,
				vistaSimulacion);
		ControladorVistaFuncionalidadesAdministrador controladorVistaFuncionalidadesAdministrador = new ControladorVistaFuncionalidadesAdministrador(
				ventana, vistaFuncionalidadesAdministrador);
		ControladorVistaFuncionalidadesPersona controladorVistaFuncionalidadesPersona = new ControladorVistaFuncionalidadesPersona(
				ventana, vistaFuncionalidadesPersona);
		ControladorVistaFormularioDeBusquedaEmpleador controladorVistaFormularioDeBusquedaEmpleador = new ControladorVistaFormularioDeBusquedaEmpleador(
				ventana, vistaFormularioDeBusquedaEmpleador);
		ControladorVistaFormularioDeBusquedaEmpleadoPretenso controladorVistaFormularioDeBusquedaEmpleadoPretenso = new ControladorVistaFormularioDeBusquedaEmpleadoPretenso(
				ventana, vistaFormularioDeBusquedaEmpleadoPretenso);
		ControladorVistaGestionTicketPersona controladoVistaGestionTicketPersona = new ControladorVistaGestionTicketPersona(
				ventana, vistaGestionTicketPersona);

		// *************************************************************************************************************

		try 
		{
			Persiste.getInstancia().leer();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
