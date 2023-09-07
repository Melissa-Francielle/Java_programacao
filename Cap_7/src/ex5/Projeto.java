package ex5;

public abstract class Projeto {
	protected Integer numero;
	protected String tituloProjeto;
	
	public Projeto() {}
	
	public Projeto(Integer numero, String tituloProjeto) {
		this.numero = numero;
		this.tituloProjeto = tituloProjeto;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero= numero;
	}
	
	public String getTitle() {
		return tituloProjeto;
	}
	
	public void setTitle(String tituloProjeto) {
		this.tituloProjeto = tituloProjeto;
	}
	
}
