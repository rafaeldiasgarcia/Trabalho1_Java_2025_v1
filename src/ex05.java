import java.util.Scanner;

public class ex05 {
    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Escreva o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais.");
        } else {
            System.out.println("Números diferentes.");
        }

    }
}
