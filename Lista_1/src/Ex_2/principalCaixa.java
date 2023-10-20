package Ex_2;

public class principalCaixa {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        caixa.comprimento= 10.0;
        caixa.largura = 10.0;
        caixa.altura = 10.0;

        Double volume = caixa.calcularVolume();
        System.out.println(volume);

        Caixa caixa_2 = new Caixa (2.0, 3.5, 6.0);
        System.out.println(caixa_2.calcularVolume());
    }
}
