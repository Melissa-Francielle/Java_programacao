package Exercicio_8;

public class Main {
	public static void main (String [] args) {
		Livro liv = new Livro ();
		Autor aut = new Autor();
		
		aut.setGen("Fantasia");
		aut.setNome("George Martin");
		
		liv.setEdit("LeYa");
		liv.setPag(1000);
		liv.setT("Game of thrones");
		liv.setAut(aut);
		
		System.out.println("\nLivro: "+liv.getT()+"\nEditora: "+liv.getEdit()+"\nQuantidade de paginas: "+liv.getPag()+"\nAutor: "
				+liv.getAutor().getNome()+"\nNGenero: "+liv.getAutor().getGen());
		
	}
}
