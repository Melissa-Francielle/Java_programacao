package ex5;

public class Pesquisa extends Projeto{
	private String areaCNPQ;
	private Double orcamento;
	
	public Pesquisa() {}
	
	public Pesquisa(String areaCNPQ, Double orcamento, Integer numero, String tituloProjeto) {
		super(numero, tituloProjeto);
		this.areaCNPQ = areaCNPQ;
		this.orcamento = orcamento;
	}
	
	public String getArea() {
		return areaCNPQ;
	}
	
	public void setArea(String areaCNPQ) {
		this.areaCNPQ = areaCNPQ;
	}
	
	public Double getOrcamento() {
		return orcamento;
	}
	
	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}
	@Override 
	public String toString() {
		return "Numero:"+numero +"\nTitulo do Projeto: "+tituloProjeto+ "\nOrcamento: " + orcamento+"\nCNPQ: "+areaCNPQ;
	}
}
