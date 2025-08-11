package entidades;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int numeroDeFilmesDirigidos;

    public Diretor(String nome, LocalDate nascimento, String biografia, int numeroDeFilmesDirigidos) {
        super(nome, nascimento, biografia);
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
    }

    public int getNumeroDeFilmesDirigidos() {
        return numeroDeFilmesDirigidos;
    }

    @Override
    public String toString() {
        return "Diretor: " + nome;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nNúmero de filmes dirigidos: " + numeroDeFilmesDirigidos;
    }
}
