import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade > 16) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Criança.");
        }
    }
}
