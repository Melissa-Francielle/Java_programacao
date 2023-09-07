package ex5;
import java.util.List;
import java.util.ArrayList;

public class Teste {
	public static void main (String[] args) {
		Ensino ensino = new Ensino ( "Biologia", "Biologia", 10, "Projeto ensino");
		Extensao extensao = new Extensao ("Estudantes","Linha Estudantes", 5, "Projeto Extensao");
		Pesquisa pesquisa = new Pesquisa ("Area CNPQ", 222.0, 56, "Projeto Pesquisa");
		
		
		List <Projeto> project = new ArrayList<>(2);
		project.add(pesquisa);
		project.add(extensao);
		project.add(ensino);
		
		for (Projeto projects : project) {
			System.out.println(projects);
		}
		
	}
}
