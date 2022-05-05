package sistema;

import tablas.ILocacion;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public abstract class LocacionFactory {

	public static ILocacion getLocacion (String tipo) {
		ILocacion locacion = null;
		
		if(tipo.equalsIgnoreCase("home office"))
			locacion = new Locacion_HomeOffice();
		else if(tipo.equalsIgnoreCase("presencial"))
			locacion = new Locacion_Presencial();
		else if(tipo.equalsIgnoreCase("indistinto"))
			locacion = new Locacion_Indistinto();
		
		return locacion;
	}
}
