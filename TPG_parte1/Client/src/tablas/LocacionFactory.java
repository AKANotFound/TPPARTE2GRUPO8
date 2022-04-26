package tablas;

public class LocacionFactory {
	
	public static Locacion getLocacion(String tipo) {
		Locacion locacion = null;
		
		if(tipo.equals("HomeOffice")) 
			locacion = new Locacion_HomeOffice();
		else
			if(tipo.equals("Presencial"))
				locacion = new Locacion_Presencial();
			else
				if(tipo.equals("Indistinto"))
					locacion = new Locacion_Indistinto();
		
		return locacion;
	}
}
