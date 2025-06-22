import java.util.Scanner;

public class while_loops3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0 || age > 150) {
            System.out.print("Enter a valid age: ");
            age = scanner.nextInt();
        }
        System.out.printf("You are %d years old", age);
    }
}
