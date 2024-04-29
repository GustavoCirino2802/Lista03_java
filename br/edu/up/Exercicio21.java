package br.edu.up;
import br.edu.up.modelos.Nadador;

public class Exercicio21 {
    public static void executar(){

        Nadador nadador = new Nadador();

        nadador.setIdade(Prompt.lerInteiro("Digite a idade do nadador: "));

        int idade = nadador.getIdade();

        if (idade >= 5 && idade <= 7) {
            Prompt.imprimir("Infantil A");

        } else if (idade >= 8 && idade <= 10) {
            Prompt.imprimir("Infantil B");

        } else if (idade >= 11 && idade <= 13) {
            Prompt.imprimir("Juvenil A");

        } else if (idade >= 14 && idade <= 17) {
            Prompt.imprimir("Juvenil B");

        } else if (idade >= 18 && idade <= 25) {
            Prompt.imprimir("Sênior");

        } else {
            Prompt.imprimir("Idade fora da faixa");
        }

    }

}