package Exercicio_6;

public class Programador {
	private double valorHora;
	private double horasTrabalhadas;
	private double salario;
	
	public Programador() {
		
	}
	
	public Programador (double valorHora, double horasTrabalhadas, double salario) {
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salario = salario;
	}
	
	public void setValor(double valor) {
		this.valorHora = valor;
	}
	
	public void setHoras(double time) {
		this.horasTrabalhadas = time;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getValor() {
		return valorHora;
	}
	
	public double getHoras() {
		return horasTrabalhadas;
	}
	
	public double getSalario() {
		return salario;
	}
	
	double calcularSalario(double valorHora, double horasTranalhadas, double salario) {
		double valor_prog = getSalario() + getHoras()*getValor();
		return valor_prog;
	}
}
