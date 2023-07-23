package Ex_6;

public class Gerente extends Funcionario{
	private double salarioMensal;
	
	public Gerente() {
		
	}
	
	public Gerente(int codigo, String nome, double salarioMensal) {
		super(codigo, nome);
		this.salarioMensal = salarioMensal;
	}
	
	public double getMensal() {
		return salarioMensal;
	}
	
	public void setMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public void info() {
		System.out.println("Codigo: "+this.getCod()+"\nNome: "+this.getName()+"Salario Mensal: "+this.getMensal());
	}
	public double calcularSalario() {
		double gratificacao = this.getMensal()+0.010;
		return gratificacao;
	}

}
