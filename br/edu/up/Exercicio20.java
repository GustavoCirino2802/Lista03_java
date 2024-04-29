package br.edu.up;
import br.edu.up.modelos.Escola;

public class Exercicio20 {
    public static void executar(){
        Escola escola = new Escola();

        escola.setNivel(Prompt.lerInteiro("Digite o nivel do Professor (1/2/3): "));
        escola.setHoraAula(Prompt.lerDecimal("Digite o número de hora/aula: "));

        Prompt.imprimir("O salario desse professor: " + escola.calcularSalarioProfessor());

    }
}