import java.util.Scanner;

public class logical_operators2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String username;

        System.out.println("Type in the new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Invalid username");
        } else if (username.contains("_") || username.contains(" ")) {
            System.out.println("Invalid username");
        }
        else {
            System.out.println("New username: "+username);
        }
    }
}
