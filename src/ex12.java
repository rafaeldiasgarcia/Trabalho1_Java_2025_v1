import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade do carro (km/h):\nR: ");
        int velocidade = sc.nextInt();

        if (velocidade > 80) {
           int multa = (velocidade - 80) * 5;

           System.out.println("Multa aplicada! valor a ser pago: R$" + multa);
        } else {
            System.out.println("Sem multa.");
        }
    }
}