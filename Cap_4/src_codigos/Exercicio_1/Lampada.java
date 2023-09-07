package Exercicio_1;

public class Lampada {
	private boolean acesa;
	
	
	//construtor 
	public Lampada() {
		
	}
	
	public Lampada(boolean acesa) {
		this.acesa = acesa;
	}
	
	public void setAcende(boolean a) {
		this.acesa = a;
	}
	
	public boolean getAcenda() {
		return acesa;
	}
	
	boolean acende () {
		return true;
	}
	
	boolean apaga() {
		return false;
	}
	String acender() {
		if(getAcenda() == true) {
			return "Acesa";
		}
		if(getAcenda() == false) {
			return "Apagada";
		}
		return null;
	}
}
