package br.edu.up;
import br.edu.up.modelos.*;


public class Exercicio16 {
     public static void executar(){

        Empresa empresa = new Empresa(256);

        for (int i = 0; i < 256; i++) {
            double salario = Prompt.lerDecimal("Digite o salário do funcionário " + (i + 1) + ":");
            Funcionario funcionario = new Funcionario(salario);
            empresa.adicionarFuncionario(funcionario, i);
        }

        empresa.reajusteSalarios();
    }
}