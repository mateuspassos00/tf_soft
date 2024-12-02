package dados;

import java.util.ArrayList;

public class Tutor {
    private String nome;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Tutor(String nome, ArrayList<Pedido> pedidos) {
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public Tutor(String nome) {
        this.nome = nome;
    }

    public Tutor() {
    }

    public void removerPedido(Pedido p) {
        pedidos.remove(p);
    }

    public void adicionarPedido(Pedido p) {
        pedidos.add(p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
