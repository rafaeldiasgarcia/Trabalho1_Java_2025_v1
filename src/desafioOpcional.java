import java.util.Scanner;
import java.lang.Math;

public class desafioOpcional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Escolha uma das opções: " +
                    "\n1 - Pedra" +
                    "\n2 - Papel" +
                    "\n3 - Tesoura" +
                    "\n\nR: ");
            int escolha = sc.nextInt();

            int nAleatorio = (int) (Math.random() * 3) + 1; // (int) transforma em int para poder usar o switch case.

            System.out.print("O sistema escolheu: ");
            switch (nAleatorio) {
                case 1:
                    System.out.println("PEDRA");
                    break;
                case 2:
                    System.out.println("PAPEL");
                    break;
                case 3:
                    System.out.println("TESOURA");
                    break;
            }

            if (escolha < 1 || escolha > 3) {
                System.out.println("\nEscolha inválida, tente novamente.\n");
                continue; // só pula para o proximo loop.
            }

            System.out.print("E você escolheu: ");
            switch (escolha) {
                case 1:
                    System.out.println("PEDRA");
                    break;
                case 2:
                    System.out.println("PAPEL");
                    break;
                case 3:
                    System.out.println("TESOURA");
                    break;
            }

            if (escolha == nAleatorio) {
                System.out.println("EMPATE!");
            } else if ((escolha == 1 && nAleatorio == 3) || (escolha == 2 && nAleatorio == 1) || (escolha == 3 && nAleatorio == 2)) {
                System.out.println("VOCÊ GANHOU!");
            } else {
                System.out.println("VOCÊ PERDEU!");
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            char resposta = sc.next().toLowerCase().charAt(0);

            if (resposta != 's') {
                continuar = false;
                System.out.println("Obrigado por jogar!");
            }
        }
    }
}
