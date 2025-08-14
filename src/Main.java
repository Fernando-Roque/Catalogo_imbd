//  branch fernando 

import entidades.Ator; // Importando a classe Ator do pacote entidades
import entidades.CatalogoFilmes; // Importando a classe CatalogoFilmes do pacote entidades
import entidades.Diretor; // Importando a classe Diretor do pacote entidades
import entidades.Filme; // Importando a classe Filme do pacote entidades
import java.time.LocalDate;
import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter; // DateTimeFormatter é usado para formatar e analisar objetos de data e hora

   public class Main {
           // ofPattern("dd/MM/yyyy")é usado para criar um formatador de data e hora com base em um padrão especificado
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
                           System.out.println("2- Listar todos os atores");
                           System.out.println("3- Listar todos os diretores");
                           System.out.println("4- Pesquisar filme por nome");
                           System.out.println("5- Cadastrar filme");
                           System.out.println("6- Cadastrar ator");
                           System.out.println("7- Cadastrar diretor");
                           System.out.println("8- Associar ator a filme");
                           System.out.println("9- Associar diretor a filme");
                           System.out.println("10- Sair");
                           System.out.print("Digite a opção desejada: ");

                           String op = scanner.nextLine().trim();

                           switch (op) {
                                   // listar filmes
                                   case "1": {
                                           System.out.println("\nFilmes cadastrados");
                                           for (Filme filmeLista : catalogo.listarFilmes()) {
                                                   System.out.println(filmeLista); // toString() do Filme
                                           }
                                           break;
                                   }
                                   // listar Atores
                                   case "2": {
                                         System.out.println("\nAtores cadastrados");
                                           for (Ator atorLista : catalogo.listarAtores()) {
                                                   System.out.println(atorLista); // toString() do Ator
                                           }
                                        break;
                                   }
                                   // listar Diretores
                                  case "3": {
                                          System.out.println("\nDiretores cadastrados");
                                           for (Diretor diretorLista : catalogo.listarDiretores()) {
                                                   System.out.println(diretorLista); // toString() do Ator
                                           }
                                        break;
                                    } 
                                    // Pesquisar filme por nome    
                                   case "4": {
                                           System.out.print("\nDigite o nome (ou parte) do filme: ");
                                           String pesquisa = scanner.nextLine().trim().toLowerCase(); // toLowerCase para facilitar a busca e .trim() para ignorar  espaços 
                                           List<Filme> resultados = catalogo.pesquisarFilmePorNome(pesquisa);
                                           if (resultados.isEmpty()) { //isEmpty verifica se a lista está vazia retorna true
                                                   System.out.println("Nenhum filme encontrado com esse nome.");
                                           } else {
                                                   System.out.println("\nFilmes encontrados:");
                                                   for (Filme filmeLista : resultados) {
                                                           System.out.println(filmeLista);
                                                   }
                                           }
                                           break;
                                   }

                                   // Cadastrar filme
                               case "5": {
                                   System.out.print("Título: ");
                                   String titulo = scanner.nextLine().trim();

                                   if (!catalogo.pesquisarFilmePorNome(titulo).isEmpty()) {
                                       System.out.println("Filme já cadastrado.");
                                       break;
                                   }

                                   LocalDate data; // Variável declarada antes do loop
                                   while (true) {
                                       System.out.print("Data de lançamento (dd/MM/yyyy): ");
                                       String dataStr = scanner.nextLine().trim();
                                       try {
                                           data = LocalDate.parse(dataStr, DATA);
                                           break; // Sai do loop se a data for válida
                                       } catch (java.time.format.DateTimeParseException e) {
                                           System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                       }
                                   }

                                   double orcamento;
                                   while (true) {
                                       System.out.print("Orçamento (USD): ");
                                       String orcamentoStr = scanner.nextLine().trim();
                                       try {
                                           orcamento = Double.parseDouble(orcamentoStr);
                                           break;
                                       } catch (NumberFormatException e) {
                                           System.out.println("Valor inválido. Por favor, digite apenas números para o orçamento.");
                                       }
                                   }

                                   System.out.print("Descrição: ");
                                   String descricao = scanner.nextLine().trim();

                                   Filme novoFilme = new Filme(titulo, data, orcamento, descricao);
                                   catalogo.cadastrarFilme(novoFilme);
                                   System.out.println("Filme cadastrado.");
                                   break;
                               }
                               // Cadastrar ator
                               case "6": {
                                   String nome;
                                   while (true) { // Inicia o loop para validar o nome
                                       System.out.print("Nome do ator: ");
                                       nome = scanner.nextLine().trim();
                                       // Verifica se o campo não está vazio e se contém pelo menos uma letra
                                       if (!nome.isEmpty() && nome.matches(".*[a-zA-Z]+.*")) {
                                           break; // Sai do loop se o nome for válido
                                       } else {
                                           System.out.println("Nome inválido. O campo não pode ser vazio ou conter apenas números.");
                                       }
                                   }

                                   LocalDate nascimento;
                                   while (true) {
                                       System.out.print("Nascimento (dd/MM/yyyy): ");
                                       String dataStr = scanner.nextLine().trim();
                                       try {
                                           nascimento = LocalDate.parse(dataStr, DATA);
                                           break;
                                       } catch (java.time.format.DateTimeParseException e) {
                                           System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                       }
                                   }

                                   String nacionalidade;
                                   while (true) {
                                       System.out.print("Nacionalidade: ");
                                       nacionalidade = scanner.nextLine().trim();
                                       if (!nacionalidade.isEmpty() && nacionalidade.matches(".*[a-zA-Z]+.*")) {
                                           break;
                                       } else {
                                           System.out.println("Nacionalidade inválida. O campo não pode ser vazio ou conter apenas números.");
                                       }
                                   }

                                   Ator novoAtor = new Ator(nome, nascimento, nacionalidade);
                                   catalogo.cadastrarAtor(novoAtor);
                                   System.out.println("Ator cadastrado.");
                                   break;
                               }
                               // Cadastrar diretor
                               case "7": {
                                   String nome;
                                   while (true) { // Inicia o loop para validar o nome
                                       System.out.print("Nome do diretor: ");
                                       nome = scanner.nextLine().trim();
                                       // Verifica se o campo não está vazio e se contém pelo menos uma letra
                                       if (!nome.isEmpty() && nome.matches(".*[a-zA-Z]+.*")) {
                                           break; // Sai do loop se o nome for válido
                                       } else {
                                           System.out.println("Nome inválido. O campo não pode ser vazio ou conter apenas números.");
                                       }
                                   }

                                   LocalDate nascimento;
                                   while (true) {
                                       System.out.print("Nascimento (dd/MM/yyyy): ");
                                       String dataStr = scanner.nextLine().trim();
                                       try {
                                           nascimento = LocalDate.parse(dataStr, DATA);
                                           break;
                                       } catch (java.time.format.DateTimeParseException e) {
                                           System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                       }
                                   }

                                   String nacionalidade;
                                   while (true) {
                                       System.out.print("Nacionalidade: ");
                                       nacionalidade = scanner.nextLine().trim();
                                       if (!nacionalidade.isEmpty() && nacionalidade.matches(".*[a-zA-Z]+.*")) {
                                           break;
                                       } else {
                                           System.out.println("Nacionalidade inválida. O campo não pode ser vazio ou conter apenas números.");
                                       }
                                   }

                                   Diretor novoDiretor = new Diretor(nome, nascimento, nacionalidade);
                                   catalogo.cadastrarDiretor(novoDiretor);
                                   System.out.println("Diretor cadastrado.");
                                   break;
                               }
                               // Associar ator a filme
                                   case "8": {
                                       // Listar filmes para seleção
                                       List<Filme> filmes = catalogo.listarFilmes();
                                       if (filmes.isEmpty()) {
                                           System.out.println("Nenhum filme cadastrado para associar.");
                                           break;
                                       }

                                       System.out.println("\nEscolha um filme da lista:");
                                       for (int i = 0; i < filmes.size(); i++) {
                                           System.out.println((i + 1) + "- " + filmes.get(i).getTitulo());
                                       }

                                       Filme filmeEscolhido = null;
                                       while (filmeEscolhido == null) {
                                           System.out.print("Digite o número do filme: ");
                                           try {
                                               int filmeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                                               if (filmeIndex >= 0 && filmeIndex < filmes.size()) {
                                                   filmeEscolhido = filmes.get(filmeIndex);
                                               } else {
                                                   System.out.println("Número inválido. Tente novamente.");
                                               }
                                           } catch (NumberFormatException e) {
                                               System.out.println("Entrada inválida. Por favor, digite um número.");
                                           }
                                       }

                                       // Listar atores para seleção
                                       List<Ator> atores = catalogo.listarAtores();
                                       if (atores.isEmpty()) {
                                           System.out.println("Nenhum ator cadastrado para associar.");
                                           break;
                                       }

                                       System.out.println("\nEscolha um ator da lista:");
                                       for (int i = 0; i < atores.size(); i++) {
                                           System.out.println((i + 1) + "- " + atores.get(i).getNome());
                                       }

                                       Ator atorEscolhido = null;
                                       while (atorEscolhido == null) {
                                           System.out.print("Digite o número do ator: ");
                                           try {
                                               int atorIndex = Integer.parseInt(scanner.nextLine()) - 1;
                                               if (atorIndex >= 0 && atorIndex < atores.size()) {
                                                   atorEscolhido = atores.get(atorIndex);
                                               } else {
                                                   System.out.println("Número inválido. Tente novamente.");
                                               }
                                           } catch (NumberFormatException e) {
                                               System.out.println("Entrada inválida. Por favor, digite um número.");
                                           }
                                       }

                                       // Associar e confirmar
                                       catalogo.associarAtorFilme(filmeEscolhido, atorEscolhido);
                                       System.out.println("Ator '" + atorEscolhido.getNome() + "' associado ao filme '" + filmeEscolhido.getTitulo() + "'.");
                                       break;
                                   }
                                   // Associar diretor a filme
                                   case "9": {
                                       // Listar filmes para seleção
                                       List<Filme> filmes = catalogo.listarFilmes();
                                       if (filmes.isEmpty()) {
                                           System.out.println("Nenhum filme cadastrado para associar.");
                                           break;
                                       }

                                       System.out.println("\nEscolha um filme da lista:");
                                       for (int i = 0; i < filmes.size(); i++) {
                                           System.out.println((i + 1) + "- " + filmes.get(i).getTitulo());
                                       }

                                       Filme filmeEscolhido = null;
                                       while (filmeEscolhido == null) {
                                           System.out.print("Digite o número do filme: ");
                                           try {
                                               int filmeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                                               if (filmeIndex >= 0 && filmeIndex < filmes.size()) {
                                                   filmeEscolhido = filmes.get(filmeIndex);
                                               } else {
                                                   System.out.println("Número inválido. Tente novamente.");
                                               }
                                           } catch (NumberFormatException e) {
                                               System.out.println("Entrada inválida. Por favor, digite um número.");
                                           }
                                       }

                                       // Listar diretores para seleção
                                       List<Diretor> diretores = catalogo.listarDiretores();
                                       if (diretores.isEmpty()) {
                                           System.out.println("Nenhum diretor cadastrado para associar.");
                                           break;
                                       }

                                       System.out.println("\nEscolha um diretor da lista:");
                                       for (int i = 0; i < diretores.size(); i++) {
                                           System.out.println((i + 1) + "- " + diretores.get(i).getNome());
                                       }

                                       Diretor diretorEscolhido = null;
                                       while (diretorEscolhido == null) {
                                           System.out.print("Digite o número do diretor: ");
                                           try {
                                               int diretorIndex = Integer.parseInt(scanner.nextLine()) - 1;
                                               if (diretorIndex >= 0 && diretorIndex < diretores.size()) {
                                                   diretorEscolhido = diretores.get(diretorIndex);
                                               } else {
                                                   System.out.println("Número inválido. Tente novamente.");
                                               }
                                           } catch (NumberFormatException e) {
                                               System.out.println("Entrada inválida. Por favor, digite um número.");
                                           }
                                       }

                                       // Associar e confirmar
                                       catalogo.associarDiretorFilme(filmeEscolhido, diretorEscolhido);
                                       System.out.println("Diretor '" + diretorEscolhido.getNome() + "' associado ao filme '" + filmeEscolhido.getTitulo() + "'.");
                                       break;
                                   }
                                   // Sair do programa
                                   case "10":
                                       System.out.println("Volte sempre!");
                                       scanner.close();
                                       return;
                                   default:
                                       System.out.println("Opção inválida!");
                                       break;
                           }
                   }
           }
   }
