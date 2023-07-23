package Ex_6;

public abstract class Funcionario {
	private int codigo;
	private String nome;
	
	//construtor
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome  = nome;
	}
	
	public int getCod() {
		return codigo;
	}
	
	public void setCod(int codigo) {
		this.codigo = codigo;
	}
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public abstract double calcularSalario();

	
}
