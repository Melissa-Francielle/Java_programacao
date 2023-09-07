package ex2;

public class Pixel extends Ponto {
	private String cor;
	
	public Pixel() {
		cor = "preta";
	}
	
	public Pixel(int x, int y) {
		super(x,y);
		cor = "preta";
	}
	
	public Pixel(int x, int y, String cor) {
		super(x,y);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor  = cor;
	}
	
	
}
