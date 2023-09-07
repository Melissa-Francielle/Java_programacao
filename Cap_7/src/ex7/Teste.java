package ex7;

public class Teste {
	public static void main(String[] args) {
		//Alpha a = new Gamma();
		//a.x();
		Gamma a = new Gamma();
		a.x();
		System.out.println("\n");
		a.m();
		
		//O código não compila, pois, o objeto está sendo criado
		//Pela classe Alpha, essa classe tem somente um método de impressão 
		//Com um nome M e não X, logo por não fazer parte da classe não tem como ser chamada.
		//Para fazer funcionar deveria ter criado um objeto Gamma e assim seria possível chamar tanto o metodo M quanto X.
	}
	
}
