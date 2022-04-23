package tablas;

public abstract class Locacion{
	
	public abstract double comparaCon (Locacion locacion);
	public abstract double comparaConPresencial();
	public abstract double comparaConHomeOffice();
	public abstract double comparaConIndistinto();
}
