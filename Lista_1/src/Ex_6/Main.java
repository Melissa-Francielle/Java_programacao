package Ex_6;

public class Main {
    public static void main (String[] args){
        Livro livro = new Livro ();
        //primeiro modo de entrar com os dados
        livro.titulo = "Java como Programar";
        livro.paginas = 200;
        livro.editora = "London Press";
        livro.autor = new Autor ("Schild", "Programação");

        //Segundo modo 
        Livro livro2 = new Livro ("C como Programar", 200, "Elsevier", new Autor("Mordekay", "Programação"));

        //Terceiro modo
        Autor autor = new Autor ("Rigby", "Ficção");
        Livro livro3 = new Livro ("Aliens", 110, "Ovni", autor);        
    }
}



