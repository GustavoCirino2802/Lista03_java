package br.edu.up;
import br.edu.up.modelos.ConsumoMedio;

public class Exercicio2 {

    public static void executar(){

        Double distPerc = Prompt.lerDecimal("Digite a distância percorrida em KM: ");
        Double combGasto = Prompt.lerDecimal("Digite o combustível gasto: ");

        ConsumoMedio consMedio = new ConsumoMedio(distPerc, combGasto);

        Prompt.separador();
        Prompt.imprimir("A Distância percorrida é: " + consMedio.getdistPerc());
        Prompt.imprimir("O Combustível gasto foi: " + consMedio.getcombGasto());
        Prompt.imprimir("O Consumo médio foi: " + consMedio.getCalcConsumoMedio() + " km/l");
        Prompt.separador();
    }

}
