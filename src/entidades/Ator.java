package entidades;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private String papelFamoso;

    public Ator(String nome, LocalDate nascimento, String biografia, String papelFamoso) {
        super(nome, nascimento, biografia);
        this.papelFamoso = papelFamoso;
    }

    public String getPapelFamoso() {
        return papelFamoso;
    }

    @Override
    public String toString() {
        return "Ator: " + nome;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nPapel famoso: " + papelFamoso;
    }
}
