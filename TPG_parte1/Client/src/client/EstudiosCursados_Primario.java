package client;

public class EstudiosCursados_Primario extends EstudiosCursados {

	@Override
	public double comparaCon(EstudiosCursados estudios) {
		return estudios.comparaConPrimario();
	}

	@Override
	public double comparaConPrimario() {
		return 1;
	}

	@Override
	public double comparaConSecundario() {
		return 1.5;
	}

	@Override
	public double comparaConTerciario() {
		return 2;
	}
}
