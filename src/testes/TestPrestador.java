package testes;

import dados.Atendimento;
import dados.Prestador;
import dados.Tutor;
import dados.Veterinario;
import junit.framework.TestCase;

import java.time.Instant;
import java.util.Date;

public class TestPrestador extends TestCase {

    public void testNomeNulo() {
        Prestador p = new Prestador("Joao da Silva");
        assertEquals("Joao da Silva", p.getNome());
    }

    public void testMarcarHorario() {
        Tutor t = new Tutor("Joao da Silva");
        Date d = Date.from(Instant.parse("2024-02-12T10:15:30Z"));
        Atendimento a = new Atendimento(t, d);
        Prestador p = new Veterinario("Joao da Silva");

        p.adicionarHorarioLivre(d);
        p.marcarHorario(a);

        assertTrue(p.getHorariosLivres().isEmpty());
        assertTrue(p.getAtendimentos().contains(a));
    }

    public void testCancelarHorario() {
        Tutor t = new Tutor("Joao da Silva");
        Date d = Date.from(Instant.parse("2024-02-12T10:15:30Z"));
        Atendimento a = new Atendimento(t, d);
        Prestador p = new Veterinario("Pedro da Silva");

        p.adicionarHorarioLivre(d);
        p.marcarHorario(a);
        p.cancelarHorario(t, d);

        assertFalse(p.getHorariosLivres().isEmpty());
        assertTrue(p.getAtendimentos().isEmpty());
    }
}
