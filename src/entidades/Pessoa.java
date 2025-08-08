package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa
//superclass de Atores e Diretores ( Têm em comum em outras classes)
{
    protected String nome;
    protected LocalDate nascimento;
    protected String biografia;

    public Pessoa(String nome, LocalDate nascimento, String biografia) {
       this.nome= nome;
       this.nascimento= nascimento;
       this.biografia= biografia;
    }
     //getter para acessar o nome, mas sem poder modificar
    public String getNome() {
        return nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public String getBiografia() {
        return biografia;
    }
    // Override pra sobrescrever o toString que vêm da classe objeto (nativa do java)
    @Override
    public String toString() {
        return nome;
    }
    public String exibirDetalhes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        String detalhes = "Nome: " + nome + "\n" +
        "Nascimento: " + nascimento.format(formatador) + "\n" +
        "Biografia: " + biografia;

        return detalhes;}
}
