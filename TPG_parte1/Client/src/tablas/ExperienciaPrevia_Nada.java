package tablas;

public class ExperienciaPrevia_Nada extends ExperienciaPrevia {

	@Override
	public double comparaCon(ExperienciaPrevia e) {
		return e.comparaConNada();
	}

	@Override
	public double comparaConNada() {
		return 1;
	}

	@Override
	public double comparaConMedia() {
		return 1.5;
	}

	@Override
	public double comparaConMucha() {
		return 2;
	}
}
