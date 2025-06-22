import java.util.Scanner;

public class while_loops2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String res = "";

        while (!res.equals("Q")) {
            System.out.println("We'll continue playing until you press 'Q'");
            res = scanner.nextLine().toUpperCase();
        }
        System.out.println("Thank you for playing!");
    }
}
