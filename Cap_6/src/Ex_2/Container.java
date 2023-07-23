package Ex_2;

public class Container {
    private double capacidade;
    private boolean ocupado;
    private double medida;
    
    public Container (){
        
    }
    
    public Container (double capacidade, boolean ocupado){
        this.capacidade = capacidade;
        this.ocupado = false;
    }

    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }
    
    public double getCapacidade(){
        return capacidade;
    }
    
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }
    
    public boolean getOcupado(){
        return ocupado;
    }
    
    public void setMedida(double m){
        this.medida = m;
    }
    
    public double getMedida(){
        return medida;
    }
    
    void ocupar(double medida){
        if(getMedida() <= getCapacidade() && getOcupado() == false){
           setOcupado(true);
           System.out.println(getOcupado());
        }
        if(getMedida() > getCapacidade() || getOcupado() == true){
            setOcupado(false);
            System.out.println(getOcupado());
        }
    }
}

