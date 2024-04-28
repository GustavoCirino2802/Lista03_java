package br.edu.up;
import br.edu.up.modelos.Carango;

public class Exercicio15 {
    public static void executar() {
        while (true) {
            double valorVeiculo = Prompt.lerDecimal("Digite o valor do veículo ou 0 para sair: ");
            if (valorVeiculo == 0) {
                break;
            }
            String tipoCombustivel = Prompt.lerLinha("Digite o tipo de combustível (alcool, gasolina, diesel): ");
            Carango carango = new Carango(valorVeiculo, tipoCombustivel);
            Prompt.imprimir("Valor do desconto: " + carango.getDesconto());
            Prompt.imprimir("Valor a ser pago pelo cliente: " + carango.getValorAPagar());
        }
    }
}