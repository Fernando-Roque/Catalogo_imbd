<h1 align="center" style="font-weight: bold;">Catalogo_imbd 💻</h1>

<h2 align="left" style="font-weight: bold"; >✏️ Desenvolva um sistema que apresente um catálogo de filmes, similar ao IMDB.</h2>

🎥 Neste sistema cada filme deve possuir alguns atributos como o nome, data de lançamento, orçamento e descrição.

Cada filme também deve possuir um diretor e uma lista de atores que trabalharam no filme, adicione atributos para as pessoas. Implemente uma aplicação em que o usuário possa:

    ●​ cadastrar filmes
    ●​ cadastrar atores
    ●​ cadastrar diretores
    ●​ associar um filme com seus atores e diretores
    ●​ permita pesquisar filme cadastrados pelo nome, desconsiderando letras maiúsculas e minúsculas
    ●​ Utilize os conceitos de programação orientada a objetos vistos nas aulas como encapsulamento, herança, polimorfismos e classes abstratas.

O projeto será desenvolvido em grupos de até 4 integrantes, a entrega será feita via repositório GIT. A avaliação será feita considerando os commits individuais, portanto é importante que todos colaborem no desenvolvimento do projeto.

<h2 align="left" style="font-weight: bold;"> Tecnologias Utilizadas 💻</h2>

[JAVA_BADGE]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

![java][JAVA_BADGE]

<h2 align="left" style="font-weight: bold;">🔧  Melhorias futuras: 👩‍🔧 👨‍🔧</h2>

- **[ ]** Anexar comentários que ajudem a explicar o código.
- **[ ]** Implementar as funcionalidades de Excluir (Filme, Ator e Diretor).
- **[ ]** Verificar a função cadastrar Filmes, atores e Diretores.
- **[ ]** Montar a Apresentação do projeto.
- **[ ]** Estilizar as saídas do Usuário.
- **[ ]** Achar e corrigir possíveis erros.

<h2 align="left" style="font-weight: bold;">📫 Executar o projeto </h2>

- Em sistema Mac é Linux: garanta estar com o terminal aberto na pasta do arquivo `Main.java`, após execute `javac Main.java` em seguida `java Main`.

- Em Sistemas Windons: Abra o CMD ou o Bash garanta estar na pasta do arquivo `Main.java`, após execute `javac Main.java` em seguida `java Main`.

<h2 align="left" style="font-weight: bold;">📫 Contribuidores</h2>

1. [Ana](https://github.com/AnaVianaCPV)
Contribução nas Classe abstrata Pessoa com nome, nascimento e nacionalidade. Metódo pra exibir detalhes e formatar saida. toString () e exibirDetalhes. (Herança e encapsulamento)
Classes Ator e Diretor que herdam da superclass abstrata pessoas que sobrescrevem o método toString() pra diferenciar as saídas. 
E ajudei a desenvolver swich-case que gerencia as opções do usuário, permitindo listar, cadastrar e associar filmes, atores e diretores.


3. [Fernando](https://github.com/Fernando-Roque)
Contribuição: Criou a estrutura principal do Main, implementando a lógica do laço de repetição  para manter o menu ativo, configurou a leitura de dados com Scanner. Também fez a integração inicial com o CatalogoFilmes e criou as primeiras chamadas de métodos de cadastro, listagem e pesquisa, servindo como ponto de partida para as implementações detalhadas nos case.

4. [Marcela](https://github.com/MDrovetto)
Contribuição Realizou testes, verificou bugs e sugeriu melhorias para aumentar a qualidade do código.
 Adicionei também validação de entrada para nomes e datas (aceitando apenas caracteres permitidos) e mudou a forma de associar ator/diretor ao filme: em vez de digitar manualmente, o sistema mostra a lista existente para escolha, evitando erros e duplicações.

5. [Thamily](https://github.com/thamilyr)
 Contribuição com a classe Filme, definindo os atributos, métodos de acesso, formatação da saída e as regras para adicionar atores e diretores. Também implementou o CatalogoFilmes, que gerencia as listas de filmes, atores e diretores, e contém a lógica para cadastrar, listar, associar e pesquisar filmes.
