import java.util.InputMismatchException;
import java.util.Scanner;

public class overloaded_constructors {
    public static void main(String[] args) {

        // overloaded constructors = Permite à uma classe ter vários construtores
        //                           Com listas de parâmetros diferentes
        //                           Permite que objetos sejam iniciados de diferentes maneiras


        Scanner scanner = new Scanner(System.in);
        User user = new User("");

        System.out.println("Digite seu nome de usuário:");
        user.username = scanner.nextLine();
        while (user.username.isEmpty()) {
            System.out.println("Este campo é obrigatório!");
            user.username = scanner.nextLine();
        }
        System.out.println("Digite seu email:");
        user.email = scanner.nextLine();
        while (user.email.isEmpty()) {
            System.out.println("Este campo é obrigatório!");
            user.email = scanner.nextLine();
        }

        System.out.println("Digite sua idade: ");
        user.age = scanner.nextInt();

        System.out.printf("Seus dados são: %s, %s, %d", user.username, user.email, user.age);

    }
}
