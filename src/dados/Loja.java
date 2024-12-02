package dados;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Item> itens = new ArrayList();

    public Loja() {}

    public Loja(String nome, ArrayList<Item> itens) {
        this.nome = nome;
        this.itens = itens;
    }

    public Loja(String nome, Item item) {
        this.nome = nome;
        this.itens.add(item);
    }

    public void adicionarItens(ArrayList<Item> itens) {
        this.itens.addAll(itens);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItens(ArrayList<Item> itens) {
        for(Item item_r : itens) {
            for(Item item : this.itens) {
                if(item.equals(item_r)) {
                    this.itens.remove(item);
                }
            }
        }
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
