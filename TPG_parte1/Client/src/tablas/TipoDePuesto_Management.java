package tablas;

public class TipoDePuesto_Management implements ITipoDePuesto {

	@Override
	public double comparaCon(ITipoDePuesto t) {
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

	@Override
	public String toString() {
		return " management";
	}
}
