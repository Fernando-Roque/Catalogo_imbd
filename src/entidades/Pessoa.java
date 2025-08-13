
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa
//superclass de Atores e Diretores ( Têm em comum em outras classes)
{
    private static final DateTimeFormatter DATA =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

    protected String nome;
    protected LocalDate nascimento;
    protected String nacionalidade;

    public Pessoa(String nome, LocalDate nascimento, String nacionalidade)
    {
        this.nome = nome;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
    }
    //getter para acessar o nome, mas sem poder modificar

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    // Override pra sobrescrever o toString que vêm da classe objeto (nativa do java)
    @Override
    public String toString() {
        return nome + " (" + nacionalidade + ")";
    }

    public String exibirDetalhes() {


        String detalhes ="Nome: " + nome + "\n";

               detalhes +="Nascimento: " + nascimento.format(DATA) + "\n";

               detalhes +="Nacionalidade: " + nacionalidade;

        return detalhes;
    }
}
