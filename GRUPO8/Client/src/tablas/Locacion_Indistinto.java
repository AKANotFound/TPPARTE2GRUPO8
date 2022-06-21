package tablas;

public class Locacion_Indistinto implements ILocacion {
	
	private static Locacion_Indistinto instancia = null;
	
	public Locacion_Indistinto() {}
	
	public static Locacion_Indistinto getInstancia() {
		if(instancia == null)
			instancia = new Locacion_Indistinto();
		return instancia;
	}
	
	@Override
	public double comparaCon(ILocacion locacion) {
		return locacion.comparaConIndistinto();
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
			return " indistinto";
		}
}
