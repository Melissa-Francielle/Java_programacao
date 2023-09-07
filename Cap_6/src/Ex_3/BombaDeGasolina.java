package Ex_3;

public class BombaDeGasolina {
    private double tanque;
    private double precoLitro;
    private int litrosVendidos;
    private double valorVendas;
    private double litros;
    private double dinheiro;
    
    public BombaDeGasolina(){
    }
    
    public BombaDeGasolina (double tanque, double precoLitro, double litrosVendidos, double valorVendas, double litros){
        this.tanque = 5000;
        this.precoLitro = 5.20;
        this.litrosVendidos = 0;
        this.valorVendas = 0;
        this.litros = litros;
    }

    public void setTanque(double tanque){
        this.tanque = tanque;
    }
    
    public double getTanque(){
        return tanque;
    }
    
    public void setPreco(double precoL){
        this.precoLitro = precoL;
    }
    
    public double getPreco(){
        return precoLitro;
    }
    
    public void setVendidos(int vendidos){
        this.litrosVendidos = vendidos;
    }
    
    public int getVendidos(){
        return litrosVendidos;
    }
    
    public void setVendas(double valor){
        this.valorVendas = valor;
    }
    
    public double getVendas(){
        return valorVendas;
    }
    
    public void setLitros(double litros){
        this.litros = litros;
    }
    
    public double getLitros(){
        return litros;
    }
    
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    
    public double getDinheiro (){
        return dinheiro;
    }
}