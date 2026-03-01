import br.com.alura.livro.model.Livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Livro livroUm = new Livro("Harry Potter", "JK Rowling", 250.00);
        Livro livroDois = new Livro("Box Sandman", "Neil Gaiman", 350.00);
        Livro livroTres = new Livro("Senhor dos Anéis", "JRR Tolkien", 450.00);

        ArrayList<Livro> livros = new ArrayList<Livro>();

        livros.add(livroUm);
        livros.add(livroDois);
        livros.add(livroTres);

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}