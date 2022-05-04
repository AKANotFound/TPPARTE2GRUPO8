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
		System.out.println(Agencia.getInstancia().getEmpleadores());
	}
	
	public void visualizarEmpleadosPretensos() {
		System.out.println(Agencia.getInstancia().getEmpleadosPretensos());
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
