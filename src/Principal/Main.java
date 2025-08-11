package entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CatalogoFilmes catalogo = new CatalogoFilmes();

        // Criar atores
        Ator ator1 = new Ator("Robert Downey Jr.", LocalDate.of(1965, 4, 4), "Ator americano famoso", "Homem de Ferro");
        Ator ator2 = new Ator("Chris Evans", LocalDate.of(1981, 6, 13), "Ator americano", "Capitão América");
        Ator ator3 = new Ator("Scarlett Johansson", LocalDate.of(1984, 11, 22), "Atriz americana", "Viúva Negra");

        // Criar diretor
        Diretor diretor = new Diretor("Jon Favreau", LocalDate.of(1966, 10, 19), "Diretor e ator americano", 20);

        // Adicionar atores e diretor ao catálogo
        catalogo.adicionarAtor(ator1);
        catalogo.adicionarAtor(ator2);
        catalogo.adicionarAtor(ator3);
        catalogo.adicionarDiretor(diretor);

        // Criar filme com elenco
        Filme filme = new Filme("Homem de Ferro", 2008, diretor, Arrays.asList(ator1, ator2, ator3));

        // Adicionar filme
        catalogo.adicionarFilme(filme);

        // Listar filmes e mostrar detalhes
        for (Filme f : catalogo.listarFilmes()) {
            System.out.println(f.exibirDetalhes());
            System.out.println("----");
        }
    }
}
