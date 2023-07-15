package Exercicio_3;

public class Main {
	public static void main(String [] args) {
		Data date = new Data();
		Data date2 = new Data();
		
		date.setDia(10);
		date.setMes(8);
		date.setAno(2002);
		System.out.println(date.formatarData("/"));
		
		date2.setDia(5);
		date2.setMes(8);
		date2.setAno(1994);
		System.out.println(date2.formatarData("-"));
	}
}
