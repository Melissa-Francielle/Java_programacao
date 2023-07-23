package Ex_3;

public class Pixel extends Ponto {
	private String cor;
	
	public Pixel() {
		super(0, 0);
		this.cor = "preto";
	}
	
	public Pixel (int x, int y) {
		super(x, y);
		this.cor = "preto";
	}
	
	public Pixel(int x, int y, String cor) {
		super(x, y);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void informacoes() {
		
		System.out.println("X:"+this.getX()+"\nY: "+this.getY()+"\nCor: "+this.getCor());
		
	}
	
}
