
package entidades;

import java.time.LocalDate;

public class Ator extends Pessoa {
    public Ator(String nome, LocalDate nascimento, String nacionalidade) {
        super(nome, nascimento, nacionalidade);
    }
    @Override
    public String toString() { return "Ator: " + super.toString();
    }
}
