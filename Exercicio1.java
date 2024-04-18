import modelos.Aluno;

public class Exercicio1 {

    public static void executar() {
        String nome = Prompt.lerLinha("Digite o seu nome: ");
        Double[] notas = new Double[3];

        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1)  + ": ");
        }

        Aluno aluno = new Aluno(nome, notas);

        Prompt.separador();
        Prompt.imprimir("Nome do aluno: " + aluno.getnome());
        Prompt.imprimir("Nota Final: " + aluno.getnotaFinal());
        Prompt.separador();
    }
}

