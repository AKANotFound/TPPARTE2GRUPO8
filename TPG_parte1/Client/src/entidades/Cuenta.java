package entidades;

public class Cuenta {

	private String usuario;
	private String contrasena;
	private String tipoUsuario;
	
	public Cuenta(String usuario, String contrasena, String tipoUsuario) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public boolean confirmaContrasena(String constrasena) {
        return this.contrasena.equals(constrasena);
    }
}
