package client;

public class TipoDePuesto_Junior extends TipoDePuesto {

	@Override
	public double comparaCon(TipoDePuesto t) {
		return t.comparaConJunior();
	}

	@Override
	public double comparaConJunior() {
		return 1;
	}

	@Override
	public double comparaConSenior() {
		return -0.5;
	}

	@Override
	public double comparaConManagment() {
		return -1;
	}
}
