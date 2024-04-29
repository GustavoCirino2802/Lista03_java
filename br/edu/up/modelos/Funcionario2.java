package br.edu.up.modelos;

public class Funcionario2 {
    private String nome;
    private int idade;
    private char sexo;
    private double salario;

    public Funcionario2(String nome, int idade, char sexo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularAbono() {
        if (sexo == 'M') {
            if (idade >= 30) {
                return 100.00;
            } else {
                return 50.00;
            }
        } else if (sexo == 'F'){     
            if (idade >= 30) {
                return 200.00;
            } else {
                return 80.00;
            }
        } else {
            
            return 0.0;
        }
    }

    public double calcularSalarioLiquido() {
        return salario + calcularAbono();
    }
}