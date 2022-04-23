package tablas;

public class Remuneracion_HastaV1 extends Remuneracion {

	@Override
	public double comparaCon(Remuneracion r) {
		return r.comparaConHastaV1();
	}

	@Override
	public double comparaConHastaV1() {
		return 1;
	}

	@Override
	public double comparaConEntreV1V2() {
		return -0.5;
	}

	@Override
	public double comparaConMasV2() {
		return -1;
	}
}
