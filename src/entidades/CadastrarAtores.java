package entidades;

import java.util.ArrayList;
import java.util.List;

public class CadastrarAtores {

    private List<Ator> atores;

    public CadastrarAtores() {
        this.atores = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    public List<Ator> listarAtores() {
        return atores;
    }
}
