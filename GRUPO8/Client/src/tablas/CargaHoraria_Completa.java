package tablas;

public class CargaHoraria_Completa implements ICargaHoraria {
	
	public CargaHoraria_Completa() {
		
	}
	
	@Override
	public double comparaCon(ICargaHoraria c) {
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

	@Override
	public String toString() {
		return " completa";
	}
	
}
