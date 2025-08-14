// branch fernando 

//Tamili
package entidades;

import entidades.Ator;
import entidades.Diretor;
import entidades.Filme; 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoFilmes {
    private List<Filme> filmes;
    private List<Ator> atores;
    private List<Diretor> diretores;

    public CatalogoFilmes() {
        this.filmes = new ArrayList<>();
        this.atores = new ArrayList<>();
        this.diretores = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
    }

    public void cadastrarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public void associarDiretorFilme(Filme filme, Diretor diretor) {
        filme.setDiretor(diretor);
    }

    public void associarAtorFilme(Filme filme, Ator ator) {
        filme.adicionarAtor(ator);
    }

    public List<Filme> pesquisarFilmePorNome(String nome) {
        return filmes.stream()
                .filter(f -> f.getTitulo().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Filme> listarFilmes() {
        return this.filmes;
    }
    public List<Ator> listarAtores() {
        return this.atores;
    }

    public List<Diretor> listarDiretores() {
        return this.diretores;
    }
}