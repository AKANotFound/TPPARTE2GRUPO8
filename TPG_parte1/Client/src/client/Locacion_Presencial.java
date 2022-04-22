package client;

public class Locacion_Presencial extends Locacion {
	
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
