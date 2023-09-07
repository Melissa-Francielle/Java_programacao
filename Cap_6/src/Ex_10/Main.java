package Ex_10;

public class Main {
	public static void main(String [] args) {
		Cachorro toto = new Cachorro();
		
		toto.setNome("Shelby");
		toto.setRaca("Blue Heeler");
		
		System.out.println("\nNome do cachorro: "+toto.getNome()+"\nRaca: "+toto.getRaca());
		
		toto.latir();
		toto.latirRepetidos(0);
		toto.latirRepetidos(101);
		toto.latirRepetidos(5);
		
	}
}
