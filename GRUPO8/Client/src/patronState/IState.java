package patronState;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Usuario;
import excepciones.ModificacionTicketInvalidaException;

public interface IState
{
	void activar();
	void suspender();
	void cancelar();
	void finalizar();
	void modificarTicket_Formulario(FormularioDeBusqueda form)throws ModificacionTicketInvalidaException;
	void comparaFormularioEmpleador(Persona_Empleador empleador,Persona_EmpleadoPretenso empleadoP,GregorianCalendar fecha,ArrayList<Persona_EmpleadoPretenso>empleadosPretensos);
	void comparaFormularioEmpleadoPretenso(Persona_EmpleadoPretenso empleadoP,Persona_Empleador empleador);
	void seteaResultado(Persona_EmpleadoPretenso empleadoPretenso);
	String visualizarCostoServicio(Persona persona);
	String visualizaResultado(Usuario usuario);
}
