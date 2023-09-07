package Exercicio_1;

public class Main {
	public static void main(String [] args) {
		
	Lampada p = new Lampada ();
		
		System.out.println(p.acende());
		p.setAcende(true);
		
		System.out.println("A lampada esta: "+p.acender());
		
		System.out.println(p.apaga());
		p.setAcende(false);
		System.out.println("A lampada esta: "+p.acender());
	}
}
