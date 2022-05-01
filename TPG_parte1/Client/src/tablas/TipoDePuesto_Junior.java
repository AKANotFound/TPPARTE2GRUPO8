package tablas;

public class TipoDePuesto_Junior implements ITipoDePuesto {

	@Override
	public double comparaCon(ITipoDePuesto t) {
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

	@Override
	public String getTipoDePuesto() {
		return "junior";
	}
}
