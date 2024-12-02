package dados;

import java.util.ArrayList;
import java.util.Date;

public class Prestador {
    private String nome;
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();
    private ArrayList<Date> horariosLivres = new ArrayList<>();

    public Prestador(String nome) {
        this.nome = nome;
    }

    public Prestador(String nome, ArrayList<Atendimento> atendimentos, ArrayList<Date> horariosLivres) {
        this.nome = nome;
        this.atendimentos = atendimentos;
        this.horariosLivres = horariosLivres;
    }

    public Prestador(String nome, Atendimento atendimento, Date horarioLivre) {
        this.nome = nome;
        this.atendimentos.add(atendimento);
        this.horariosLivres.add(horarioLivre);
    }

    public Prestador(String nome, ArrayList<Date> horariosLivres) {
        this.nome = nome;
        this.horariosLivres = horariosLivres;
    }

    public void marcarHorario(Atendimento atendimento) {
        for(Date date : horariosLivres) {
            if(atendimento.getData().equals(date)) {horariosLivres.remove(date); break;}
        }
        this.atendimentos.add(atendimento);
    }

    public void cancelarHorario(Tutor t, Date data) {
        for (Atendimento atendimento : atendimentos) {
            if (atendimento.getTutor().equals(t) && atendimento.getData().equals(data)) {
                atendimentos.remove(atendimento);
                break;
            }
        }
        adicionarHorarioLivre(data);
    }

    public void adicionarHorarioLivre(Date horarioLivre) {
        this.horariosLivres.add(horarioLivre);
    }

    public void adicionarHorariosLivres(ArrayList<Date> horariosLivres) {
        this.horariosLivres = horariosLivres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    public ArrayList<Date> getHorariosLivres() {
        return horariosLivres;
    }

    public void setHorariosLivres(ArrayList<Date> horariosLivres) {
        this.horariosLivres = horariosLivres;
    }
}
