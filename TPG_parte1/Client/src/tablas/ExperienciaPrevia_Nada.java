package tablas;

public class ExperienciaPrevia_Nada implements IExperienciaPrevia {

	@Override
	public double comparaCon(IExperienciaPrevia e) {
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
	
	@Override
	public String toString() {
		return " nada";
	}	
}
