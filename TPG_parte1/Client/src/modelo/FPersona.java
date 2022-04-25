package modelo;

import java.util.ArrayList;

public class FPersona {

	public static Persona registrarse(String tipo,String usuario, String contrasena) {
		Persona persona = null;
		
		if(tipo.equals("empleado")) {
			persona = new Persona_EmpleadoPretenso(new Cuenta(usuario, contrasena));
			Agencia.getInstancia().addEmpleado(persona);
		}
		else if(tipo.equals("empleador")) {
			persona = new Persona_Empleador(new Cuenta(usuario, contrasena));
			Agencia.getInstancia().addEmpleador(persona);
		}
		
		return persona;
	}

	public void login(String usuario, String contrasena) {
		ArrayList<Persona> empleadores = Agencia.getInstancia().getEmpleadores();
		ArrayList<Persona> empleados = Agencia.getInstancia().getEmpleadosPretensos();
		int i = 0;
		
		while(i < empleadores.size() && empleadores.get(i).getCuenta().getUsuario()!=usuario) 
				i++;
		if (i==empleadores.size())
		{
			i=0;
			while(i < empleados.size() && empleados.get(i).getCuenta().getUsuario()!=usuario) 
				i++;
			if (i<empleados.size())
				Agencia.getInstancia().addLogins(empleados.get(i).getCuenta());
			else
				System.out.println("no se encontro usuario"); //HACER EXCEPCION
		}
		else
			Agencia.getInstancia().addLogins(empleadores.get(i).getCuenta());
		
	}

	public void eleccion() {
		// TODO Auto-generated method stub
		
	}

	public void visualizarLista() {
		// TODO Auto-generated method stub
		
	}

	public void activarTicket() {
		// TODO Auto-generated method stub
		
	}

	public void suspenderTicket() {
		// TODO Auto-generated method stub
		
	}

	public void cancelarTicket() {
		// TODO Auto-generated method stub
		
	}

	public void finalizarTicket() {
		// TODO Auto-generated method stub
		
	}

}
