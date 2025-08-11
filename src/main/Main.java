package main;

import entidades.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner para entrada de dados do usuário

        CatalogoFilmes catalogo = new CatalogoFilmes(); // Instanciando o catálogo de filmes

        // Criando alguns diretores
        Diretor diretor = new Diretor("Christopher Nolan", LocalDate.of(1970, 7, 30), "Britânico");
        Diretor scorsese = new Diretor("Martin Scorsese", LocalDate.of(1942, 11, 17), "Americano");
        Diretor inarritu = new Diretor("Alejandro González Iñárritu", LocalDate.of(1963, 8, 15), "Mexicano");
        Diretor villeneuve = new Diretor("Denis Villeneuve", LocalDate.of(1967, 10, 3), "Canadense");
        Diretor stahelski = new Diretor("Chad Stahelski", LocalDate.of(1968, 9, 20), "Americano");

        // Criando alguns atores
        Ator ator = new Ator("Leonardo DiCaprio", LocalDate.of(1974, 11, 11), "Americano");
        Ator murphy = new Ator("Cillian Murphy", LocalDate.of(1976, 5, 25), "Irlandês");
        Ator chalamet = new Ator("Timothée Chalamet", LocalDate.of(1995, 12, 27), "Americano");
        Ator reeves = new Ator("Keanu Reeves", LocalDate.of(1964, 9, 2), "Canadense");

        // Adicionando um filme
        Filme filme = new Filme("A Origem", LocalDate.of(2010, 7, 16), 160_000_000, "Filme de ficção científica e ação.");
        // Adicionando mais dois filmes do mesmo diretor (Christopher Nolan)
        Filme interstellar = new Filme("Interstellar", LocalDate.of(2014, 11, 6), 165_000_000, "Ficção científica espacial.");
        Filme dunkirk = new Filme("Dunkirk", LocalDate.of(2017, 7, 20), 100_000_000, "Filme de guerra épico.");
        // Adicionando dois filmes atuais
        Filme oppenheimer = new Filme("Oppenheimer", LocalDate.of(2023, 7, 21), 100_000_000, "Drama histórico.");
        Filme duna2 = new Filme("Duna: Parte Dois", LocalDate.of(2024, 3, 14), 190_000_000, "Ficção científica épica.");
        // Adicionando mais dois filmes do mesmo ator (Leonardo DiCaprio)
        Filme loboWallStreet = new Filme("O Lobo de Wall Street", LocalDate.of(2013, 12, 25), 100_000_000, "Comédia negra biográfica.");
        Filme regresso = new Filme("O Regresso", LocalDate.of(2015, 12, 25), 135_000_000, "Drama de sobrevivência.");
        Filme johnWick1 = new Filme("John Wick", LocalDate.of(2014, 10, 24), 20_000_000, "Assassino aposentado busca vingança.");
        // Cadastrando diretores
        catalogo.cadastrarDiretor(diretor);
        catalogo.cadastrarDiretor(scorsese);
        catalogo.cadastrarDiretor(inarritu);
        catalogo.cadastrarDiretor(villeneuve);
        catalogo.cadastrarDiretor(stahelski);

        // Cadastrando atores
        catalogo.cadastrarAtor(ator);
        catalogo.cadastrarAtor(murphy);
        catalogo.cadastrarAtor(chalamet);
        catalogo.cadastrarAtor(reeves);

        // Cadastrando filmes
        catalogo.cadastrarFilme(filme);
        catalogo.cadastrarFilme(interstellar);
        catalogo.cadastrarFilme(dunkirk);
        catalogo.cadastrarFilme(loboWallStreet);
        catalogo.cadastrarFilme(regresso);
        catalogo.cadastrarFilme(oppenheimer);
        catalogo.cadastrarFilme(duna2);
        catalogo.cadastrarFilme(johnWick1);

        // Associando diretores.
        catalogo.associarDiretorFilme(filme, diretor);
        catalogo.associarDiretorFilme(interstellar, diretor);
        catalogo.associarDiretorFilme(dunkirk, diretor);
        catalogo.associarDiretorFilme(loboWallStreet, scorsese);
        catalogo.associarDiretorFilme(regresso, inarritu);
        catalogo.associarDiretorFilme(johnWick1, stahelski);


        // Associando atores aos filmes
        catalogo.associarAtorFilme(filme, ator);
        catalogo.associarAtorFilme(loboWallStreet, ator);
        catalogo.associarAtorFilme(regresso, ator);
        catalogo.associarAtorFilme(oppenheimer, murphy);
        catalogo.associarAtorFilme(duna2, chalamet);
        catalogo.associarAtorFilme(johnWick1, reeves);

        // Associando diretores aos filmes
        catalogo.associarDiretorFilme(oppenheimer, diretor); // Nolan já existente
        catalogo.associarDiretorFilme(duna2, villeneuve);
        catalogo.associarDiretorFilme(johnWick1, stahelski); // Stahelski já existente

        // Listando todos os filmes cadastrados
        System.out.println(catalogo.listarFilmes());

        System.out.print("Digite um Filme que esteja no Catalogo de Filmes a cima : ");
        String palavra = scanner.nextLine(); // melhor que next() para aceitar espaços

        List<Filme> resultados = catalogo.pesquisarFilmePorNome(palavra);

        if (!resultados.isEmpty()) {
            System.out.println("Filmes encontrados: " + resultados);
        } else {
            System.out.println("Nenhum filme encontrado com esse nome.");
        }

    }
}
