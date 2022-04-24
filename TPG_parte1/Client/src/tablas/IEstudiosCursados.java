package tablas;

public interface IEstudiosCursados  {
	
	public abstract double comparaCon (IEstudiosCursados estudios);
	public abstract double comparaConPrimario();
	public abstract double comparaConSecundario();
	public abstract double comparaConTerciario();
}
