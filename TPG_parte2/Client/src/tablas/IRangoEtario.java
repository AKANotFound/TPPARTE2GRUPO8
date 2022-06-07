package tablas;

public interface IRangoEtario {
	
	public abstract double comparaCon (IRangoEtario r);
	public abstract double comparaConMenosDe40();
	public abstract double comparaCon40a50();
	public abstract double comparaConMasDe50();
}
