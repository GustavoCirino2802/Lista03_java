package br.edu.up.modelos;

public class Concessionaria {

    private Double custoFab;
    private Double impostos = 0.45;
    private Double distribuidor = 0.28;

    public Concessionaria(Double custoFab, Double impostos, Double distribuidor){
        this.custoFab = custoFab;
        this.impostos = impostos;
        this.distribuidor = distribuidor; 
    }

    public Double getcustoFab(){
        return custoFab;
    }

    public Double getimpostos(){
        return impostos;
    }

    public Double getdistribuidor(){
        return distribuidor;
    }

    private Double calcCarroNovo(){
        double calcCarroNovo = 0;
        calcCarroNovo = (custoFab + (custoFab * impostos));  
        calcCarroNovo = (calcCarroNovo + (calcCarroNovo * distribuidor));
        return calcCarroNovo;    
    }

    public Double getcalcCarroNovo(){
        return calcCarroNovo();
    }
        

}
