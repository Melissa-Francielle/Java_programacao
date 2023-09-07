package ex5;

public class Extensao extends Projeto {
	private String publico;
	private String linha;
	
	public Extensao() {}
	
	public Extensao (String publico, String linha, Integer numero, String tituloProjeto) {
		super(numero, tituloProjeto);
		this.publico = publico;
		this.linha = linha;
	}
	
	public String getPub() {  
		return publico;
	}
	
	public void setPub(String publico) {
		this.publico = publico;
	}
	
	public String getLinha() {
		return linha;
	}
	
	public void setLinha(String linha) {
		this.linha = linha;
	}
	@Override 
	public String toString() {
		return "\nNumero:"+numero +"\nTitulo do Projeto: "+tituloProjeto+ "\nLinha: " + linha+"\nPublico: "+publico;
	}
	
}
