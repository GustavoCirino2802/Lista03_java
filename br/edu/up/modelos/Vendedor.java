package br.edu.up.modelos;

public class Vendedor {

    private String nome;
    private Double salarioFixo;
    private Double tltVendas;

    public Vendedor(String nome, Double salarioFixo, Double tltVendas){
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.tltVendas = tltVendas;
    }

    public String getnome(){
        return nome;
    }

    public Double getsalarioFixo(){
        return salarioFixo;
    }
   
    public Double gettltVendas(){
        return tltVendas;
    }

    private Double salarioFinal(){
        double salarioFinal = 0;
        salarioFinal = salarioFixo + (tltVendas * 0.15);
        return salarioFinal;
    }

    public Double getsalarioFinal(){
        return salarioFinal();
    }
}
