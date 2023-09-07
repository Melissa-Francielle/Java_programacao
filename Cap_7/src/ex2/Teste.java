package ex2;

public class Teste {
 public static void main (String [] args) {
	 Ponto ponto = new Ponto();
	 Pixel pixel = new Pixel();
	 Circulo circ = new Circulo();
	 
	 ponto.setX(2);
	 ponto.setY(5);
	 pixel.setCor("Vermelho");
	 pixel.setX(5);
	 pixel.setY(5);
	 circ.setP(ponto);
	 circ.setRaio(2.2);
	
	 System.out.println("\nClasse Ponto\nPonto X: "+ponto.getX()+"\nPonto Y: "+ponto.getY());
	 System.out.println("\nClasse Pixel\nCor: "+pixel.getCor()+"\nPonto x: "+pixel.getX()+"\nPonto y: "+pixel.getY());
	 System.out.println("\n");
	 circ.imprimindoPonto();
	 System.out.println("Raio: "+circ.getRaio());
	 
 }
}
