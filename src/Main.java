import br.com.alura.livro.model.Livro;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //CHAMANDO JSON, IMPRIMINDO MAIS FORMATADO E COM TTO DE UPPER CASE
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        //ARRAY
        ArrayList<Livro> livros = new ArrayList<Livro>();

        //OBJETOS
        Livro livroUm = new Livro("Harry Potter", "JK Rowling", 250.00);
        Livro livroDois = new Livro("Box Sandman", "Neil Gaiman", 350.00);
        Livro livroTres = new Livro("Senhor dos Anéis", "JRR Tolkien", 450.00);
        Livro livroQuatro = new Livro("Bruxa de Blair", "XXXXX", 250.00);
        Livro livroCinco = new Livro("Animais Fantásticos", "NNNNN", 350.00);
        Livro livroSeis = new Livro("Templários", "LLLLLL", 450.00);

        //ADD A LISTA
        livros.add(livroUm);
        livros.add(livroDois);
        livros.add(livroTres);
        livros.add(livroQuatro);
        livros.add(livroCinco);
        livros.add(livroSeis);

        //PERCORRENDO A LISTA
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        try (FileWriter fw = new FileWriter("livros.json")) {
            fw.write(gson.toJson(livros));
            fw.close();
            System.out.println("Livros cadastrados com sucesso!");
            System.out.println("Tamanho: " + livros.size());
        } catch (Exception e) {
            System.out.println("Erro ao criar livros com sucesso!" + e.getMessage());
        }
    }
}