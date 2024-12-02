package dados;

import java.util.Date;

public class Atendimento {
    private Tutor tutor;
    private Date data;

    public Atendimento(Tutor tutor, Date data) {
        this.tutor = tutor;
        this.data = data;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
