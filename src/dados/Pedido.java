package dados;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date data;
    private ArrayList<Item> itens = new ArrayList<>();
    private float total = 0;

    public Pedido(Date data, ArrayList<Item> itens) {
        this.data = data;
        this.itens = itens;
        this.calcularTotal();
    }

    public Pedido(Date data, Item item) {
        this.data = data;
        this.itens.add(item);
        this.calcularTotal();
    }

    public void calcularTotal() {
        for (Item item : itens) {
            total += item.getValor();
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
