package Ex_0_1;

public class RoboNew {
	private String nome;
	private PontoNew ponto;
	
	//construtor
	
	public RoboNew() {
		
	}
	
	public RoboNew(PontoNew p) {
		p = new PontoNew();
	}
	public RoboNew(String nome, PontoNew ponto) {
		this.nome = nome;
		this.ponto = ponto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPonto(PontoNew ponto) {
		this.ponto = ponto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public PontoNew getPonto() {
		return ponto;
	}
	
	void direita() {
		ponto.setX(ponto.getX()+1);
	}
	
	void esquerda() {
		ponto.setX(ponto.getX()-1);;
	}
	
	void cima () {
		ponto.setY(ponto.getY()+1);
	}
	
	void baixo () {
		ponto.setY(ponto.getY()-1);
	}

	public void posicao (){
        System.out.println(ponto.getX()+", "+ponto.getY());
    }
	
	void telestransporte(int x, int y) {
		ponto.setX(y);
		ponto.setY(x);
	}
	
}

