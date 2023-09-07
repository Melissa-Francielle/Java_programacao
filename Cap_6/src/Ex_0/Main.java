package Ex_0;

public class Main {
    public static void main (String [] args){
        /*Passando pelo parametro do nome   novas coodernadas para o método 
        de teletransporte*/ 
        Robo android = new Robo ("Android", new Ponto(10, 5));
        /*Passando pelo parametro do nome   novas coodernadas para o método 
        de teletransporte*/
        Robo android2 = new Robo ("Ios", new Ponto (110, 5));
        
        android.posicao();
        android.cima();
        android2.posicao();
        android.posicao();
        System.out.println(android.colidiu(android, android2));
    }
}