package Ex_6;

import java.time.LocalDate;
public class Consulta {
	private Paciente paciente;
	LocalDate data;
	
	public Consulta() {
		
	}
	
	public Consulta (Paciente paciente) {
		this.paciente = paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setData(int ano, int mes, int dia) {
		this.data = LocalDate.now();
	}
	
	public LocalDate getData() {
		return data;
	}
}
