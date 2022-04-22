package client;

public class FormularioDeBusqueda {
    private Locacion locacion;
    private Remuneracion remuneracion;
    private CargaHoraria cargaHoraria;
    private TipoDePuesto tipoDePuesto;
    private RangoEtario rangoEtario;
    private ExperienciaPrevia experienciaPrevia;
    private EstudiosCursados estudiosCursados;
    
	public FormularioDeBusqueda(Locacion locacion, Remuneracion remuneracion, CargaHoraria cargaHoraria,
			TipoDePuesto tipoDePuesto, RangoEtario rangoEtario, ExperienciaPrevia experienciaPrevia,
			EstudiosCursados estudiosCursados) 
	{
		this.locacion = locacion;
		this.remuneracion = remuneracion;
		this.cargaHoraria = cargaHoraria;
		this.tipoDePuesto = tipoDePuesto;
		this.rangoEtario = rangoEtario;
		this.experienciaPrevia = experienciaPrevia;
		this.estudiosCursados = estudiosCursados;
	}
	
	
    	public Locacion getLocacion() {
		return locacion;
	}

	public Remuneracion getRemuneracion() {
		return remuneracion;
	}

	public CargaHoraria getCargaHoraria() {
		return cargaHoraria;
	}

	public TipoDePuesto getTipoDePuesto() {
		return tipoDePuesto;
	}

	public RangoEtario getRangoEtario() {
		return rangoEtario;
	}

	public ExperienciaPrevia getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public EstudiosCursados getEstudiosCursados() {
		return estudiosCursados;
	}
    
}
