package tablas;

public class RangoEtario_MasDe50 implements IRangoEtario {

	public RangoEtario_MasDe50() {}
	
	@Override
	public double comparaCon(IRangoEtario r) {
		return r.comparaConMasDe50();
	}

	@Override
	public double comparaConMenosDe40() {
		return -1;
	}

	@Override
	public double comparaCon40a50() {
		return 1;
	}

	@Override
	public double comparaConMasDe50() {
		return -0.5;
	}
	@Override
	public String toString() {
		return " m�s de 50";
	}
}
