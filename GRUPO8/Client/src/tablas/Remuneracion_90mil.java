package tablas;

public class Remuneracion_90mil implements IRemuneracion {

	public Remuneracion_90mil() {}
	
	@Override
	public double comparaCon(IRemuneracion r) {
		return r.comparaConMasV2();
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
		return 1;
	}

	@Override
	public double getRemuneracion() {
		return 90000;
	}
}
