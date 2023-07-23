package Ex_9;

public class Main {
	public static void main(String [] args) {
		Varargs van = new Varargs();
		
		van.setA("SOM");
		System.out.println("SOMA = "+van.contagem(van.getA(), 1,2,3));
		van.setA("MULT");
		System.out.println("MULT = "+van.contagem(van.getA(), 5,8));
	}
}
