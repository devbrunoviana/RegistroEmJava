import java.util.Scanner;

public class register_application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Bruno Luiz";
        String password = "12345";
        int pass = 4;

        while (true) {

            System.out.println("Coloque seu nome de usuário: ");
            String nameInput = sc.nextLine();

            System.out.println("Digite sua senha: ");
            String passwordInput = sc.nextLine();

            if (nameInput.equals(name) && (passwordInput.equals(password))) {
                System.out.println("Login efetuado com sucesso!");
                break;
            }
            else {
                System.out.println("ERROR, login/senha incorreto.");
                pass --;
                System.out.println("Você tem apenas " + pass + " chances.");
            }
            if (pass == 0) {
                System.out.println("Sua conta foi bloqueada.");
                break;
            }
        }
    }
}
f