import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 24) {
            System.out.println("Grupo de risco: Baixo.");
        } else if (idade > 20 && idade <= 40) {
            System.out.println("Grupo de risco: Médio.");
        } else if (idade > 40 && idade <= 70) {
            System.out.println("Grupo de risco: Alto.");
        } else {
            System.out.println("Impossível realizar seguro.");
        }
    }
}