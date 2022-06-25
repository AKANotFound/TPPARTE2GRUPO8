package tablas;

public class Locacion_Presencial implements ILocacion {
	
	//private static Locacion_Presencial instancia = null;
	
	public Locacion_Presencial() {}
	
	/*public static Locacion_Presencial getInstancia() {
		if(instancia == null)
			instancia = new Locacion_Presencial();
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
		return locacion.comparaConPresencial();
	}
	
  	@Override
	public double comparaConPresencial() {
		return 1;
	}

	@Override
	public double comparaConHomeOffice() {
		return -1;
	}

	@Override
	public double comparaConIndistinto() {
		return -1;
	}
	@Override
	public String toString() {
		return " presencial";
	}
}
