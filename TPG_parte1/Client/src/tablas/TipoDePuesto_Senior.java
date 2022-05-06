package tablas;

public class TipoDePuesto_Senior implements ITipoDePuesto {

	@Override
	public double comparaCon(ITipoDePuesto t) {
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

	@Override
	public String toString() {
		return " senior";
	}
}
