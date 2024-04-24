package br.edu.up.modelos;
import br.edu.up.Prompt;

public class Pessoa {
    private Integer[] idade = new Integer[5];

    public Pessoa (Integer[] idade){
        this.idade = idade;
    }

    public Integer[] getIdade() {
        return idade;
    }

    public void verificaMaioridade() {
        for (int i = 0; i < idade.length; i++) {
            idade[i] = Prompt.lerInteiro("Digite a idade da pessoa " + (i+1) + ": ");
            if (idade[i] >= 18) {
                Prompt.imprimir("A pessoa de idade " + idade[i] + " é maior de idade.");
            } else {
                Prompt.imprimir("A pessoa de idade " + idade[i] + " é menor de idade.");
            }
        }
    }
}
