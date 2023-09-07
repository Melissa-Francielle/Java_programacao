package Ex_10;

public class Cachorro {
	private String raca;
	private String nome;
	
	public Cachorro () {
		
	}
	
	public Cachorro(String nome) {
		raca = "indeterminada";
		this.nome  = nome;
	}
	
	public Cachorro(String nome, String raca) {
		this.raca  = raca;
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void latir() {
		System.out.println("\nAUAU");
	}
	
	public void latirRepetidos(int l) {
		if(l <= 0) {
			System.out.println("\nBUGOU");
		}
		if(l > 100) {
			System.out.println("\nParamentro invalido");
		}
		else {
			for(int i = 0; i < l; i++) {
				System.out.println("AUAU");
			}
		}
	}
}

