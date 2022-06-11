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
	
	public void iniciaRondaContratacion() {
		try
		{
			RondaDeContrataciones.iniciaRondaDeContrataciones();
		} catch (RondaDeEncuentrosLaboralesNoIniciadaException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		return ""+Agencia.getInstancia().getEmpleadosPretensos();
	}
	
	public String visualizarCuentas() {
		return ""+Agencia.getInstancia().getUsuarios();
	}
	
	public String visualizarLogins() {
		return ""+Agencia.getInstancia().getLogins();
	}
	
	public String visualizarContratos() {
		return ""+Agencia.getInstancia().getContratos();
	}
}
