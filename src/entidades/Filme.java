//Tamili
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class Filme {
    private String titulo;
    private LocalDate dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String titulo, LocalDate dataLancamento, double orcamento, String descricao) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.atores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    public void removerAtor(Ator ator) {
        atores.remove(ator);
    }

    @Override


    public String toString() {
        DateTimeFormatter DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFmt = (dataLancamento != null) ? dataLancamento.format(DATA) : "—";

        // Orçamento em USD
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String orcamentoFmt = nf.format(this.orcamento);

        // Diretor
        String nomeDiretor = (diretor != null) ? diretor.getNome() : "(sem diretor)";

        // Atores
        StringBuilder elenco = new StringBuilder();
        if (atores == null || atores.isEmpty()) {
            elenco.append("(sem elenco)");
        } else {
            for (int i = 0; i < atores.size(); i++) {
                elenco.append(atores.get(i).getNome());
                if (i < atores.size() - 1) elenco.append(", ");
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Filme: ").append(titulo != null ? titulo : "—")
                .append(" (").append(dataLancamento != null ? dataLancamento.getYear() : "____").append(")")
                .append("\nDiretor: ").append(nomeDiretor)
                .append("\nAtores: ").append(elenco)
                .append("\nLançamento: ").append(dataFmt)
                .append("\nOrçamento: ").append(orcamentoFmt)
                .append("\nDescrição: ").append(descricao != null ? descricao : "____")
                .append("\n");
        return sb.toString();
    }
}