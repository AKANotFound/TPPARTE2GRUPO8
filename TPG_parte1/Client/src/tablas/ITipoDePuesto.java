package tablas;

public interface ITipoDePuesto {
	
	public abstract double comparaCon (ITipoDePuesto t);
	public abstract double comparaConJunior();
	public abstract double comparaConSenior();
	public abstract double comparaConManagment();
}
