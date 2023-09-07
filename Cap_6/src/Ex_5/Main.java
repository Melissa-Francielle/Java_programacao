package Ex_5;

public class Main {
    public static void main (String [] args) {
    	Valor v = new Valor();
    	
    	v.setNum(2.0);
    	v.setNum2(5.0);
    	System.out.println(UtilMaior.maior(v.getNum(), v.getNum2()));
    	v.setNum3(-1);
    	System.out.println(UtilNeg.ehNegativo(v.getNum3()));
    	v.setNum3(2);
    	System.out.println(UtilPar.ehPar(v.getNum3()));
    	
    	v.setNum(100.0);
    	v.setNum2(50.0);
    	System.out.println(UtilMaior.maior(v.getNum(), v.getNum2()));
    	v.setNum3(5);
    	System.out.println(UtilNeg.ehNegativo(v.getNum3()));
    	v.setNum3(13);
    	System.out.println(UtilPar.ehPar(v.getNum3()));
    }
}