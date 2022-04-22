package client;

public class CargaHoraria extends Matriz{
	
	public CargaHoraria() {
		
		System.out.println("si te cambio");
		mat[0][0] = 1;
		mat[0][1] = -0.5;
		mat[0][2] = -1;
		mat[1][0] = -0.5;
		mat[1][1] = 1;
		mat[1][2] = -0.5;
		mat[2][0] = -1;
		mat[2][1] = 1;
		mat[2][2] = -0.5;
	}
}
