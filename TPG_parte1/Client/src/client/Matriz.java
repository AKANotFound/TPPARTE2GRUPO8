package client;


public class Matriz {
	
	protected double[][] mat = new double[3][3];
	int i; 	// empleador
	int j;	// empleado
	
	public Matriz(double[][] mat, int i, int j) {
		super();
		this.mat = mat;
		this.i = i;
		this.j = j;
	}

	protected double resultadoMat() {
		return mat[i][j];	
	}
	
}
