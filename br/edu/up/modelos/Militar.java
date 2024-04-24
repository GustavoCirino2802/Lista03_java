package br.edu.up.modelos;

import br.edu.up.Prompt;

public class Militar {

    private Integer idade;
    private Character saude;

    public Militar(Integer idade, Character saude){
        this.idade = idade;
        this.saude = saude;
    }

    public Militar(Integer idade){
        this.idade = idade;
    }

    public Militar(){

    }

    private String calcApto(){
        if (idade >= 18 && saude == 'S') {
            Prompt.imprimir("Você esta apto a cumprir o serviço militar obrigatório!");
        }
        else {
            Prompt.imprimir("Você não esta apto a cimprir o serviço militar obrigatório.");
        }
        return calcApto();
    }

    public String getcalcApto(){
        return calcApto();
    }





}
