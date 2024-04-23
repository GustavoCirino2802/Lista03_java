package br.edu.up;
import br.edu.up.modelos.LojaMamaoAcucar;

public class Exercicio5 {

    public static void executar(){

        Double vlrCompra = Prompt.lerDecimal("Digite o valor da sua compra: ");
        Integer prestacoes = Prompt.lerInteiro("Digite quantas parcelas vai querer (max 5): ");

        if(prestacoes > 5 ){
            Prompt.imprimir("Número de parcelas excedente (max 5): ");
        }

        LojaMamaoAcucar loja = new LojaMamaoAcucar(prestacoes, vlrCompra);

        Prompt.separador();
        Prompt.imprimir("O Valor da compra foi: " + loja.getvlrCompra());
        Prompt.imprimir("A Quantidade de parcelas digitadas foi: " + prestacoes);
        for(int i = 0 ; i < prestacoes; i++){
        Prompt.imprimir("O Valor da prestação " + (i + 1) + " é:" + loja.getcalcPrestacoes());
        }
        Prompt.separador();

    }

}
