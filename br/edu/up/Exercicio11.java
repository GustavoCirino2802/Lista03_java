package br.edu.up;
import br.edu.up.modelos.Genero;

public class Exercicio11 {

    public static void executar(){
        Genero[] pessoas = new Genero[56];
        int contHomens = 0, contMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i+1) + ": ");
            String sexo = Prompt.lerLinha("Digite o sexo da pessoa " + (i+1) + " (M para masculino, F para feminino): ");
            pessoas[i] = new Genero(nome, sexo);

            if (pessoas[i].getSexo().equalsIgnoreCase("M")) {
                contHomens++;
            } else if (pessoas[i].getSexo().equalsIgnoreCase("F")) {
                contMulheres++;
            }
        }

        for (Genero pessoa : pessoas) {
            String genero = pessoa.getSexo().equalsIgnoreCase("M") ? "homem" : "mulher";
            Prompt.imprimir("Nome: " + pessoa.getNome() + ", Sexo: " + genero);
        }

        Prompt.imprimir("Total de homens: " + contHomens);
        Prompt.imprimir("Total de mulheres: " + contMulheres);
    }
}
