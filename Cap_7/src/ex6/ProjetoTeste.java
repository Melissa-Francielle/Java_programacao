package ex6;

public abstract class ProjetoTeste {
	private Integer numero;
	private String tituloProjeto;
	
	public ProjetoTeste() {}
	
	public ProjetoTeste(Integer numero, String tituloProjeto) {
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
