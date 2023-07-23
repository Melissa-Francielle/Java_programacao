package Ex_6;

public class MainConsulta {
	public static void main(String [] args) {
		Paciente paciente = new Paciente();
		Consulta c = new Consulta();
		
		paciente.setNome("Carlos");
		paciente.setCod(10);
		paciente.setData(2002, 8, 10);
		
		System.out.println("\nNome do Paciente: "+paciente.getNome()+"\nCodigo do Paciente: "+paciente.getCod()+"\nData do nascimento: "+paciente.getData());
		
		c.setData(2023,7,04);
		c.getPaciente().setNome("Lorcas");
		System.out.println("\n"+c.getPaciente().getNome());
		
		
		
	}
}
	
