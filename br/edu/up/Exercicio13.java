package br.edu.up;
import br.edu.up.modelos.Militar;

public class Exercicio13 {
    public static void executar() {
        Prompt.imprimir("Digite o número de pessoas:");
        int N = Prompt.lerInteiro();
        int totalApto = 0;

        for (int i = 0; i < N; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa:");
            String sexo = Prompt.lerLinha("Digite o sexo da pessoa:");
            int idade = Prompt.lerInteiro("Digite a idade da pessoa:");
            String saude = Prompt.lerLinha("Digite a saúde da pessoa:");

            Militar pessoa = new Militar(nome, sexo, idade, saude);
            if (pessoa.verificarAptidaoParaServicoMilitar()) {
                totalApto++;
            }
        }

        Prompt.imprimir("Total de pessoas aptas para o serviço militar: " + totalApto);
    }
}