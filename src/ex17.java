import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculador de valor de venda ao consumidor!\n");

        System.out.print("Qual seu custo de produção?\nR: R$");
        double custoProducao = sc.nextDouble();

        double precoVenda = (1.28 * custoProducao) / 0.55;

        System.out.printf("Para ter um lucro de 28%% (após 45%% de imposto), venda por R$%.2f\n", precoVenda);
    }
}
