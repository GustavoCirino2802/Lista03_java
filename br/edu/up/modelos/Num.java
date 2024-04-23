package br.edu.up.modelos;
import br.edu.up.Prompt;

public class Num {

    private Double[] num = new Double[80];
    private int contador =  0;

    public Num(Double[] num, Integer contador){
        this.contador = contador;
        this.num = num;
    }

    public int getcontador(){
        return contador;
    }

    private Integer calcQntdNum(){
        for (int i = 0; i < 80; i ++){
            num[i] = Prompt.lerDecimal("Digite o" + (i+1) + "número :");
            if(num[i]>=10 && num[i] <=150){
                contador++;
            }
        }
        return contador;
    }

    public Integer getcalcQntdNum(){
        return calcQntdNum();
    }

    
}
