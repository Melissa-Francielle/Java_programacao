package Exercicio_9;

public class Main {
	public static void main (String [] args) {
		Programador prog = new Programador();
		
		prog.setHoras(5.0);
		prog.setSalario(120.0);
		System.out.println("Salario: "+prog.calculaSalario());
		System.out.println("Calculo do salario: "+prog.calculaSalario(prog.getHoras(), 2, 5.0));
		
	}
}
