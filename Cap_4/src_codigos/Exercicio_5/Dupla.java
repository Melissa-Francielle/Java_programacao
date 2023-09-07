package Exercicio_5;

public class Dupla {
	private Aluno al;
	private Aluno al2;
	
	public Dupla() { 
		al = new Aluno();
		al2 = new Aluno();
	}
	
	public Dupla(Aluno al, Aluno al2) {
		this.al = al;
		this.al2 = al2;
	}
	
	public void setAl(Aluno al) {
		this.al = al;
	}
	
	public void setAl2(Aluno al2) {
		this.al2 = al2;
	}
	
	public Aluno getAl() {
		return al;
	}
	
	public Aluno getAl2() {
		return al2;
	}
	
	void mostrarAlunos() {
		System.out.println("Aluno: "+al.getNome()+" "+"Aluno2: "+al2.getNome());
	}
}
