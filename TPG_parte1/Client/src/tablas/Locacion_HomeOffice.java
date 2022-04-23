package tablas;

public class Locacion_HomeOffice extends Locacion {
	
	@Override
	public double comparaCon(Locacion locacion) {
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
}
