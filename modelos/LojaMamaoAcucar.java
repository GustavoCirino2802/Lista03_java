package modelos;

public class LojaMamaoAcucar {

    private Integer prestacoes;
    private Double vlrCompra;

    public LojaMamaoAcucar(Integer prestacoes, Double vlrCompra){
        this.prestacoes = prestacoes;
        this.vlrCompra = vlrCompra;
    }

    public Integer getprestacoes(){
        return prestacoes;
    }

    public Double getvlrCompra(){
        return vlrCompra;
    }
    
    private Double calcPrestacoes(){
        double calcPrestacoes = 0;
        calcPrestacoes = vlrCompra / prestacoes;
        return calcPrestacoes; 
    }

    public Double getcalcPrestacoes(){
        return calcPrestacoes();
    }
}
