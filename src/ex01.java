import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println(("Escreva sua altura:"));
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é: %.2f", imc);
    }
}
