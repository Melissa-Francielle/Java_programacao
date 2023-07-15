package Exercicio_9;

public class Programador {
	private double salarioMensal;
	private double horasExtras;
	
	public Programador () {
		
	}
	
	public Programador(double salarioMensal, double horasExtras) {
		this.salarioMensal = salarioMensal;
		this.horasExtras = horasExtras;
	}
	
	public void setSalario(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public void setHoras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public double getSalario() {
		return salarioMensal;
	}
	
	public double getHoras() {
		return horasExtras;
	}
	
	double calculaSalario () {
		return getSalario();
	}
	double calculaSalario(double horasExtras, int quant, double horas) {
		double valor = getSalario() + (quant/horas )*getHoras();
		return valor;
	}
}
