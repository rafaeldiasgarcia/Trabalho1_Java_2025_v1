import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "2435";

        System.out.print("Senha: ");
        String tentativaSenha = sc.nextLine();

        if (senha.equals(tentativaSenha)) {
            System.out.print("Acesso permitido.");
        } else {
            System.out.print("Acesso negado.");
        }
    }
}
