package tablas;

public class Locacion_Presencial implements ILocacion {
	
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
}
