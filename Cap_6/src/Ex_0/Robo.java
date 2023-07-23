package Ex_0;

public class Robo {
    private String robo;
    private Ponto ponto;
    
    //Construtor 
    public Robo (String robo, Ponto ponto){
        this.robo = robo;
        this.ponto = ponto;
    }
    
    //Construtor vazio
    public Robo ( ) { }
    
    //Robo é uma variavel privada, é feito o set para acesso 
    public void setRobo (String android){
        robo = android; //atribuindo a outro nome
    }
    
    //get do Robo;
    public String getRobo (){
        return robo;
    }
    
    //O mesmo para a váriavel objeto Ponto;
    public void setPonto(Ponto orientacao){
        ponto = orientacao;
    }
    
    public Ponto getPonto (){
        return ponto;
    }
    //O robo anda para direita incrementa
    void direita (){
        ponto.setX(ponto.getX()+1);
    }
    
    //O robo anda para esquerda decrementa
    void esquerda (){
        ponto.setY(ponto.getY()-1);
    }
    
    //O robo anda para baixo decrementa
    void baixo (){
        ponto.setY(ponto.getY()-1);
    }
    
    //O robo anda para cima incrementa
    void cima (){
        ponto.setX(ponto.getX()+1);
    }
    
    //O teletransporte do robo passado pelas váriaveis x e y do objeto Ponto
    public void teletransporte(int x, int y){
        ponto.setX(y);
        ponto.setY(x);
    }
    
    //Imprime a posicao das coordernadas atuais do robo;
    public void posicao (){
        System.out.println(ponto.getX()+", "+ponto.getY());
    }
    
    /* verificando se a condição é falsa ou verdadeira, utilizando 
    um método do tipo booleano. Recebe um objeto Robo.*/
    public boolean colidiu(Robo android, Robo android2){
        if (android.getPonto().getX() == android2.getPonto().getX()){ /* se a condição 
            for verdadeira significa que houve colisão, a váriavel devem ter
            valores iguais */
            if(android.getPonto().getY()== android2.getPonto().getY()){ /*o mesmo
                para a váriavel Y*/
                return true; //condição verdadeira;
            }
        }
        return false; //caso não haja colisão, irá retornar falso;
    }
}
