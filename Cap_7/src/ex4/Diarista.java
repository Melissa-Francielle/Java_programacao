package ex4;

public class Diarista extends Funcionario{
	private double salarioDia;
	private int diasTrabalhados;
	
	public Diarista() {}
	
	public Diarista(double salarioDia, int diasTrabalhados, int codigo, String nome) {
		super(codigo, nome);
		this.salarioDia = salarioDia;
		this.diasTrabalhados = diasTrabalhados;
	}
	
	public double getSalario() {
		return salarioDia;
	}
	
	public void setSalario(double salarioDia) {
		this.salarioDia = salarioDia;
	}
	
	public int getDia() {
		return diasTrabalhados;
	}
	
	public void setDia(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}
	
	@Override
	public double calcularSalario() {
		double salario;
		return salario = this.getSalario() * this.getDia();
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+"\nCodigo: "+codigo+"\nSalario Calculado: "+calcularSalario();
	}
}
