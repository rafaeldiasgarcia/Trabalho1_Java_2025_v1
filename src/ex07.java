import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Escreva o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Escreva o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("O número %d é o mair dentre os três.", n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("O número %d é o mair dentre os três.", n2);
        } else {
            System.out.printf("O número %d é o mair dentre os três.", n3);
        }
    }
}