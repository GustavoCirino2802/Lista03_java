package br.edu.up;
import br.edu.up.modelos.Estudante;

public class Exercicio24 {
    public static void executar(){
        Estudante nota = new Estudante();

        Prompt.imprimir("Digite a nota do Trabalho de Laboratório, da Avaliação Semestral e a do Exame final:");
        for(int i = 0; i < 3; i ++ ){
            nota.getNota()[i] = Prompt.lerDecimal("Nota " + (i+1) + ":");
        }

        Prompt.imprimir("Media ponderada do aluno: " + nota.calcularMedia());
    }
}