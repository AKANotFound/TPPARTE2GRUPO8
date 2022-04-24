package tablas;

public class CargaHoraria_Media implements ICargaHoraria {

	@Override
	public double comparaCon(ICargaHoraria c) {
		return c.comparaConMedia();
	}

	@Override
	public double comparaConMedia() {
		return 1;
	}

	@Override
	public double comparaConCompleta() {
		return -0.5;
	}

	@Override
	public double comparaConExtendida() {
		return -1;
	}

}
