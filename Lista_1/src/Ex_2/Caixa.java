package Ex_2;

public class Caixa{
    Double comprimento;
    Double largura;
    Double altura;

    Caixa (){
        comprimento = 0.0;
        largura = 0.0;
        altura = 0.0;
    }
    Caixa (Double comprimento, Double largura, Double altura){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
    Double calcularVolume(){
        Double volume = comprimento * largura * altura;
        return volume;
    }
} 