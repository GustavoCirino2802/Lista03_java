package br.edu.up.modelos;

public class MediaPonderada {

    private String nome;
    private int matricula; 
    private double nota1;
    private double nota2;
    private double nota3;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double mediaFinal(){
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String classFinal(){
        if (mediaFinal() > 8 && mediaFinal() <= 10){
            return "Classificação: A";
            
        } else if (mediaFinal() > 7 && mediaFinal() <= 8){
            return "Classificação: B";

        } else if (mediaFinal() > 6 && mediaFinal() <= 7){
            return "Classificação: C";

        } else if (mediaFinal() > 5 && mediaFinal() <= 6){
            return "Classificação: D";

        } else {
            return "Classificação: R";
        }
    }

}