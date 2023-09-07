package Exercicio_8;

public class Livro {
	private String titulo;
	private int pag;
	private String editora;
	private Autor aut;
	
	
	
	public Livro () {
		
	}
	
	public Livro(String titulo, int pag, String editora, Autor aut) {
		this.titulo = titulo;
		this.pag = pag;
		this.editora = editora;
		this.aut = aut;
	}
	
	public void setT(String titulo) {
		this.titulo = titulo;
	}
	
	public void setPag(int pag) {
		this.pag = pag;
	}
	
	public void setEdit(String editora) {
		this.editora = editora;
	}
	
	public void setAut(Autor aut) {
		this.aut = aut;
	}
	
	public String getT() {
		return titulo;
	}
	
	public int getPag() {
		return pag;
	}
	
	public String getEdit() {
		return editora;
	}
	
	public Autor getAutor() {
		return aut;
	}
}
