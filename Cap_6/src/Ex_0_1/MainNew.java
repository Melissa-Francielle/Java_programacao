package Ex_0_1;

public class MainNew {
    public static void main (String [] args){
    	RoboNew robo = new RoboNew();
    	RoboNew robo2 = new RoboNew();
    	PontoNew ponto = new PontoNew();
    	
    	robo.setNome("Eletro");
    	robo2.setNome("Luxin");
    	System.out.println("Robo: "+robo.getNome()+"\nEstado"); 
    	Motor.ligar(robo);
        System.out.println("\n");
    	System.out.println("Robo: "+robo2.getNome()+"\nEstado");
    	Motor.ligar(robo2);
    	
    	
    	System.out.println("\nRobo: "+robo.getNome());
    	System.out.println("\nAcoes");
    	System.out.println("\nPosicao original");
    	ponto.setX(10);
    	ponto.setY(5);
    	robo.setPonto(ponto);
    	robo.posicao();
    	System.out.println("\nBaixo");
    	robo.baixo();
    	robo.posicao();
    	System.out.println("\nCima");
    	robo.cima();
    	robo.posicao();
    	System.out.println("\nDireta");
    	robo.direita();
    	robo.posicao();
    	System.out.println("\nEsquerda");
    	robo.esquerda();
    	robo.posicao();
    	
    	
    	System.out.println("\nRobo: "+robo2.getNome());
    	System.out.println("\nAcoes");
    	System.out.println("\nPosicao original");
    	ponto.setX(5);
    	ponto.setY(10);
    	robo2.setPonto(ponto);
    	robo2.posicao();
    	System.out.println("\nBaixo");
    	robo2.baixo();
    	robo2.posicao();
    	System.out.println("\nCima");
    	robo2.cima();
    	robo2.posicao();
    	System.out.println("\nDireta");
    	robo2.direita();
    	robo2.posicao();
    	System.out.println("\nEsquerda");
    	robo2.esquerda();
    	robo2.posicao();
    	
    	
    	System.out.println(Colide.colidiu(robo, robo2));
    	
    	ponto.setX(10);
    	ponto.setY(2);
    	robo.setPonto(ponto);
    	robo.posicao();
    	
    }
}
