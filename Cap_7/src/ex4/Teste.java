package ex4;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main (String[] args) {
		Diarista diarista = new Diarista(25.000, 20, 25314, "Lucas");
		Gerente gerente = new Gerente(10.00, 33658, "Luan"); 		
		/*diarista.setCodigo(2000);
		diarista.setNome("luan");
		diarista.setDia(10);
		diarista.setSalario(1000.2);
		diarista.calcularSalario();
		
		gerente.setCodigo(6666);
		gerente.setNome("Lol");
		gerente.setSalario(992.22);
		gerente.calcularSalario();*/
		
		//System.out.println("\nCalculo do salario do diarista: "+diarista.calcularSalario());
		//System.out.println("\nCalculo do salario do gerente: "+gerente.calcularSalario());
		
		//diarista.calcularSalario();
		//gerente.calcularSalario();
		
		List<Funcionario> funcionario = new ArrayList<>(3);
		
		//funcionario.add(gerente);
		//funcionario.add(diarista);
		
		funcionario.add(diarista);
		funcionario.add(gerente);
		for (Funcionario funcionarios : funcionario) {
			/*System.out.println(funcionarios.getCodigo());
			System.out.println(funcionarios.getNome());
			System.out.println(funcionarios.calcularSalario());*/
			System.out.println(funcionarios);
		}
		
		
	}
}
