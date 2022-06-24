package tablas;

public interface ILocacion{
	
	public abstract double comparaCon (ILocacion locacion);
	public abstract double comparaConPresencial();
	public abstract double comparaConHomeOffice();
	public abstract double comparaConIndistinto();
}
