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
    
}
