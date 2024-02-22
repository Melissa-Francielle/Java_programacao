package ex2;

public class MainMedia {
	public static void main(String[] args) {
		Media m = new Media();
		
		m.setMed(3);
		
		CalculoMed.Media(m.getMed(), 7, 8, 9);
		
		CalculoMed.Media(m.getMed(), 5, 4, 6);
	}
}

