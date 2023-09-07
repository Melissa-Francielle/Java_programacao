package Exercicio_7;

public class Main {
	public static void main (String [] args) {
		Carro carro = new Carro();
		CarroCaracteristica c = new CarroCaracteristica();
		
		carro.setVel(10);
		System.out.println("\nVelocimetro: "+carro.getVel());
		carro.acelerar();
		System.out.println("\nVelocimetro: "+carro.getVel());
		carro.frear();
		System.out.println("\nVelocimetro: "+carro.getVel());
		
		c.setMarca("Fusca");
		c.setModelo("Fiat");
		c.setAno(2002);
		
		System.out.println("\nMarca: "+c.getMarca()+"\tModelo: "+c.getModelo()+"\tAno: "+c.getAno());
		
		c.setCar(carro);
		System.out.println("\nVelocimetro: "+c.getCarro().getVel());
		carro.acelerar();
		System.out.println("\nVelocimetro: "+c.getCarro().getVel());
		carro.frear();
		System.out.println("\nVelocimetro: "+c.getCarro().getVel());
		
	}
}
