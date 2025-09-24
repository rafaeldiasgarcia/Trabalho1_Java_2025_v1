import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Esclha um número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Esclha outro número inteiro: ");
        int n2 = sc.nextInt();

        if (n1 % 5 == 0 || n2 % 5 == 0) {
            System.out.println(Math.pow(n1, n2));
        } else {
            System.out.println("Nenhum múltiplo de 5 encontrado.");
        }
    }
}
