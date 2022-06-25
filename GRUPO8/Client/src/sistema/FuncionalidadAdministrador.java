package sistema;

import entidades.Agencia;
import entidades.Usuario;
import excepciones.RondaDeEncuentrosLaboralesNoIniciadaException;

public class FuncionalidadAdministrador extends FuncionalidadUsuario{
	
	public FuncionalidadAdministrador(Usuario usuario) {
		super(usuario);
		// TODO Auto-generated constructor stub
	}

	public void iniciaRondaEncuentrosLaborales() {
		RondaDeEncuentrosLaborales.iniciaRondaDeEncuentrosLaborales();
	}
	
	public void iniciaRondaContratacion() 
	{
			RondaDeContrataciones.iniciaRondaDeContrataciones();
		
	}
	
	public String visualizarEmpleadores() {
		String str = "";
		for (int i=0; i<Agencia.getInstancia().getEmpleadores().size(); i++) {
			str += Agencia.getInstancia().getEmpleadores().get(i) + "\n";
		}
		return str;
	}
	
	public String visualizarEmpleadosPretensos() {
		String str = "";
		for (int i=0; i<Agencia.getInstancia().getEmpleadosPretensos().size() ; i++) {
			str += Agencia.getInstancia().getEmpleadosPretensos().get(i) + "\n";
		}
		return str;
	}
	
	public String visualizarTicketsEmpleadores() {
		
		return ""+Agencia.getInstancia().getTicketsEmpleadores();
	}
	
	public String visualizarTicketsEmpleadosPretensos() {
		return ""+Agencia.getInstancia().getTicketsEmpleadosPretensos();
	}
	
	public String visualizarCuentas() {
		return ""+Agencia.getInstancia().getUsuarios();
	}
	
	public String visualizarContratos() {
		return ""+Agencia.getInstancia().getContratos();
	}
}
