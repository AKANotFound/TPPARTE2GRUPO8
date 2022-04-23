package tablas;

public class EstudiosCursados_Terciario extends EstudiosCursados {

	@Override
	public double comparaCon(EstudiosCursados estudios) {
		return estudios.comparaConTerciario();
	}

	@Override
	public double comparaConPrimario() {
		return -2;
	}

	@Override
	public double comparaConSecundario() {
		return -1.5;
	}

	@Override
	public double comparaConTerciario() {
		return 1;
	}
}
