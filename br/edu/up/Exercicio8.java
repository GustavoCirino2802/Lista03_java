package br.edu.up;
import br.edu.up.modelos.Aluno;

public class Exercicio8 {

    public static void executar(){
        String nome = Prompt.lerLinha("Digite o seu nome: ");
        Double[] notas = new Double[3];

        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1)  + ": ");
        }

        Aluno aluno = new Aluno(nome, notas);

        Prompt.separador();
        Prompt.imprimir("Nome do aluno: " + aluno.getnome());
        Prompt.imprimir("Nota Final: " + aluno.getnotaFinal());
        if (aluno.getnotaFinal() <= 5) {
            Prompt.imprimir("REPROVADO!");
        }
        else if (aluno.getnotaFinal() >=5.1 && aluno.getnotaFinal() <= 6.9) {
            Prompt.imprimir("RECUPERAÇÃO!");
        }
        else if (aluno.getnotaFinal() >= 7) {
            Prompt.imprimir("APROVADO!");
            
        }     
        Prompt.separador();
    
    }
}
