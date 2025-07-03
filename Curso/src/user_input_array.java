import java.util.Scanner;

public class user_input_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] countries = new String[3];

        for (int i = 0; i < countries.length; i++) {
            System.out.print("Enter 3 countries: ");
            countries[i] = scanner.nextLine();
        }
        for (String country : countries) {
            System.out.println("You chose: "+ country);
        }
    }
}
