package br.edu.up;
import br.edu.up.modelos.Conversao;

public class Exercicio4 {

    public static void executar(){

    Double quantDolar =  Prompt.lerDecimal("Digite quantos doláres você quer converter: ");
    Double cotacao = Prompt.lerDecimal("Digite quanto esta a  cotação de dólar => real: ");

    Conversao conversao = new Conversao(cotacao, quantDolar, cotacao);

    Prompt.separador();
    Prompt.imprimir("Você tem " + conversao.getquantDolar() + " doláres");
    Prompt.imprimir("A Cotação de conversão é de "  + conversao.getcotacao());
    Prompt.imprimir(+ conversao.getquantDolar() +  " dólares em real é: " + conversao.getcalcQuantReal() + " R$");
    Prompt.separador();
    }

}
