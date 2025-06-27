import java.util.Scanner;

public class method_userAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("What's your age?: ");
        age = scanner.nextInt();

        if (ageCheck(age)) {
            System.out.println("You're an adult");
        }
        else {
            System.out.println("You're not an adult");
        }
    }
    static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
