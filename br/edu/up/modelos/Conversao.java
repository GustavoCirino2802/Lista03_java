package br.edu.up.modelos;

public class Conversao {

    private Double quantReal;
    private Double quantDolar;
    private Double cotacao; 

    public Conversao(Double quantReal, Double quantDolar, Double cotacao){
        this.quantReal = quantReal;
        this.quantDolar = quantDolar;
        this.cotacao  = cotacao;
    }

    public Double getquantReal(){
        return quantReal;
    }

    public Double getquantDolar(){
        return quantDolar;
    }

    public Double getcotacao(){
        return cotacao;
    }

    private Double calcQuantReal(){
        double calcQuantReal = 0;
        calcQuantReal = (quantDolar * cotacao);
        return calcQuantReal; 
    }
    
    public Double getcalcQuantReal(){
        return calcQuantReal();
    }

}
