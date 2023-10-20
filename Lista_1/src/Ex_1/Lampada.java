package Ex_1;

class Lampada{
    boolean acesa; //várivael ou atributo;

    //construtor;
    Lampada(){
        acesa = false;
    }

    void ligar(){
        acesa = true; //métodos
    }
    
    void desligar(){
        acesa = false;
    }

    String mostrarEstado(){
        if (acesa == true){
            return "acesa";
        }
        else {
            return "apagada";
        }
    }

    
}