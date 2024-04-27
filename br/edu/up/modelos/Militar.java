package br.edu.up.modelos;

public class Militar {
    private String nome;
    private String sexo;
    private int idade;
    private String saude;

    public Militar(String nome, String sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    private boolean isAptoParaServicoMilitar() {
        return sexo.equalsIgnoreCase("masculino") && idade >= 18 && idade <= 25 && saude.equalsIgnoreCase("boa");
    }

    public boolean verificarAptidaoParaServicoMilitar() {
        return isAptoParaServicoMilitar();
    }
}