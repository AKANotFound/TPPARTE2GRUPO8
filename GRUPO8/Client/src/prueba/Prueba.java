package prueba;

import entidades.Agencia;
import entidades.Cuenta;
import entidades.Usuario;

public class Prueba {

	public static void main(String[] args) {

		
		//Persiste.getInstancia().leer();
		
		System.out.println(Agencia.getInstancia().getUsuarios());
		Usuario usuario = Agencia.getInstancia().getUsuarios().get("juan");
		Cuenta cuenta = usuario.getCuenta();
		
		
		System.out.println(cuenta);
	
		
	}

}
