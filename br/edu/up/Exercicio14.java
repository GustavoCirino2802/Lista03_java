package br.edu.up;
import br.edu.up.modelos.Produto;


public class Exercicio14 {
    public static void executar() {
        int numProdutos = 40;
        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;

        for (int i = 0; i < numProdutos; i++) {
            double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto " + (i + 1) + ":");
            double precoVenda = Prompt.lerDecimal("Digite o preço de venda do produto " + (i + 1) + ":");

            Produto produto = new Produto(precoCusto, precoVenda);
            String resultado = produto.getResultado();

            totalPrecoCusto += precoCusto;
            totalPrecoVenda += precoVenda;

            Prompt.imprimir("Resultado para o produto " + (i + 1) + ": " + resultado);
        }

        double mediaPrecoCusto = totalPrecoCusto / numProdutos;
        double mediaPrecoVenda = totalPrecoVenda / numProdutos;

        Prompt.imprimir("Média do preço de custo: " + mediaPrecoCusto);
        Prompt.imprimir("Média do preço de venda: " + mediaPrecoVenda);
    }
}