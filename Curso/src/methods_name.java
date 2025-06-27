import java.util.Scanner;

public class methods_name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String surname;

        System.out.print("What's your name?: ");
        name = scanner.nextLine();
        System.out.print("What's you surname?: ");
        surname = scanner.nextLine();

        System.out.println(getFullname(name, surname));
    }
    static String getFullname(String name, String surname) {

        return name + " " + surname;

    }
}
