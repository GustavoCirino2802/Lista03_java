import modelos.Vendedor;

public class Exercicio3 {

    public static void executar(){

    String nome = Prompt.lerLinha("Qual o nome do Funcionário: ");
    Double salarioFixo = Prompt.lerDecimal("Qual o salário fixo do " + nome + " :");
    Double tltVendas = Prompt.lerDecimal("Qual foi o total de vendas do: " + nome);

    Vendedor vendedor = new Vendedor(nome, salarioFixo, tltVendas);

    Prompt.separador();
    Prompt.imprimir("O Nome do vendedor é: " + vendedor.getnome());
    Prompt.imprimir("O Salário fixo do " + vendedor.getnome() + " é: " + vendedor.getsalarioFixo());
    Prompt.imprimir("O Salário final do " + vendedor.getnome() +  " é: " + vendedor.getsalarioFinal());
    Prompt.separador();
    }
}
