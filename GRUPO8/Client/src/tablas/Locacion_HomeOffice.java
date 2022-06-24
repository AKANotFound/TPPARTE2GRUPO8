package tablas;

public class Locacion_HomeOffice implements ILocacion {
	
	//private static Locacion_HomeOffice instancia = null;
	
	public Locacion_HomeOffice() {}
	
	/*public static Locacion_HomeOffice getInstancia() {
		if(instancia == null)
			instancia = new Locacion_HomeOffice();
		return instancia;
	}*/
	

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (this.getClass() == obj.getClass())
			res = true;
		if (obj.getClass()== Locacion_Indistinto.class)
			res = true;
		return res;
	}
	
	@Override
	public double comparaCon(ILocacion locacion) {
		return locacion.comparaConHomeOffice();
	}
	
  	@Override
	public double comparaConPresencial() {
		return -1;
	}

	@Override
	public double comparaConHomeOffice() {
		return 1;
	}

	@Override
	public double comparaConIndistinto() {
		return 1;
	}

	@Override
	public String toString() {
		return " home office";
	}
	
}
