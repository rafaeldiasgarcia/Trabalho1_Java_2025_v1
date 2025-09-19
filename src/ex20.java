import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quilos de peixe foram transportados?\nR: ");
        double kg = sc.nextDouble();

        double lucroBruto = kg * 2.0;
        double lucroLiquido;

        while (true) {
            System.out.print("\nEscolha a rota usada:\n1 -> Rota Costeira\n2 -> Rota Oceânica\n\nR: ");
            int rota = sc.nextInt();

            switch (rota) {
                case 1:
                    if (kg <= 1000) {
                        lucroLiquido = lucroBruto - 100.0;
                        System.out.printf("Lucro líquido: R$ %.2f\n", lucroLiquido);
                        return;
                    } else {
                        System.out.println("Capacidade da Rota Costeira excedida. (Máx: 1000 kg)");
                    }
                    break;

                case 2:
                    if (kg <= 2200) {
                        lucroLiquido = lucroBruto - 200.0 - 500.0;
                        System.out.printf("Lucro líquido: R$ %.2f\n", lucroLiquido);
                        return;
                    } else {
                        System.out.println("Capacidade da Rota Oceânica excedida. (Máx: 2200 kg)");
                    }
                    break;

                default:
                    System.out.println("Rota inválida. Por favor, escolha 1 ou 2.");
            }
        }
    }
}
