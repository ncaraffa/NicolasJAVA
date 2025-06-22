import java.util.Scanner;

public class while_loops {
    public static void main(String[] args) {

        // while loop = repetir um codigo pra sempre enquanto a condição for verdadeira

        Scanner scanner = new Scanner(System.in);

        String name = "";

        System.out.println("Enter your name: ");

        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello, "+name);
    }
}
