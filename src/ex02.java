import java.util.Scanner;
import java.lang.Math;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Escreva sua altura:");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.0) {
            System.out.printf("IMC = %.2f - Você está muito magro.", imc);
        } else if (imc > 40.0) {
            System.out.printf("IMC = %.2f - Obesidade Grave.", imc);
        } else {
            System.out.printf("IMC = %.2f - IMC dentro da média.", imc);
        }
    }
}
