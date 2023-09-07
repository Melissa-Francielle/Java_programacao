package Ex_6;

import java.time.LocalDate;

public class Paciente {
	private int codigo;
	private String nome;
	LocalDate dataNascimento;
	
	public Paciente() { }
	
	public Paciente(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;	
	}
	
	public void setCod(int cod) {
		this.codigo = cod;
	}
	
	public int getCod() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setData(int ano, int dia, int mes) {
		this.dataNascimento = LocalDate.of(ano, dia, mes);
	}
	
	public LocalDate getData() {
		return dataNascimento;
	}
}
