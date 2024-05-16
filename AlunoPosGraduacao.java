package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class AlunoPosGraduacao extends Aluno {
    private List<Disciplina> disciplinas;
    private String trabalhoConclusaoCurso;

    public AlunoPosGraduacao() {
        this.disciplinas = new ArrayList<>();
    }

    @Override
    public void inscreverDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void solicitarBoleto() {
        System.out.println("Solicitando boleto para o aluno: " + this.getNome());
    }

    @Override
    public void solicitarHistorico() {
        System.out.println("Solicitando histórico para o aluno: " + this.getNome());
    }


    // Getters e Setters
    public String getTrabalhoConclusaoCurso() {
        return trabalhoConclusaoCurso;
    }

    public void setTrabalhoConclusaoCurso(String trabalhoConclusaoCurso) {
        this.trabalhoConclusaoCurso = trabalhoConclusaoCurso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}

