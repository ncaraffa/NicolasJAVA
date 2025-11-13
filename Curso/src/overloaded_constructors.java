import java.util.InputMismatchException;
import java.util.Scanner;

public class overloaded_constructors {
    public static void main(String[] args) {

        // overloaded constructors = Permite à uma classe ter vários construtores
        //                           Com listas de parâmetros diferentes
        //                           Permite que objetos sejam iniciados de diferentes maneiras


        Scanner scanner = new Scanner(System.in);
        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "patrick@gmai.com");
        User user3 = new User("Sandy", "sandy@gmail.com", 27);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

        /*System.out.println("Digite seu nome de usuário:");
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

        System.out.printf("Seus dados são: %s, %s, %d", user.username, user.email, user.age);*/

    }
}
