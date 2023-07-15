package Exercicio_2;

public class Caixa {
	private double largura;
	private double altura;
	private double comprimento;
	
	//construtor vazio 
	public Caixa() {
		
	}
	
	public Caixa(double largura, double altura, double comprimento) {
		this.largura = largura;
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public void setLarg(double l) {
		this.largura = l;
	}
	
	public double getLarg() {
		return largura;
	}
	
	public void setAlt(double alt) {
		this.altura = alt;
	}
	
	public double getAlt() {
		return altura;
	}
	
	public void setCp(double cp) {
		this.comprimento = cp;
	}
	
	public double getCp() {
		return comprimento;
	}
	
	double calcularVolume() {
		return getLarg() * getAlt() * getCp();
		
	}

}