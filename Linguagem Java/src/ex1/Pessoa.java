package ex1;

public class Pessoa {
	private int dia;
	private int meses;
	private int ano;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int dia, int meses, int ano) {
		this.dia = dia;
		this.meses = meses;
		this.ano = ano;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setMeses(int meses) {
		this.meses = meses;
	}
	
	public int getMeses() {
		return meses;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public int calendario() {
		int a;
		int m;
		int d;
		a =(this.getAno()*365);
		m = (this.getMeses()*30);
		d = this.getDia();
		int resultado = a+m+d;
		return resultado; 
	}
}
