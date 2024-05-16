package Faculdade;

import java.util.HashMap;
import java.util.Map;

public class Avaliacao {
    private String nome;
    private Map<Aluno, Double> notas;

    public Avaliacao(String nome) {
        this.nome = nome;
        this.notas = new HashMap<>();
    }

    public void setNota(Aluno aluno, double nota) {
        notas.put(aluno, nota);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

}
