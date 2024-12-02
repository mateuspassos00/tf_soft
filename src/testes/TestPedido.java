package testes;

import dados.Item;
import dados.Pedido;
import junit.framework.TestCase;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class TestPedido extends TestCase{

    public void testQuantidade() {
        Item i = new Item(1, "item_1", "descricao", 10);
        Pedido p = new Pedido(Date.from(Instant.now()), i);
        assertFalse(p.getItens().isEmpty());
    }

    public void testPreco() {
        ArrayList<Item> itens = new ArrayList<>();
        float total = 0;
        for(int i = 0; i < 5; i++){
            itens.add(new Item(i + 1, "item_" + (i + 1), "descricao_" + (i + 1), i + 1));
            total += (i+1);
        }

        Pedido p = new Pedido(Date.from(Instant.now()), itens);
        assertEquals(p.getTotal(), total);
    }
}
