package br.edu.up.modelos;

public class Carro {

    private int ano;
    private double preco;

    public Carro(int ano, double preco) {
        this.ano = ano;
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return preco * 0.12;
        } else {
            return preco * 0.07;
        }
    }

    public double calcularPrecoComDesconto() {
        return preco - calcularDesconto();
    }
}



