package Ex_2;

public class MainContainer {
    public static void main(String[] args){
        Container cont = new Container ();
        
        cont.setCapacidade(3.2);
        cont.setOcupado(false);
        cont.setMedida(3.2);
        cont.ocupar(cont.getMedida());
        cont.setCapacidade(2.0);
        cont.setOcupado(true);
        cont.setMedida(1.0);
        cont.ocupar(cont.getMedida());
    }
}