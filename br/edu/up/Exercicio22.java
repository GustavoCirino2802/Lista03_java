
package br.edu.up;

import br.edu.up.modelos.Luz;

public class Exercicio22 {
    public static void executar(){
        Luz conta = new Luz();

        conta.setTipoCliente(Prompt.lerInteiro("Digite 1 2 ou 3 para conta RESIDENCIAL, COMERCIAL, INDUSTRIAL, respectivamente"));
        conta.setConsumoLuz(Prompt.lerDecimal("Digite seu consumo de KW/h: "));

        Prompt.imprimir("O total a se pagar: " + conta.calcularContaLuz());
    }
}
