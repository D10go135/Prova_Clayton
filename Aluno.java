package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private List<Disciplina> disciplinasInscritas;

    // Construtor padrão
    public Aluno() {}

    // Construtor com nome
    public Aluno(String nome) {
        this.nome = nome;
    }
    public void inscreverDisciplina(Disciplina disciplina) {
        disciplinasInscritas.add(disciplina);
        System.out.println("O aluno " + getNome() + " foi inscrito na disciplina: " + disciplina.getNome());
    }
    


    public void solicitarBoleto() {
    }

    public void solicitarHistorico() {
    }
}
