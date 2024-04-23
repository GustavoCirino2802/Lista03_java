package br.edu.up.modelos;

public class Margem {
    private Double precoCusto;
    private Double margemPercetual;

    public Margem(Double precoCusto, Double margemPercetual){
        this.precoCusto = precoCusto;
        this.margemPercetual = margemPercetual;
    }

    public Double getprecoCusto(){
        return precoCusto;
    }

    public Double getmargem(){
        return margemPercetual;
    }

    private Double calcVlrVenda(){
        double calcVlrVenda = 0;
        calcVlrVenda = precoCusto + (precoCusto * (margemPercetual / 100.0 ));
        return calcVlrVenda;
    }

    public Double getcalcVlrVenda(){
        return calcVlrVenda();
    }
}
