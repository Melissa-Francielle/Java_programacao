package ex2;

public class Circulo {
	private double raio;
	private Ponto ponto;
	
	public Circulo() {
		Ponto ponto = new Ponto(0,0);
		raio = 1;
	}
	
	public Circulo(Ponto ponto, double raio) {
		this.ponto = ponto;
		this.raio = raio;
	}
	
	public Ponto getP() {
		return ponto;
	}
	
	public void setP(Ponto ponto) {
		this.ponto = ponto;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio=raio;
	}

	public void imprimindoPonto() {
		System.out.println("X Circulo: "+ponto.getX()+"\nY Circulo:"+ponto.getY());
	}
}
