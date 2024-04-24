package br.edu.up;
import br.edu.up.modelos.Num;

public class Exercicio9 {
    public static void executar() {
        Double[] numeros = new Double[80];
        Num num = new Num(numeros, 0);
        Integer quantidade = num.getcalcQntdNum();
        Prompt.imprimir("A quantidade de números no intervalo entre 10 e 150 é: " + quantidade);
    }
}
