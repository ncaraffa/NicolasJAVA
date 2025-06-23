import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;
        int guess;
        int min = 1;
        int max = 100;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Pick a number between 1 - 100");
        guess = scanner.nextInt();

        int randomNumber = random.nextInt(min, max+1);

        while (guess != randomNumber) {
            if (guess < 1 || guess > 100) {
                System.out.println("Pick a number following the condition (1 - 100)");
                guess = scanner.nextInt();
            }
            else {
                attempts = attempts+1;

                if (guess > randomNumber) {
                    System.out.println("Too high, try again: ");
                    guess = scanner.nextInt();
                }
                else if (guess < randomNumber) {
                    System.out.println("Too low, try again");
                    guess = scanner.nextInt();
                }
            }
        }
        System.out.printf("Congratulations, you chose the correct number: %d! It took you %d attempts\n", guess, attempts);
    }
}
