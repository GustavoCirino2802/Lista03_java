package br.edu.up.modelos;
import br.edu.up.Prompt;

public class Empresa1 {
    private Funcionario1[] funcionarios;

    public Empresa1(int numFuncionarios) {
        funcionarios = new Funcionario1[numFuncionarios];
    }

    public double reajusteSalarios() {
        double totalReajuste = 0;
        for (Funcionario1 funcionario : funcionarios) {
            double reajuste = funcionario.reajusteSalario();
            totalReajuste += reajuste;
            Prompt.imprimir("Nome do funcionário: " + funcionario.getNome());
            Prompt.imprimir("Reajuste: " + reajuste);
            Prompt.imprimir("Novo salário: " + funcionario.getSalario());
            Prompt.linhaEmBranco();
        }
        return totalReajuste;
    }

    public void adicionarFuncionario(Funcionario1 funcionario, int index) {
        funcionarios[index] = funcionario;
    }
}