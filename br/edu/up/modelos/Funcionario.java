package br.edu.up.modelos;

public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void reajusteSalario() {
        if (salario < 3) {
            salario += salario * 0.5;
        } else if (salario >= 3 && salario <= 10) {
            salario += salario * 0.2;
        } else if (salario > 10 && salario <= 20) {
            salario += salario * 0.15;
        } else {
            salario += salario * 0.1;
        }
    }
}