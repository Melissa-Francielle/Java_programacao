package Exercicio_5;

public class Main {
	public static void main(String [] args) {
		Dupla dupla = new Dupla();
		
		dupla.getAl().setMat(2250113);
		dupla.getAl2().setMat(500555);
		
		System.out.println("\nMatricula 1: "+dupla.getAl().getMat()+"\nMatricula 2: "+dupla.getAl2().getMat());
		
		dupla.getAl().setNome("Melissa");
		dupla.getAl2().setNome("Hand");
		dupla.mostrarAlunos();
		dupla.getAl().setNome("Lis");
		dupla.getAl2().setNome("Paulo");
		dupla.mostrarAlunos();
		dupla.getAl().setNome("Kan");
		dupla.getAl2().setNome("Jimin");
		dupla.mostrarAlunos();
	}
}
