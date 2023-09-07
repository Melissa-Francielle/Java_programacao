package Ex_1;

public class Cachorro {
    private String raca;
    private String nome;
    private int latidos;
   
    public Cachorro(){
        
    }
    
    public Cachorro (String raca){
        this.raca = "indeterminada";
    }
    
    public Cachorro (String raca, String nome){
        this.raca = raca;
        this.nome = nome;
    }
    
    public void setRaca (String raca){
        this.raca = raca;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setNome (String name){
        this.nome = name;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setLatidos(int latidos){
        this.latidos = latidos;
    }
    
    public int getLatidos(){
        return latidos;
    }
}

