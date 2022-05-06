package sistema;

import entidades.Agencia;
import entidades.Usuario;

public class FuncionalidadAdministrador extends FuncionalidadUsuario{
	
	public FuncionalidadAdministrador(Usuario usuario) {
		super(usuario);
		// TODO Auto-generated constructor stub
	}

	public void iniciaRondaEncuentrosLaborales() {
		RondaDeEncuentrosLaborales.iniciaRondaDeEncuentrosLaborales();
	}
	
	public void iniciaRondaContratacion() {
		RondaDeContrataciones.iniciaRondaDeContrataciones();
	}
	
	public void visualizarEmpleadores() {
		for (int i=0; i<Agencia.getInstancia().getEmpleadores().size(); i++)
		{
			System.out.println (Agencia.getInstancia().getEmpleadores().get(i));
		}
	}
	
	public void visualizarEmpleadosPretensos() {
		for (int i=0; i<Agencia.getInstancia().getEmpleadosPretensos().size() ; i++)
		{
			System.out.println (Agencia.getInstancia().getEmpleadosPretensos().get(i));
		}
		
	}
	
	public void visualizarTicketsEmpleadores() {
		System.out.println(Agencia.getInstancia().getTicketsEmpleadores());
	}
	
	public void visualizarTicketsEmpleadosPretensos() {
		System.out.println(Agencia.getInstancia().getEmpleadosPretensos());
	}
	
	public void visualizarCuentas() {
		System.out.println(Agencia.getInstancia().getUsuarios());
	}
	
	public void visualizarLogins() {
		System.out.println(Agencia.getInstancia().getLogins());
	}
	
	public void visualizarContratos() {
		System.out.println(Agencia.getInstancia().getContratos());
	}
}
