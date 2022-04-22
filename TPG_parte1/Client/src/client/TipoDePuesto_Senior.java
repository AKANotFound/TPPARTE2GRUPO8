package client;

public class TipoDePuesto_Senior extends TipoDePuesto {

	@Override
	public double comparaCon(TipoDePuesto t) {
		return t.comparaConSenior();
	}

	@Override
	public double comparaConJunior() {
		return -0.5;
	}

	@Override
	public double comparaConSenior() {
		return 1;
	}

	@Override
	public double comparaConManagment() {
		return -0.5;
	}
}
