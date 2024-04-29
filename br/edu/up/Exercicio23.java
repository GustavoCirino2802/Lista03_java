package br.edu.up;
import br.edu.up.modelos.Peso;

public class Exercicio23 {

    public static void executar(){

        Peso peso = new Peso();

        peso.setNome(Prompt.lerLinha("Digite o seu nome: "));
        peso.setAltura(Prompt.lerDecimal("Digite a sua altura: "));
        peso.setIdade(Prompt.lerInteiro("Digite a sua idade: "));
        peso.setSexo(Prompt.lerCaractere("Digite o seu sexo: "));

        String nome = peso.getNome();

        Prompt.imprimir("O peso ideal de "+nome + " é " +  peso.calculo());



    }

}