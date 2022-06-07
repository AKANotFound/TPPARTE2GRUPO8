package tablas;

public class ExperienciaPrevia_Mucha implements IExperienciaPrevia {

	@Override
	public double comparaCon(IExperienciaPrevia e) {
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
	@Override
	public String toString() {
		return " mucha";
	}
}
