package entidades;

public class Rubro_Salud implements IRubro {
	
	@Override
	public String toString() {
		return "Salud";
	}
	
    @Override
    public double calculaComisionPersonaFisica(double sueldoOfrecido) {
        return sueldoOfrecido * 0.6;
    }

    @Override
    public double calculaComisionPersonaJuridica(double sueldoOfrecido) {
        return sueldoOfrecido * 0.8;
    }
}
