package tablas;

public class ExperienciaPrevia_Media extends ExperienciaPrevia {

	@Override
	public double comparaCon(ExperienciaPrevia e) {
		return e.comparaConMedia();
	}

	@Override
	public double comparaConNada() {
		return -0.5;
	}

	@Override
	public double comparaConMedia() {
		return 1;
	}

	@Override
	public double comparaConMucha() {
		return 1.5;
	}
}
