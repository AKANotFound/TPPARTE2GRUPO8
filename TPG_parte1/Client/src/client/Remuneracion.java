package client;

public class Remuneracion extends Matriz {
    private double V2;
    private double V1;
    
    public Remuneracion() {
		
		
		mat[0][0] = 1;
		mat[0][1] = -0.5;
		mat[0][2] = -1;
		mat[1][0] = 1;
		mat[1][1] = 1;
		mat[1][2] = -0.5;
		mat[2][0] = 1;
		mat[2][1] = 1;
		mat[2][2] = 1;
	}
    
}
