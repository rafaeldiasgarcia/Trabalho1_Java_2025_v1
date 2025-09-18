import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = {1001, 1324, 6548, 1987, 7623};
        double[] precos = {5.32, 6.45, 2.37, 5.32, 6.45};

        System.out.print("Digite o código de produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        // Tentativa de usar Arrays.
        boolean encontrado = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                double total = precos[i] * quantidade;
                System.out.printf("Preço total: R$%.2f", total);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Código de produto invalido.");
        }
    }
}
