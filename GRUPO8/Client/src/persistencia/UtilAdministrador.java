package persistencia;

import entidades.Administrador;

public class UtilAdministrador {

	public static Administrador AdministradorFromAdministradorDto(AdministradorDto adminDto) 
	{
		Administrador admin = Administrador.getInstancia();
		admin.setCuenta(adminDto.getCuenta());
		admin.setCodigoAdministrador(adminDto.getCodigoAdministrador());
		return admin;
	}

	public static AdministradorDto AdministradorDtoFromAdministrador(Administrador admin) 
	{
		AdministradorDto adminDto = new AdministradorDto(admin.getCuenta(),admin.getCodigoAdministrador());
		return adminDto;
	}
}
