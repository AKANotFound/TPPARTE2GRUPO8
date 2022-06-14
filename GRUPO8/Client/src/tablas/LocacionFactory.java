package tablas;

public class LocacionFactory {
	
	public static ILocacion getLocacion(String tipo) {
		ILocacion ilocacion = null;
		
		if(tipo.equals("HomeOffice")) 
			ilocacion =  Locacion_HomeOffice.getInstancia();
		else
			if(tipo.equals("Presencial"))
				ilocacion =  Locacion_Presencial.getInstancia();
			else
				if(tipo.equals("Indistinto"))
					ilocacion = Locacion_Indistinto.getInstancia();
		
		return ilocacion;
	}
}
