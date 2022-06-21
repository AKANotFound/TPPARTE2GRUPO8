package entidades;

public class Rubro_Salud implements IRubro {
	
	//private static Rubro_Salud instancia = null;
	
	public Rubro_Salud() {}
	
	/*public static Rubro_Salud getInstancia() {
		if(instancia == null)
			instancia = new Rubro_Salud();
		return instancia;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (this.getClass() == obj.getClass())
			res = true;
		return res;
	}
	
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
