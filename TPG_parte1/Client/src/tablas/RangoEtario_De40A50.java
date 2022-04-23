package tablas;

public class RangoEtario_De40A50 extends RangoEtario {

	@Override
	public double comparaCon(RangoEtario r) {
		return r.comparaCon40a50();
	}

	@Override
	public double comparaConMenosDe40() {
		return -0.5;
	}

	@Override
	public double comparaCon40a50() {
		return 1;
	}

	@Override
	public double comparaConMasDe50() {
		return -0.5;
	}
}
