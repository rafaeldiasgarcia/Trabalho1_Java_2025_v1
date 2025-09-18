import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Valor do lado B: ");
        double ladoB = sc.nextDouble();

        System.out.print("Valor do lado C: ");
        double ladoC = sc.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não é possível formar um triângulo.");
        }
    }
}