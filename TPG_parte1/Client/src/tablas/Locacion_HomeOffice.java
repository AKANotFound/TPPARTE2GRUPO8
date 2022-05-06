package tablas;

public class Locacion_HomeOffice implements ILocacion {
	
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
		return "home office";
	}
	
}
