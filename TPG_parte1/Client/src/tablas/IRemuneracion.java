package tablas;

public interface IRemuneracion {
	
	public abstract double comparaCon(IRemuneracion r);
	public abstract double comparaConHastaV1();
	public abstract double comparaConEntreV1V2();
	public abstract double comparaConMasV2();
}