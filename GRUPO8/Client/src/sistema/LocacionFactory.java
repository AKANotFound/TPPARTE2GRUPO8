package sistema;

import tablas.ILocacion;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public class LocacionFactory {

	static ILocacion getLocacion (String tipo) {
		ILocacion locacion = null;
		
		if(tipo.equalsIgnoreCase("Home Office"))
			locacion = Locacion_HomeOffice.getInstancia();
		else if(tipo.equalsIgnoreCase("Presencial"))
			locacion = Locacion_Presencial.getInstancia();
		else if(tipo.equalsIgnoreCase("Indistinto"))
			locacion = Locacion_Indistinto.getInstancia();
		
		return locacion;
	}
}
 