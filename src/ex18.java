import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cargos = {101, 102, 103};
        double[] percentuais = {0.1, 0.2, 0.3};

        System.out.print("Qual seu cargo?\nR: ");
        int cargo = sc.nextInt();

        System.out.print("Escreva seu salario: R$");
        double salario = sc.nextDouble();

        double aumento = 0;

        boolean cargoValido = false;


        for (int i = 0; i < cargos.length; i++) {
            if (cargos[i] == cargo) {
                aumento = salario * percentuais[i];
                cargoValido = true;
                break;
            }
        }

        if (!cargoValido) {
            aumento = salario * 0.4;
        }

        double novoSalario = salario + aumento;
        double diferenca = novoSalario - salario;

        System.out.println("Salário antigo: R$ " + salario);
        System.out.println("Novo salário: R$ " + novoSalario);
        System.out.println("Diferença: R$ " + diferenca);

    }
}
