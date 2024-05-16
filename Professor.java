package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinas;

    public Professor() {
        this.disciplinas = new ArrayList<>();
    }

    public void ministrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void lancarNota(Aluno aluno, Avaliacao avaliacao, double nota) {
        avaliacao.setNota(aluno, nota);
    }



    public void lancarFrequencia(Aluno aluno1, boolean presenca) {
    }
}
