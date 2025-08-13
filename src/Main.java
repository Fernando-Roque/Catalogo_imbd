

import entidades.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

   public class Main {
           private static final DateTimeFormatter DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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


                   while (true) {
                           System.out.println("\nCatálogo de Filmes");
                           System.out.println("1- Listar todos os filmes");
                           System.out.println("2- Pesquisar filme por nome");
                           System.out.println("3- Cadastrar filme");
                           System.out.println("4- Cadastrar ator");
                           System.out.println("5- Cadastrar diretor");
                           System.out.println("6- Associar ator a filme");
                           System.out.println("7- Associar diretor a filme");
                           System.out.println("8- Sair");
                           System.out.print("Digite a opção desejada: ");

                           String op = scanner.nextLine().trim();

                           switch (op) {
                                   case "1": {
                                           System.out.println("\nFilmes cadastrados");
                                           for (Filme filmeLista : catalogo.listarFilmes()) {
                                                   System.out.print(filmeLista); // toString() do Filme
                                           }
                                           break;
                                   }
                                   case "2": {
                                           System.out.print("\nDigite o nome (ou parte) do filme: ");
                                           String pesquisa = scanner.nextLine().trim();
                                           List<Filme> resultados = catalogo.pesquisarFilmePorNome(pesquisa);
                                           if (resultados.isEmpty()) {
                                                   System.out.println("Nenhum filme encontrado com esse nome.");
                                           } else {
                                                   System.out.println("\nFilmes encontrados:");
                                                   for (Filme filmeLista : resultados) {
                                                           System.out.print(filmeLista);
                                                   }
                                           }
                                           break;
                                   }

                                   // Cadastrar filme
                                   case "3": {
                                           try {

                                           System.out.print("Título: ");
                                           String titulo = scanner.nextLine().trim();

                                           System.out.print("Data de lançamento (dd/MM/yyyy): ");
                                           String dataStr = scanner.nextLine().trim();
                                           LocalDate data = LocalDate.parse(dataStr, DATA);

                                           System.out.print("Orçamento (USD): ");
                                           double orcamento = Double.parseDouble(scanner.nextLine().trim());

                                           System.out.print("Descrição: ");
                                           String descricao = scanner.nextLine().trim();

                                           catalogo.cadastrarFilme(new Filme(titulo, data, orcamento, descricao));
                                           System.out.println("Filme cadastrado.");
                                           }
                                           catch (Exception invalido) {
                                                   System.out.println("Inválido. Formato da data ==> dd/MM/yyyy e número no orçamento.");
                                           }
                                           break;
                                   }
                                   // Cadastrar ator
                                   case "4": {
                                          try {
                                           System.out.print("Nome do ator: ");
                                           String nome = scanner.nextLine().trim();

                                           System.out.print("Nascimento (dd/MM/yyyy): ");
                                           String dataStr = scanner.nextLine().trim();
                                           LocalDate nascimento = LocalDate.parse(dataStr, DATA);

                                           System.out.print("Nacionalidade: ");
                                           String nacionalidade = scanner.nextLine().trim();

                                           catalogo.cadastrarAtor(new Ator(nome, nascimento, nacionalidade));
                                           System.out.println("Ator cadastrado.");
                                          }
                                              catch (Exception invalido) {
                                                          System.out.println("Inválido. Formato da data ==> dd/MM/yyyy");
                                                  }
                                           break;
                                   }
                                   // Cadastrar diretor
                                   case "5": {
                                           try {
                                           System.out.print("Nome do diretor: ");
                                           String nome = scanner.nextLine().trim();

                                           System.out.print("Nascimento (dd/MM/yyyy): ");
                                           String dataStr = scanner.nextLine().trim();
                                           LocalDate nascimento = LocalDate.parse(dataStr, DATA);

                                           System.out.print("Nacionalidade: ");
                                           String nacionalidade = scanner.nextLine().trim();

                                           catalogo.cadastrarDiretor(new Diretor(nome, nascimento, nacionalidade));
                                           System.out.println("Diretor cadastrado.");
                                           }
                                           catch (Exception invalido) {
                                                   System.out.println("Inválido. Formato da data ==> dd/MM/yyyy");
                                           }
                                           break;
                                   }
                                   case "6": {
                                           // Associar ator a filme
                                           System.out.print("Título do filme: ");
                                           String titulo = scanner.nextLine().trim();
                                           System.out.print("Nome do ator: ");
                                           String nomeAtor = scanner.nextLine().trim();

                                           Filme filmeEscolhido = null;
                                           for (Filme filmeLista : catalogo.listarFilmes()) {
                                                   if (filmeLista.getTitulo().equalsIgnoreCase(titulo)) {
                                                           filmeEscolhido = filmeLista;
                                                           break;
                                                   }
                                           }
                                           Ator atorEscolhido = null;
                                           for (Ator a: catalogo.listarAtores()) {
                                                   if (a.getNome().equalsIgnoreCase(nomeAtor)) {
                                                           atorEscolhido = a;
                                                           break;
                                                   }
                                           }
                                           // Fime escolhido ou Ator Escolhido
                                           if (filmeEscolhido == null || atorEscolhido == null) {
                                                   System.out.println("Filme ou ator não encontrado.");
                                           } else {
                                                   catalogo.associarAtorFilme(filmeEscolhido, atorEscolhido);
                                                   System.out.println("Ator associado.");
                                           }
                                           break;
                                   }
                                   case "7": {
                                           // Associar diretor a filme
                                           System.out.print("Título do filme: ");
                                           String titulo = scanner.nextLine().trim();
                                           System.out.print("Nome do diretor: ");
                                           String nomeDiretor = scanner.nextLine().trim();

                                           Filme filmeEscolhido = null;
                                           for (Filme filmeLista : catalogo.listarFilmes()) {
                                                   if (filmeLista.getTitulo().equalsIgnoreCase(titulo)) {
                                                           filmeEscolhido = filmeLista;
                                                           break;
                                                   }
                                           }
                                           Diretor diretorEscolhido = null;
                                           for (Diretor d: catalogo.listarDiretores()) {
                                                   if (d.getNome().equalsIgnoreCase(nomeDiretor)) {
                                                           diretorEscolhido = d;
                                                           break;
                                                   }
                                           }

                                           if (filmeEscolhido == null || diretorEscolhido == null) {
                                                   System.out.println("Filme ou diretor não encontrado.");
                                           } else {
                                                   catalogo.associarDiretorFilme(filmeEscolhido, diretorEscolhido);
                                                   System.out.println("Diretor associado.");
                                           }
                                           break;
                                   }
                                   case "8":
                                           System.out.println("Volte sempre!");
                                           scanner.close();
                                           return;

                                   default:
                                           System.out.println("Opção inválida!");
                           }
                   }
           }
   }
