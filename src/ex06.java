import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a priemria nota: ");
        double n1 = sc.nextInt();

        System.out.print("Escreva a priemria nota: ");
        double n2 = sc.nextInt();

        System.out.print("Escreva a priemria nota: ");
        double n3 = sc.nextInt();

        double media = (n1 + n2 + n3) / 3;

        if (media < 7.0 && media >= 5) {
            System.out.printf("RECUPERAÇÃO! Media: %.2f", media);
        } else if (media < 5) {
            System.out.printf("REPROVADO! Media: %.2f", media);
        } else {
            System.out.printf("APROVADO! Media: %.2f", media);
        }
    }
}
