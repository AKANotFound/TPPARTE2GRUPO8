package client;

public class CuentaFactory {

	public static Cuenta getCuenta (String usuario, String contrasena)
	{
		Cuenta nuevaCuenta = null;
		nuevaCuenta.setUsuario(usuario);
		nuevaCuenta.setContrasena(contrasena);
		return nuevaCuenta;
	}

}
