package br.edu.up;
import br.edu.up.modelos.Pessoa;

public class Exercicio10 {
    public static void executar() {
        Integer[] idades = new Integer[5]; 
        Pessoa pessoa = new Pessoa(idades);
        pessoa.verificaMaioridade();
    }
}
