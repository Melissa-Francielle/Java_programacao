package Exercicio_7;

public class Carro {
	private int velocidade;
	
	public Carro() {
		
	}
	
	public Carro(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void setVel(int vel) {
		this.velocidade = vel;
	}

	public int getVel() {
		return velocidade;
	}
	
	void acelerar() {
		setVel(getVel()+1);
	}
	
	void frear() {
		setVel(getVel()-1);
	}
}
