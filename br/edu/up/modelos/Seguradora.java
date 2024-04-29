package br.edu.up.modelos;

public class Seguradora {

    private String nome;
    private int idade;
    private int grupo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getGrupo() {
        return grupo;
    }


    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }


    public String grupoRisco(){
        if (getIdade() >= 17 && getIdade() <= 20 && getGrupo() == 1){
            return "Risco Baixo";

        } else if (getIdade() >= 17 && getIdade() <= 20 && getGrupo() == 2){
            return "Risco Médio";

        } else if (getIdade() >= 17 && getIdade() <= 20 && getGrupo() == 3){
            return "Risco Alto";

        } else if (getIdade() >= 21 && getIdade() <= 24 && getGrupo() == 1){
            return "Risco Baixo";

        } else if (getIdade() >= 21 && getIdade() <= 24 && getGrupo() == 2){
            return "Risco Médio";

        } else if (getIdade() >= 21 && getIdade() <= 24 && getGrupo() == 3){
            return "Risco Alto";

        } else if (getIdade() >= 25 && getIdade() <= 34 && getGrupo() == 1){
            return "Risco Baixo";

        } else if (getIdade() >= 25 && getIdade() <= 34 && getGrupo() == 2){
            return "Risco Médio";

        } else if (getIdade() >= 25 && getIdade() <= 34 && getGrupo() == 3){
            return "Risco Alto";

        } else if (getIdade() >= 35 && getIdade() <= 64 && getGrupo() == 1){
            return "Risco Baixo";

        } else if (getIdade() >= 35 && getIdade() <= 64 && getGrupo() == 2){
            return "Risco Médio";

        } else if (getIdade() >= 35 && getIdade() <= 64 && getGrupo() == 3){
            return "Risco Alto";

        } else if (getIdade() >= 65 && getIdade() <= 70 && getGrupo() == 1){
            return "Risco Baixo";

        } else if (getIdade() >= 65 && getIdade() <= 70 && getGrupo() == 2){
            return "Risco Médio";

        } else if (getIdade() >= 65 && getIdade() <= 70 && getGrupo() == 3){
            return "Risco Alto";
    }
        else {
            return "Erro!";
        }
    
    }    
}