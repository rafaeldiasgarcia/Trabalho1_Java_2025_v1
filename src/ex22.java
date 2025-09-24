import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um número inteiro: ");
        int n = sc.nextInt();

        if (n % 2 == 0 && n > 0) {
            System.out.println("Número par! Sua raiz quadrada é: " + Math.sqrt(n));
        } else {
            System.out.println("Número invalido para cauculo.");
        }
    }
}
