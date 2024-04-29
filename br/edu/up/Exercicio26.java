package br.edu.up;

import br.edu.up.modelos.Seguradora;

public class Exercicio26 {
    public static void executar(){
        Seguradora seguradora = new Seguradora();
        
        seguradora.setNome(Prompt.lerLinha("Digite seu nome: ")); 
        seguradora.setIdade(Prompt.lerInteiro("Digite a sua idade:"));
        seguradora.setGrupo(Prompt.lerInteiro("Digite 1 se seu grupo de risico é Baixo, 2 se seu grupo de risico é Médio, 3 se seu grupo de risico é Alto:"));

        Prompt.imprimir("Nome: " + seguradora.getNome());
        Prompt.imprimir("Idade: " + seguradora.getIdade());
        Prompt.imprimir("Grupo de Risco: " + seguradora.grupoRisco());
    }
}