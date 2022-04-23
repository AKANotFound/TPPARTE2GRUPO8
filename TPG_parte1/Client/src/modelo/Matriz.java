package modelo;


public class Matriz {
	
	protected double[][] mat = new double[3][3];
	
	protected double resultadoMat(int requisitoEmpleador,int requisitoEmpleado) {
		return mat[requisitoEmpleador][requisitoEmpleado];	
	}
		
}
