package br.edu.up.modelos;

public class Estudante {
    private Double[] nota = new Double[3];

    public Double[] getNota() {
        return nota;
    }

    public void setNota(Double[] nota) {
        this.nota = nota;
    }
    
    public double calcularMedia(){
        return ((getNota()[0] * 2) + (getNota()[1] * 3) + (getNota()[2] * 5)) / (2 + 3 + 5);
    }
}