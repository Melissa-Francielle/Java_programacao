package Ex_4;

public class Util {
    public static boolean ehPar(int i){
        if(i % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static boolean ehNegativo(int i){
        if(i < 0){
            return true;
        }
        return false;
    }
    
    public static double maior(double i, double j){
        if(i > j){
            return i;
        }
        else{
            return j;
        }
    }
}
