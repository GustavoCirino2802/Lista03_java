package modelos;

public class ConsumoMedio {

    private Double distPerc;
    private Double combGasto;


    public ConsumoMedio (Double distPerc, Double combGasto) {
        this.distPerc = distPerc;
        this.combGasto = combGasto;
    }

    public Double getdistPerc(){
        return distPerc;
    }

    public Double getcombGasto(){
        return combGasto;

    }
    private Double CalcConsumoMedio(){
        double ConsumoMedio = 0;
        ConsumoMedio = distPerc / combGasto;
    
        return ConsumoMedio;
    }
    
    public Double getCalcConsumoMedio(){
        return CalcConsumoMedio();
    }
}

