package tablas;

public class Remuneracion_EntreV1V2 extends Remuneracion {

	@Override
	public double comparaCon(Remuneracion r) {
		return r.comparaConEntreV1V2();
	}

	@Override
	public double comparaConHastaV1() {
		return 1;
	}

	@Override
	public double comparaConEntreV1V2() {
		return 1;
	}

	@Override
	public double comparaConMasV2() {
		return -0.5;
	}
}
