package entidades;

public class Rubro_ComercioLocal implements IRubro {
	
	@Override
	public String toString() {
		return "Comercio Local";
	}
	
    @Override
    public double calculaComisionPersonaFisica(double sueldoOfrecido) {
        return sueldoOfrecido * 0.7;
    }

    @Override
    public double calculaComisionPersonaJuridica(double sueldoOfrecido) {
        return sueldoOfrecido * 0.9;
    }
}
