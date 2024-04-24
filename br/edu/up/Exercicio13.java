package br.edu.up;
import br.edu.up.modelos.Militar;

public class Exercicio13 {
    public static void executar(){

        int x = Prompt.lerInteiro("Digite quantas pessoas vai querer ver: ");

        String[] nome = new String[x];
        Character[] sexo = new Character[x];

        for (int i = x; i <= x ; i++) {
        String nome = Prompt.lerLinha("Digite o seu nome: ");
        Character sexo = Prompt.lerCaractere("Digite seu sexo (M/F): ");
        }

        Militar militar = new Militar();

        Prompt.separador();
        Prompt.imprimir(militar);
        
        
    }

}
