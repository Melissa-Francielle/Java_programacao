package Ex_9;

public class Varargs {
	public int soma = 0;
	public int produto = 0;
	private String a;
	
	public Varargs() {
		
	}
	
	public Varargs(String a) {
		this.a = a;
	}
	
	public void setA(String a) {
		this.a = a;
	}
	
	public String getA() {
		return a;
	}
	int contagem(String a, int...v) {
		int total = 0;
		
		if(getA() == "SOM") {
			for(int i = 0; i < v.length;i++) {
				total += v[i];
				
			}
		}
		if(getA() == "MULT") {
			total = 1;
			for (int i =0; i < v.length; i++) {
				total *= v[i];
			}
		}
		return total;
	}
}
