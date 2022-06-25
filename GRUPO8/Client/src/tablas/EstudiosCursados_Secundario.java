package tablas;

public class EstudiosCursados_Secundario implements IEstudiosCursados {

	public EstudiosCursados_Secundario() {
		
	}
	
	@Override
	public double comparaCon(IEstudiosCursados estudios) {
		return estudios.comparaConSecundario();
	}

	@Override
	public double comparaConPrimario() {
		return -0.5;
	}

	@Override
	public double comparaConSecundario() {
		return 1;
	}

	@Override
	public double comparaConTerciario() {
		return 1.5;
	}
	@Override
	public String toString() {
		return " secundario";
	}
}
