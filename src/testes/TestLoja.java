package testes;

import dados.Item;
import dados.Loja;
import junit.framework.TestCase;

import java.util.ArrayList;

public class TestLoja extends TestCase {

    public void testNomeNulo() {
        Item i = new Item(1, "item_1", "descricao", 10);
        Loja l = new Loja("Loja_1", i);
        assertEquals("Loja_1", l.getNome());
    }

    public void testAdicionarItens() {
        ArrayList<Item> itens = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            itens.add(new Item(i + 1, "item_" + (i + 1), "descricao_" + (i + 1), i + 1));
        }
        Loja l = new Loja("Loja_1", itens);
        l.adicionarItens(itens);

        assertEquals(itens.size(), l.getItens().size());
    }

    public void testRemoverItem() {
        Item i = new Item(1, "item_1", "descricao", 10);
        Loja l = new Loja("Loja_1", i);
        l.removerItem(i);

        assertEquals(0, l.getItens().size());
    }
}
