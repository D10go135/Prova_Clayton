package Faculdade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
    private String nome;
    private List<Avaliacao> avaliacoes;
    private Map<Aluno, Integer> frequenciaAlunos;

    public Disciplina(String nome) {
        this.nome = nome;
        this.avaliacoes = new ArrayList<>();
        this.frequenciaAlunos = new HashMap<>();
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }


}
