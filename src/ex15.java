import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 12 && idade > 0) {
            System.out.println("Criança.");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolecente.");
        } else if (idade > 17 && idade < 60) {
            System.out.println("Adulto.");
        } else if (idade > 60) {
            System.out.println("Idoso.");
        } else {
            System.out.println("Idade invalida.");
        }
    }
}
