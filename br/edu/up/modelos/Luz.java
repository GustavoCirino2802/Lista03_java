package br.edu.up.modelos;

public class Luz {
    private int cliente;
    private double consLuz;
    public double valorKWh;
    
    public int getcliente() {
        return cliente;
    }
    public void setTipoCliente(int cliente) {
        this.cliente = cliente;
    }
    public double getConsLuz() {
        return consLuz;
    }
    public void setConsumoLuz(double consLuz) {
        this.consLuz = consLuz;
    }

    public double calcularContaLuz(){
        switch (getcliente()) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
            default:
                break;
        }
        return getConsLuz() * valorKWh;
    }
}