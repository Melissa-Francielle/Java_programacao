package Exercicio_6;

public class Main {
	public static void main(String [] args) {
		Programador prog = new Programador ();
		
		prog.setHoras(15.0);
		prog.setValor(10.0);
		prog.setSalario(120.0);
		
		System.out.println("Horas trabalhadas pelo programador: "+prog.calcularSalario(prog.getHoras(), prog.getValor(), prog.getSalario()));
	}
}
