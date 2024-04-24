package br.edu.up.modelos;

public class Genero {
    private String nome;
    private String sexo;

    public Genero(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
}