package Ex_4;

public class Circulo extends Ponto{
	private double raio;
	
	//construtor
	public Circulo () {
		super(0,0);
		raio = 1;
	}
	
	public Circulo (int x, int y, double raio) {
		super(x, y);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void info() {
		System.out.println("Raio:"+this.getRaio()+"\nX e Y: "+this.getX()+" "+this.getY());
	}
}
