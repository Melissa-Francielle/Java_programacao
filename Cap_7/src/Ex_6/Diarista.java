package Ex_6;

public class Diarista extends Funcionario{
	private double salarioDia;
	private int diasTrabalhados;
	
	//contrustor
	public Diarista() {
		
	}
	
	public Diarista(int codigo, String nome, double salarioDia, int diasTrabalhados) {
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
	
	public int getDias() {
		return diasTrabalhados;
	}
	
	public void setDias(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public void info() {
		System.out.println("Codigo: "+this.getCod()+"\nNome: "+this.getName()+"Salario: "+this.getSalario()+"Dias trabalhados: "+this.getDias());
	}
	public double calculaSalario() {
		double mult;
		mult = this.getSalario() * this.getDias();
		return mult;
	}
	
}
