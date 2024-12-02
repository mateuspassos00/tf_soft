package dados;

import java.util.ArrayList;
import java.util.Date;

public class Passeio extends Prestador {
    public Passeio(String nome) {
        super(nome);
    }

    public Passeio(String nome, Atendimento atendimento, Date horarioLivre) {
        super(nome, atendimento, horarioLivre);
    }

    public Passeio(String nome, ArrayList<Date> horariosLivres) {
        super(nome, horariosLivres);
    }
}
