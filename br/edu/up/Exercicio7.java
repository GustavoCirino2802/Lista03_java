package br.edu.up;
import br.edu.up.modelos.Concessionaria;

public class Exercicio7 {
    public static void executar(){

        Double custoFab = Prompt.lerDecimal("Digite o custo de fabricação do carro: ");
        Double impostos = 0.45;
        Double distribuidor = 0.28;

        Concessionaria concessionaria = new Concessionaria(custoFab, impostos, distribuidor);

        Prompt.separador();
        Prompt.imprimir("O Custo de fabricação do carro é: R$ " + concessionaria.getcustoFab());
        Prompt.imprimir("O Custo final do veículo é: R$ " + concessionaria.getcalcCarroNovo());
        Prompt.separador();

    }
}
