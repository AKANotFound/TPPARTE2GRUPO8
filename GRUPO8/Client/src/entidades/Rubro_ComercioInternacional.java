package entidades;

public class Rubro_ComercioInternacional implements IRubro {

	@Override
	public String toString() {
		return "Comercio Internacional";
	}

    @Override
    public double calculaComisionPersonaFisica(double sueldoOfrecido) {
        return sueldoOfrecido * 0.8;
    }

    @Override
    public double calculaComisionPersonaJuridica(double sueldoOfrecido) {
        return sueldoOfrecido;
    }
}
