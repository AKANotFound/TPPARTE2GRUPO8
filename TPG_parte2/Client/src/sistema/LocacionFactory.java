package sistema;

import tablas.ILocacion;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public class LocacionFactory {

	static ILocacion getLocacion (String tipo) {
		ILocacion locacion = null;
		
		if(tipo.equalsIgnoreCase("Home Office"))
			locacion = new Locacion_HomeOffice();
		else if(tipo.equalsIgnoreCase("Presencial"))
			locacion = new Locacion_Presencial();
		else if(tipo.equalsIgnoreCase("Indistinto"))
			locacion = new Locacion_Indistinto();
		
		return locacion;
	}
}
 