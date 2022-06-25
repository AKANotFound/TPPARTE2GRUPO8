package entidades;

import tablas.ICargaHoraria;
import tablas.IEstudiosCursados;
import tablas.IExperienciaPrevia;
import tablas.ILocacion;
import tablas.IRangoEtario;
import tablas.IRemuneracion;
import tablas.ITipoDePuesto;

public class FormularioDeBusqueda {
    private ILocacion locacion;
    private IRemuneracion remuneracion;
    private ICargaHoraria cargaHoraria;
    private ITipoDePuesto tipoDePuesto;
    private IRangoEtario rangoEtario;
    private IExperienciaPrevia experienciaPrevia;
    private IEstudiosCursados estudiosCursados;
    
    public FormularioDeBusqueda() {
    	
    }
    
	public FormularioDeBusqueda(ILocacion locacion, IRemuneracion remuneracion, ICargaHoraria cargaHoraria,
			ITipoDePuesto tipoDePuesto, IRangoEtario rangoEtario, IExperienciaPrevia experienciaPrevia,
			IEstudiosCursados estudiosCursados) 
	{
		this.locacion = locacion;
		this.remuneracion = remuneracion;
		this.cargaHoraria = cargaHoraria;
		this.tipoDePuesto = tipoDePuesto;
		this.rangoEtario = rangoEtario;
		this.experienciaPrevia = experienciaPrevia;
		this.estudiosCursados = estudiosCursados;
	}
	 
    public ILocacion getLocacion() {
		return locacion;
	}

	public IRemuneracion getRemuneracion() {
		return remuneracion;
	}

	public ICargaHoraria getCargaHoraria() {
		return cargaHoraria;
	}

	public ITipoDePuesto getTipoDePuesto() {
		return tipoDePuesto;
	}

	public IRangoEtario getRangoEtario() {
		return rangoEtario;
	}

	public IExperienciaPrevia getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public IEstudiosCursados getEstudiosCursados() {
		return estudiosCursados;
	}
	
	public void setLocacion(ILocacion locacion) {
		this.locacion = locacion;
	}

	public void setRemuneracion(IRemuneracion remuneracion) {
		this.remuneracion = remuneracion;
	}

	public void setCargaHoraria(ICargaHoraria cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setTipoDePuesto(ITipoDePuesto tipoDePuesto) {
		this.tipoDePuesto = tipoDePuesto;
	}

	public void setRangoEtario(IRangoEtario rangoEtario) {
		this.rangoEtario = rangoEtario;
	}

	public void setExperienciaPrevia(IExperienciaPrevia experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public void setEstudiosCursados(IEstudiosCursados estudiosCursados) {
		this.estudiosCursados = estudiosCursados;
	}

	@Override
	public String toString() {
		return " [locacion = " + locacion.toString() + ", remuneracion = " + remuneracion.getRemuneracion() + ", carga horaria = "
				+ cargaHoraria.toString() + ", tipoDePuesto = " + tipoDePuesto.toString() + ", rango etario = " + rangoEtario.toString()
				+ ", experiencia previa = " + experienciaPrevia.toString() + ", estudios cursados = " + estudiosCursados.toString() + "]";
	}
	
    
}
