package Ex_6;

public class Main {
	public static void main(String [] args) {
		Diarista d = new Diarista(120020, "Bernado", 200.00, 20);
		Gerente g = new Gerente(2200552, "Thais", 500.00);
		
		d.calculaSalario();
		g.calcularSalario();
	}
}
