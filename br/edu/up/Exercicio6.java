package br.edu.up;
import br.edu.up.modelos.Margem;

public class Exercicio6 {

    public static void executar(){
        
        Double precoCusto = Prompt.lerDecimal("Qual o preço de custo do produto: ");
        Double margemPercetual = Prompt.lerDecimal("Qual é a sua margem em (%): ");

        Margem margem = new Margem(precoCusto, margemPercetual);

        Prompt.separador();
        Prompt.imprimir("O Preco de custo do produto é: " + margem.getprecoCusto());
        Prompt.imprimir("A Sua margem é: " + margem.getmargem());
        Prompt.imprimir("O Valor final do produto é: " + margem.getcalcVlrVenda());
        Prompt.separador();

    }
}
