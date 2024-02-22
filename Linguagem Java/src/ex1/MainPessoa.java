package ex1;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setAno(3);
		p.setMeses(2);
		p.setDia(15);
		
		System.out.println("Soma: " + p.calendario());
		
		p.setAno(21);
		p.setMeses(5);
		p.setDia(174);
		
		System.out.println("Soma: " + p.calendario());
		

		p.setAno(47);
		p.setMeses(3);
		p.setDia(143);
		
		System.out.println("Soma: " + p.calendario());
		
	}
}
