package entidades;

import java.util.ArrayList;
import java.util.List;

public class CadastrarDiretores {

    private List<Diretor> diretores;

    public CadastrarDiretores() {
        this.diretores = new ArrayList<>();
    }

    public void adicionarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public List<Diretor> listarDiretores() {
        return diretores;
    }
}
