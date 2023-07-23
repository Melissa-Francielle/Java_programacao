package Ex_0;

public class Ponto {
    private int x;
    private int y;
    

    //construtor vazio
    public Ponto () { }
    
    //construtor parametrizado
    public Ponto (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //set do X e Y;
    void setX (int horizontal){
        x = horizontal;
    }
    
    void setY(int vertical){
        y = vertical;
    }
    
    //Get do X e do Y;
    int getX (){
        return x;
    }
    
    int getY (){
        return y;
    }
}
