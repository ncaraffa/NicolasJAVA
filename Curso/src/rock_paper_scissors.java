import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        boolean isPlaying = true;

        do {
            System.out.println("Enter you answer: (rock, paper, scissors)");

            playerChoice = scanner.nextLine();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("scissors") &&
                    !playerChoice.equals("paper")) {
                System.out.println("Invalid choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];

            System.out.println("Computer Choice: "+computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose...");
            }
            System.out.println("Play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

    }
}
