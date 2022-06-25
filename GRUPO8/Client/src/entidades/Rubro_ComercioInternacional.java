package entidades;

public class Rubro_ComercioInternacional implements IRubro {
	
	//private static Rubro_ComercioInternacional instancia = null;
	
	public Rubro_ComercioInternacional() {}
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (this.getClass() == obj.getClass())
			res = true;
		return res;
	}

	/*public static Rubro_ComercioInternacional getInstancia() {
		if(instancia == null)
			instancia = new Rubro_ComercioInternacional();
		return instancia;
	}*/

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
