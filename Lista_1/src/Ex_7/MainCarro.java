package Ex_7;

//Para utilizar o scanner é necessário importar a biblioteca
//import java.util.Scanner;

public class MainCarro {
    public static void main (String [] args){
        Carro carro = new Carro ("Merceders", "M13", 2020);
        
        
        carro.acelerar();
        System.out.println(carro.velocidade);
        carro.frear();
        System.out.println(carro.velocidade);

        /*Acessar pelo teclado 
        Scanner teclado = new Scanner (System.in);
        
        
        (sintaxe - (tipo variavel = teclado.nextTipo))
        
        Exemplo com inteiro 
        int i = teclado.nextInt();
        Com string 
        String s = teclado.nextLine();

        System.out.println(i);
        System.out.println(s);
        */

    }
}





