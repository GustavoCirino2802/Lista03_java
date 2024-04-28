package br.edu.up;
import br.edu.up.modelos.Empresa1;
import br.edu.up.modelos.Funcionario1;

public class Exercicio17 {
public static void executar(){
Empresa1 empresa = new Empresa1(3);
        double salarioMinimo = Prompt.lerDecimal("Digite o valor do salário mínimo:");

        for (int i = 0; i < 3; i++) {
            String nome = Prompt.lerLinha("Digite o nome do funcionário " + (i + 1) + ":");
            double salario = Prompt.lerDecimal("Digite o salário do funcionário " + (i + 1) + ":");
            Funcionario1 funcionario = new Funcionario1(nome, salario, salarioMinimo);
            empresa.adicionarFuncionario(funcionario, i);
        }

        double totalReajuste = empresa.reajusteSalarios();
        Prompt.imprimir("O total de aumento na folha de pagamento é: " + totalReajuste);
    }
}

