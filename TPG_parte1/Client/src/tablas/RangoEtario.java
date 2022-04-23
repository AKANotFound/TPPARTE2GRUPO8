package tablas;

import modelo.Matriz;

public abstract class RangoEtario extends Matriz {
	
	public abstract double comparaCon (RangoEtario r);
	public abstract double comparaConMenosDe40();
	public abstract double comparaCon40a50();
	public abstract double comparaConMasDe50();
	
}
