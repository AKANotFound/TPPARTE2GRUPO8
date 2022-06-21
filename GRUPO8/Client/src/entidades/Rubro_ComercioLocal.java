package entidades;

public class Rubro_ComercioLocal implements IRubro {
	
	private static Rubro_ComercioLocal instancia = null;
	
	public Rubro_ComercioLocal() {}
	
	public static Rubro_ComercioLocal getInstancia() {
		if(instancia == null)
			instancia = new Rubro_ComercioLocal();
		return instancia;
	}
	
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
