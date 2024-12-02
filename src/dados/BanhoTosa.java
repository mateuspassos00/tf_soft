package dados;

import java.util.ArrayList;
import java.util.Date;

public class BanhoTosa extends Prestador {

    public BanhoTosa(String nome) {
        super(nome);
    }

    public BanhoTosa(String nome, ArrayList<Atendimento> atendimentos, ArrayList<Date> horariosLivres) {
        super(nome, atendimentos, horariosLivres);
    }

    public BanhoTosa(String nome, Atendimento atendimento, Date horarioLivre) {
        super(nome, atendimento, horarioLivre);
    }
}
