package persistencia;

import entidades.Cuenta;
import entidades.Usuario;

public class AdministradorDto extends Usuario{
	
	private String codigoAdministrador;
	
	public AdministradorDto() {}
	
	public AdministradorDto (Cuenta cuenta,String codigoAdministrador) 
	{
		super(cuenta);
		this.codigoAdministrador = codigoAdministrador;
	}
	
	public String getCodigoAdministrador() {
		return codigoAdministrador;
	}
	public void setCodigoAdministrador(String codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
	}
	
	
}
