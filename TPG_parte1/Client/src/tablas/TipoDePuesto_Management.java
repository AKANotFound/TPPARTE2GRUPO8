package tablas;

public class TipoDePuesto_Management extends TipoDePuesto {

	@Override
	public double comparaCon(TipoDePuesto t) {
		return t.comparaConManagment();
	}

	@Override
	public double comparaConJunior() {
		return -1;
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
