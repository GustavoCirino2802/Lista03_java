package br.edu.up.modelos;

public class Empresa {
    private Funcionario[] funcionarios;

    public Empresa(int numFuncionarios) {
        funcionarios = new Funcionario[numFuncionarios];
    }

    public void reajusteSalarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.reajusteSalario();
        }
    }

    public void adicionarFuncionario(Funcionario funcionario, int index) {
        funcionarios[index] = funcionario;
    }
}