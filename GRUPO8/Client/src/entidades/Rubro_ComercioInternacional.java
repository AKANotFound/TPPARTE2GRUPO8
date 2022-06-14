package entidades;

public class Rubro_ComercioInternacional implements IRubro {
	
	private static Rubro_ComercioInternacional instancia = null;
	
	private Rubro_ComercioInternacional() {}
	
	public static Rubro_ComercioInternacional getInstancia() {
		if(instancia == null)
			instancia = new Rubro_ComercioInternacional();
		return instancia;
	}

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
