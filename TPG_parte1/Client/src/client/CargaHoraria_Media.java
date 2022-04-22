package client;

public class CargaHoraria_Media extends CargaHoraria {

	@Override
	public double comparaCon(CargaHoraria c) {
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
