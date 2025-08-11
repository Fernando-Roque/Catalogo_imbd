package entidades;

import java.util.List;

public class Filme {

    private String titulo;
    private int ano;
    private Diretor diretor;
    private List<Ator> elenco;

    public Filme(String titulo, int ano, Diretor diretor, List<Ator> elenco) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public List<Ator> getElenco() {
        return elenco;
    }

    public String exibirDetalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Ano: ").append(ano).append("\n");
        sb.append("Diretor: ").append(diretor.getNome()).append("\n");
        sb.append("Elenco:\n");
        for (Ator ator : elenco) {
            sb.append(" - ").append(ator.getNome()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return titulo + " (" + ano + ")";
    }
}
