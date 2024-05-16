package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class AlunoGraduacao extends Aluno {
    private List<Disciplina> disciplinas;
    private String projetoIntegrador;

    public AlunoGraduacao() {
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
    public String getProjetoIntegrador() {
        return projetoIntegrador;
    }

    public void setProjetoIntegrador(String projetoIntegrador) {
        this.projetoIntegrador = projetoIntegrador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
