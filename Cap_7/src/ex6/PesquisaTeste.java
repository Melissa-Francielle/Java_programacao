package ex6;

public class PesquisaTeste extends ProjetoTeste{
		private String areaCNPQ;
		private Double orcamento;
		
		public PesquisaTeste() {}
		
		public PesquisaTeste(String areaCNPQ, Double orcamento, Integer numero, String tituloProjeto) {
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
}

