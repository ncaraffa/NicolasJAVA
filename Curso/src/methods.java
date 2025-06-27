import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        // method = um bloco de código reusavel que é executado quando chamado ()

        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();
        System.out.println("How old are you turning?");
        age = scanner.nextInt();

        happyBirthday(name, age);
    }
    static void happyBirthday(String name, int age) {

        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy birthday to you!");
    }
}
