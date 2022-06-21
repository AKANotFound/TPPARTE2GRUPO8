package tablas;

public class EstudiosCursados_Primario implements IEstudiosCursados {

	public EstudiosCursados_Primario() {
		
	}
	
	@Override
	public double comparaCon(IEstudiosCursados estudios) {
		return estudios.comparaConPrimario();
	}

	@Override
	public double comparaConPrimario() {
		return 1;
	}

	@Override
	public double comparaConSecundario() {
		return 1.5;
	}

	@Override
	public double comparaConTerciario() {
		return 2;
	}
	@Override
	public String toString() {
		return " primario";
	}
}
