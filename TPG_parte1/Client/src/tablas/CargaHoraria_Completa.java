package tablas;

public class CargaHoraria_Completa extends CargaHoraria {

	@Override
	public double comparaCon(CargaHoraria c) {
		return c.comparaConCompleta();
	}

	@Override
	public double comparaConMedia() {
		return -0.5;
	}

	@Override
	public double comparaConCompleta() {
		return 1;
	}

	@Override
	public double comparaConExtendida() {
		return -0.5;
	}
}
