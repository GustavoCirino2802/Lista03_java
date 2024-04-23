package br.edu.up.modelos;

public class Aluno {
    private String nome;
    private Double[] notas = new Double[3];

    public Aluno(String nome, Double[] notas){
    this.nome = nome;
    this.notas = notas;
    }

    public String getnome(){
        return nome;
    }
    
    private Double notaFinal() {
        double notaFinal = 0;
        for (int i = 0; i < 3; i++) {
            notaFinal += notas[i] / 3; 
        }
        return notaFinal;
    }

    public Double getnotaFinal(){
        return notaFinal();
    }
}
