package testes;

import dados.Item;
import junit.framework.TestCase;

public class TestItem extends TestCase {

    public void testNomeNulo() {
        Item i = new Item(1, "item_1", "descricao", 10);
        assertEquals("item_1", i.getNome());
    }

    public void testPreco() {
        Item i = new Item(1, "item_1", "descricao", 10);
        assertTrue(i.getValor() > 0);
    }
}
