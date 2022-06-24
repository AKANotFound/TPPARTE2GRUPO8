package entidades;

import java.io.Serializable;

public class Cuenta {

	private String usuario;
	private String contrasena;
	private String tipoUsuario;
	
	public Cuenta() {}
	
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
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public boolean confirmaContrasena(String constrasena) {
        return this.contrasena.equals(constrasena);
    } 
}
