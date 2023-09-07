package Exercicio_4;

public class Linha {
	private int comprimento;
	
	public Linha () { }
	
	public Linha(int comprimento, int length) {
		this.comprimento = comprimento;
	}

	public void setComp(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getComp() {
		return comprimento;
	}
	
	String desenhar() {
		String traço = "_";
		return ""+traço+traço+traço+traço;
	}
}
