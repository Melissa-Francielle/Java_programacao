
public class Estatico {
	private int x;
	private static int y;
	
	public Estatico() {
		
	}
	
	public Estatico (int x) {
		y = 10;
		this.x = x;
	}
	
	public Estatico (int x, int y) {
		this.y = y;
		this.x = x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	int calcula() {
		int soma = 0;
		soma = getX() + getY();
		return soma;
	}
}
