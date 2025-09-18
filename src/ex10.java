import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true, mudarNumeros = true;
        double n1 = 0, n2 = 0;

        while (continuar) {
            if (mudarNumeros) {
                System.out.print("Primeiro número: ");
                while (!sc.hasNextDouble()) { // Verifica se a entrada é um double. O int ainda funciona.
                    System.out.println("Por favor, insira um número válido");
                    System.out.print("Primeiro número: ");
                }
                n1 = sc.nextDouble();

                System.out.print("Segundo número: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Por favor, insira um número válido");
                    System.out.print("Segundo número: ");
                }
                n2 = sc.nextDouble();
            }

            System.out.print(
                    "\n\nEscolha uma das opções: \n\n" +
                            "1 -> SOMA\n" +
                            "2 -> SUBTRAÇÃO\n" +
                            "3 -> MULTIPLICAÇÃO\n" +
                            "4 -> DIVISÃO\n" +
                            "\n5 -> TROCAR NÚMEROS ESCOLHIDOS\n" +
                            "0 -> SAIR\n\nR: "
            );
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nResultado da soma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("\nResultado da subtração: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("\nResultado da multiplicação: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("\nVocê não pode dividir por zero!");
                    } else {
                        System.out.println("\nResultado da divisão: " + (n1 / n2));
                    }
                    break;
                case 5:
                    continue;
                case 0:
                    System.out.println("\nAté mais :]\n...");
                    continuar = false;
                    continue; // Finaliza o loop, pulando a pergunta de trocar números.
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

            System.out.print("Você quer mudar os números escolhidos? (s/n): ");
            char resposta = Character.toLowerCase(sc.next().charAt(0));

            if (resposta == 's') {
                mudarNumeros = true;
            } else {
                mudarNumeros = false;
            }
        }
    }
}
