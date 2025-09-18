import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu salário?\nR: ");
        double salario = sc.nextDouble();

        if (salario > 2000.0 && salario <= 5000.0) {
            salario -= salario * 0.10;
            System.out.println("Salário final: " + salario);
        } else if (salario > 5000) {
            salario -= salario * 0.20;
            System.out.println("Salário final: " + salario);
        } else {
            System.out.println("Salário final: " + salario);
        }
    }
}
