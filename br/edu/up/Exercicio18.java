package br.edu.up;
import br.edu.up.modelos.Funcionario2;

public class Exercicio18 {
    public static void executar(){

    String nome = Prompt.lerLinha("Digite o nome do funcionário:");
        int idade = Prompt.lerInteiro("Digite a idade do funcionário:");
        char sexo = Prompt.lerCaractere("Digite o sexo do funcionário (M para masculino, F para feminino):");
        double salario = Prompt.lerDecimal("Digite o salário do funcionário:");

        Funcionario2 funcionario = new Funcionario2(nome, idade, sexo, salario);
        double salarioLiquido = funcionario.calcularSalarioLiquido();

        Prompt.imprimir("Nome do funcionário: " + funcionario.getNome());
        Prompt.imprimir("Salário líquido: " + salarioLiquido);
    }
}

