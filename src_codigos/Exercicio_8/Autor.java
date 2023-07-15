package Exercicio_8;

public class Autor {
	private String nome;
	private String gen;
	
	
	public Autor () {

	}
	
	public Autor(String nome, String gen) {
		this.nome = nome;
		this.gen = gen;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setGen(String gen) {
		this.gen = gen;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getGen() {
		return gen;
	}
	
}