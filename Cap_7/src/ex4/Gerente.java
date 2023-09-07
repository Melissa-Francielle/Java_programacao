package ex4;

public class Gerente extends Funcionario {
	private double salarioMensal;
	
	public Gerente() {}
	
	public Gerente(double salarioMensal, int codigo, String nome) {
		super(codigo, nome);
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalario() {
		return salarioMensal;
	}
	
	public void setSalario(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	@Override
	public double calcularSalario() {
		return this.getSalario() + (1.0/100);
	}
	@Override
	public String toString() {
		return "Nome: "+nome+"\nCodigo: "+codigo+"\nSalario Calculado: "+calcularSalario();
	}

	
}
