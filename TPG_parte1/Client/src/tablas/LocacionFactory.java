package tablas;

public class LocacionFactory {
	
	public static ILocacion getLocacion(String tipo) {
		ILocacion ilocacion = null;
		
		if(tipo.equals("HomeOffice")) 
			ilocacion =  new Locacion_HomeOffice();
		else
			if(tipo.equals("Presencial"))
				ilocacion =  new Locacion_Presencial();
			else
				if(tipo.equals("Indistinto"))
					ilocacion = new Locacion_Indistinto();
		
		return ilocacion;
	}
}
