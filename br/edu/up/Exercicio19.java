package br.edu.up;
import br.edu.up.modelos.Triangulo;


public class Exercicio19 {
    public static void executar(){

        Triangulo triangulo = new Triangulo();

        triangulo.setl1(Prompt.lerDecimal("O Valor do primeiro lado é: "));
        triangulo.setl2(Prompt.lerDecimal("O Valor do segundo lado é:"));
        triangulo.setl3(Prompt.lerDecimal("O Valor do terceiro lado é:"));

        double l1 = triangulo.getl1();
        double l2 = triangulo.getl2();
        double l3 = triangulo.getl3();


        if((l1 +l2>l3) && (l1+l3>l2) && (l2+l3>l1)){

            Prompt.imprimir("é um triângulo: ");

            if (l1==l2 && l2==l3) {
                Prompt.imprimir("Equilátero");
            } else if (l1==l2 || l1==l3 || l2==l3) {
                Prompt.imprimir("Isósceles");
            } else {
                Prompt.imprimir("Escaleno");
            }


        } 
    }
}