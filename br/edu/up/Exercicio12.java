package br.edu.up;
import br.edu.up.modelos.Carro;

public class Exercicio12 { 
    public static void executar() {
        int contCarrosAte2000 = 0;
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {
            int ano = Prompt.lerInteiro("Digite o ano do carro: ");
            double preco = Prompt.lerDecimal("Digite o preço do carro: ");
            Carro carro = new Carro(ano, preco);
            double desconto = carro.calcularDesconto();
            double precoComDesconto = carro.calcularPrecoComDesconto();
            Prompt.imprimir("Desconto: " + desconto);
            Prompt.imprimir("Preço com desconto: " + precoComDesconto);
            if (ano <= 2000) {
                contCarrosAte2000++;
            }
            continuar = Prompt.lerLinha("Deseja continuar calculando desconto? (S) Sim, (N) Não: ");
            }
        Prompt.imprimir("Total de carros com ano até 2000: " + contCarrosAte2000);
        }
    }

