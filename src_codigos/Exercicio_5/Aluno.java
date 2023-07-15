package Exercicio_5;

public class Aluno {
	private int matricula;
	private String nome;
	
	public Aluno() {
		
	}
	
	public Aluno (int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public void setMat(int mat) {
		this.matricula = mat;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public int getMat() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	
}
