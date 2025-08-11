package entidades;

import java.util.ArrayList;
import java.util.List;

public class CadastrarFilmes {

    private List<Filme> filmes;

    public CadastrarFilmes() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> listarFilmes() {
        return filmes;
    }
}
