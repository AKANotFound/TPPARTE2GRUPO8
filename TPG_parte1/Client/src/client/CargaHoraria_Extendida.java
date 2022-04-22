package client;

public class CargaHoraria_Extendida extends CargaHoraria {

	@Override
	public double comparaCon(CargaHoraria c) {
		
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
}
