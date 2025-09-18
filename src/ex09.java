import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sua idade?\nR:");
        int idade = sc.nextInt();

        System.out.print("Qual sua altura?\nR:");
        double altura = sc.nextDouble();

        if (idade >= 12 && altura >= 1.40) {
            System.out.println("Pode entrar no brinquedo.");
        } else {
            System.out.println("Aceso não eprmitido.");
        }

    }
}
