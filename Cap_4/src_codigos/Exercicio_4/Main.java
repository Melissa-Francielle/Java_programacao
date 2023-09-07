package Exercicio_4;

public class Main {
	public static void main(String [] args) {
		Linha l = new Linha ();
		
		l.setComp(10);
			
		for(int i = 0; i < l.getComp();i++) {
			System.out.println(l.desenhar());
		}
	}
}
