package br.edu.up.modelos;

public class Carango {
    private double valorVeiculo;
    private String tipoCombustivel;

    public Carango(double valorVeiculo, String tipoCombustivel) {
        this.valorVeiculo = valorVeiculo;
        this.tipoCombustivel = tipoCombustivel;
    }

    private double calcularDesconto() {
        switch (tipoCombustivel.toLowerCase()) {
            case "alcool":
                return valorVeiculo * 0.25;
            case "gasolina":
                return valorVeiculo * 0.21;
            case "diesel":
                return valorVeiculo * 0.14;
            default:
                return 0.0;
        }
    }

    private double valorAPagar() {
        return valorVeiculo - calcularDesconto();
    }

    public double getDesconto() {
        return calcularDesconto();
    }

    public double getValorAPagar() {
        return valorAPagar();
    }
}