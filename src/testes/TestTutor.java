package testes;

import dados.Item;
import dados.Pedido;
import dados.Tutor;
import junit.framework.TestCase;

import java.time.Instant;
import java.util.Date;

public class TestTutor extends TestCase {

    public void testNomeNulo() {
        Tutor t = new Tutor("Joao da Silva");
        assertEquals("Joao da Silva", t.getNome());
    }

    public void testAdicionarPedido() {
        Tutor t = new Tutor("Joao da Silva");
        Item i = new Item(1, "item_1", "descricao", 10);
        Pedido p = new Pedido(Date.from(Instant.now()), i);

        t.adicionarPedido(p);
        assertTrue(t.getPedidos().contains(p));
    }
}
