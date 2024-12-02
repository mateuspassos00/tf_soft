package dados;

import java.util.ArrayList;
import java.util.Date;

public class Veterinario extends Prestador {
    public Veterinario(String nome) {
        super(nome);
    }

    public Veterinario(String nome, ArrayList<Date> horariosLivres) {
        super(nome, horariosLivres);
    }

    public Veterinario(String nome, Atendimento atendimento, Date horarioLivre) {
        super(nome, atendimento, horarioLivre);
    }
}
