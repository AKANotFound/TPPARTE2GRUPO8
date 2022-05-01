package entidades;

public class Cuenta {

	private String usuario;
	private String contrasena;
	
	public Cuenta(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	public boolean confirmaContrasena(String constrasena) {
        return this.contrasena.equals(constrasena);
    }
}
