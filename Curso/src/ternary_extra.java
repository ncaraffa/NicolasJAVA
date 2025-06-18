import java.util.Scanner;

public class ternary_extra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hrs;

        System.out.println("What time is it?: ");
        hrs = scanner.nextDouble();
        String time = (hrs <= 12) ? "A.M." : "P.M.";
        System.out.printf("It's %,.2f%s", hrs, time);
    }
}
