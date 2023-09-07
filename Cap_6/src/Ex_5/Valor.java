package Ex_5;

public class Valor {
	private double num;
	private double num2;
	private int num3;

	public Valor () {
		
	}
	
	public Valor (double num, double num2, int num3) {
		this.num = num;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void setNum(double num) {
		this.num = num;
	}
	
	public double getNum() {
		return num;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public int getNum3() {
		return num3;
	}

}
