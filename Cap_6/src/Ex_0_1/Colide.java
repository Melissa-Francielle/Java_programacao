package Ex_0_1;

public class Colide {
	public static boolean colidiu (RoboNew android, RoboNew android2) {
		if(android.getPonto().getX() == android2.getPonto().getY() && android.getPonto().getY() == android2.getPonto().getX()) {
				return true;
			}	
		return false;
	}
}
