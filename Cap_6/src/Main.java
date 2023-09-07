
public class Main {
	public static void main(String [] args) {
	Estatico estatic = new Estatico ();
	Estatico estatic2 = new Estatico();
	estatic.setX(10);
	estatic.setY(10);
	System.out.println("SOMA: "+estatic.calcula());

	estatic2.setX(20);
	estatic2.setY(1);
	System.out.println("soma: "+estatic2.calcula());
	
	estatic.setX(10);
	System.out.println("SOMA: "+estatic.calcula());
	
	}
	
}

