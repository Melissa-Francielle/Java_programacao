package Ex_8;


public class Main{
	public static void main (String [] args) {
		System.out.println(QuantidadeObjetos.count);
		
		QuantidadeObjetos ob = new QuantidadeObjetos();
		
		System.out.println(QuantidadeObjetos.count);
		
		QuantidadeObjetos ob2 = new QuantidadeObjetos();
		QuantidadeObjetos ob3 = new QuantidadeObjetos();
		System.out.println(QuantidadeObjetos.count);
	}
}