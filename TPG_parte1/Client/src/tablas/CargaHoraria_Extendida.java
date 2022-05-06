package tablas;

public class CargaHoraria_Extendida implements ICargaHoraria {

	@Override
	public double comparaCon(ICargaHoraria c) {
		
		return c.comparaConExtendida();
	}
	@Override
	public double comparaConMedia() {
		return -1;
	}

	@Override
	public double comparaConCompleta() {
		return 1;
	}

	@Override
	public double comparaConExtendida() {
		return -0.5; 
	}
	@Override
	public String toString() {
		return " extendida";
	}
}
