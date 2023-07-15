package Exercicio_2;

public class Main {
	public static void main(String [] args) {
		Caixa c = new Caixa();
		
		c.setAlt(2.0);
		c.setCp(5.0);
		c.setLarg(5.0);
		 c.calcularVolume();
		System.out.println("Volume da caixa: "+ c.calcularVolume());
	}

}
