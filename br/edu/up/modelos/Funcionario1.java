package br.edu.up.modelos;

public class Funcionario1 {
    private String nome;
    private double salario;
    private double salarioMinimo;

    public Funcionario1(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

   public double reajusteSalario() {
    double salarioAntigo = salario;
    if (salario < 3 * salarioMinimo) {
        salario += salario * 0.5;
    } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
        salario += salario * 0.2;
    } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
        salario += salario * 0.15;
    } else {
        salario += salario * 0.1;
    }
    return salario - salarioAntigo;
}
}