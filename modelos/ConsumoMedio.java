package modelos;

public class ConsumoMedio {

    private Double distPerc;
    private Double combGasto;


    public ConsumoMedio (Double distPerc, Double combGasto) {
    this.distPerc = distPerc;
    this.combGasto = combGasto;
}

    private Double ConsumoMedio(){
        double ConsumoMedio = 0;
        ConsumoMedio = distPerc / combGasto;
    
        return ConsumoMedio;
    }
    
    public Double getConsumoMedio(){
        return ConsumoMedio();
    }
}

