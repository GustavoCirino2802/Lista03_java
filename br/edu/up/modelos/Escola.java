package br.edu.up.modelos;

public class Escola {
    private int nvl;
    private double horaAula;
    public double valor;

    public int getnvl() {
        return nvl;
    }

    public void setNivel(int nvl) {
        this.nvl = nvl;
    }

    public double getHoraAula() {
        return horaAula;
    }
    
    public void setHoraAula(double horaAula) {
        this.horaAula = horaAula;
    }
    
    public double calcularSalarioProfessor(){
        switch (getnvl()) {
            case 1:
                valor = 12;
                break;
            case 2:
                valor = 17;
                break;
            case 3:
                valor = 25;
                break;
            default:
                break;
        }
        return getHoraAula() * valor;
    }
}