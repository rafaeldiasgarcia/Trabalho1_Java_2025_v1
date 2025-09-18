import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor final da compra?\nR$");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100.0) {
            double valorFinal = valorCompra - (valorCompra * 0.1);
            System.out.printf("\nDesconto de 10%% aplicado. Valor final de R$%.2f", valorFinal);
        } else {
            double valorFinal = valorCompra;
            System.out.printf("\nValor final de R$%.2f", valorFinal);
        }
    }
}
