package util;

import java.util.Random;

public class Util {
	private static Random r = new Random();
	
	public static void espera (int tiempo){
		try {
			Thread.sleep(r.nextInt(tiempo));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
