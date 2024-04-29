package br.edu.up.modelos;

public class Peso {

    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calculo(){

        if (sexo == 'M' || sexo == 'm' && altura > 1.70 && idade <= 20){
            return (72.7 * altura) - 58;
        } else if(sexo == 'M' || sexo == 'm' && altura > 1.70 && idade >= 21 && idade <= 39 ){
            return (72.7 * altura) - 53;
        } else if (sexo == 'M' ||sexo == 'm' && altura > 1.70 && idade >= 40){
            return (72.7 * altura) - 45;
        } else if (sexo == 'M' ||sexo == 'm' && altura <= 1.70 && idade <= 40){
            return (72.7 * altura) - 50;
        } else if (sexo == 'M' ||sexo == 'm' && altura <= 1.70 && idade > 40){
            return (72.7 * altura) - 58;
        } else if (sexo == 'F' ||sexo == 'f' && altura > 1.50 && idade < 35){
            return (62.1 * altura) - 44.7;
        } else if (sexo == 'F' ||sexo == 'f' && altura <=  1.50 && idade >= 35){
            return (62.1 * altura) - 45;
        } else if (sexo == 'F' ||sexo == 'f' && altura <=  1.50 && idade < 35){
            return (62.1 * altura) - 49;
        } else {
            return 0;
        }
    }


    

}