package tablas;

public class ExperienciaPrevia_Media implements IExperienciaPrevia {

	@Override
	public double comparaCon(IExperienciaPrevia e) {
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
	
	@Override
	public String toString() {
		return " media";
	}
}
