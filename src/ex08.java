import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um dia da semana:\n1 - Domingo\n2 - Segunda\n3 - Terça\n4 - Quarta\n5 - Quinta\n6 - Sexta\n7 - Sabado\n\nR: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Tenha um bom domingo.");
                break;
            case 2:
                System.out.print("Tenha uma boa Segunda-feira.");
                break;
            case 3:
                System.out.print("Tenha uma boa Terça-feira.");
                break;
            case 4:
                System.out.print("Tenha uma boa Quarta-feira.");
                break;
            case 5:
                System.out.print("Tenha uma boa Quinta-feira.");
                break;
            case 6:
                System.out.print("Tenha uma boa Sexta-feira.");
                break;
            case 7:
                System.out.print("Tenha um boa Sábado.");
                break;
            default:
                System.out.print("Dia invalido.");

        }


    }
}
