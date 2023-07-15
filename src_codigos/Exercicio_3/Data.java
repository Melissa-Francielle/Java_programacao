package Exercicio_3;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	//construtor 
	public Data() {
		
	}
	
	public Data(int ano) {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1;
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void setDia(int d) {
		this.dia = d;
	}
	
	public void setMes(int m) {
		this.mes = m;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	 
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	String formatarData(String separador) {
		String retorna_separador = ""+dia+separador+mes+separador+ano;
		return retorna_separador;
	}
	
	
}
