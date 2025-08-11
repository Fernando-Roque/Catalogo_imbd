package entidades;

import java.util.List;

public class CatalogoFilmes {

    private CadastrarAtores cadastroAtores;
    private CadastrarDiretores cadastroDiretores;
    private CadastrarFilmes cadastroFilmes;

    public CatalogoFilmes() {
        cadastroAtores = new CadastrarAtores();
        cadastroDiretores = new CadastrarDiretores();
        cadastroFilmes = new CadastrarFilmes();
    }

    public void adicionarAtor(Ator ator) {
        cadastroAtores.adicionarAtor(ator);
    }

    public void adicionarDiretor(Diretor diretor) {
        cadastroDiretores.adicionarDiretor(diretor);
    }

    public void adicionarFilme(Filme filme) {
        cadastroFilmes.adicionarFilme(filme);
    }

    public List<Ator> listarAtores() {
        return cadastroAtores.listarAtores();
    }

    public List<Diretor> listarDiretores() {
        return cadastroDiretores.listarDiretores();
    }

    public List<Filme> listarFilmes() {
        return cadastroFilmes.listarFilmes();
    }
}
