package negocio;

import dados.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Sistema {
    ArrayList<Loja> lojas;
    ArrayList<Prestador> prestadores;
    ArrayList<Tutor> tutores;
    Sistema instance = null;

    private Sistema () {
        lojas = new ArrayList();
        prestadores = new ArrayList();
        tutores = new ArrayList();
    }

    public Sistema getInstance() {
        if(instance == null) {
            instance = new Sistema();
        }
        return instance;
    }

    public ArrayList<Date> consultarHorariosLivres(Prestador p) {
        return p.getHorariosLivres();
    }

    public void cancelarHorario(Prestador p, Tutor t, Date data) {
        p.cancelarHorario(t, data);
    }

    public void marcarHorario(Prestador p, Tutor t, Date data) {
        p.marcarHorario(new Atendimento(t, data));
    }

    public ArrayList<Prestador> consultarServicos() {
        return prestadores;
    }

    public ArrayList<Item> consultaItens(Loja loja) {
        return loja.getItens();
    }

    public void cancelarPedido(Tutor tutor, Loja loja, Pedido pedido) {
        tutor.removerPedido(pedido);
        loja.adicionarItens(pedido.getItens());
    }

    public void cadastrarItens(Loja loja, ArrayList<Item> itens) {
        loja.adicionarItens(itens);
    }

    public void fazerPedido(Tutor tutor, Loja loja, ArrayList<Item> itens) {
        Pedido pedido = new Pedido(Date.from(Instant.now()), itens);
        tutor.adicionarPedido(pedido);
        loja.removerItens(itens);
    }

    public void cadastrarLoja(Loja loja) {
        lojas.add(loja);
    }

    public void cadastrarTutor(Tutor tutor) {
        tutores.add(tutor);
    }

    public void cadastrarPrestador(Prestador prestador) {
        prestadores.add(prestador);
    }


}
