
package entidades;

import java.time.LocalDate;

public class Diretor extends Pessoa{

    public Diretor(String nome, LocalDate nascimento, String nacionalidade) {
        super (nome, nascimento, nacionalidade);
    }
    @Override

    public String toString () {
        return "Diretor: " + super.toString();
    }
}
