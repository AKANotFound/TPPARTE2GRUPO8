package tablas;

public class ExperienciaPrevia_Mucha extends ExperienciaPrevia {

	@Override
	public double comparaCon(ExperienciaPrevia e) {
		return e.comparaConMucha();
	}

	@Override
	public double comparaConNada() {
		return -2;
	}

	@Override
	public double comparaConMedia() {
		return -1.5;
	}

	@Override
	public double comparaConMucha() {
		return 1;
	}
}
