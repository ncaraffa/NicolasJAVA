import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        String[] questions = {"When was the first world cup?",
                "Who was the F1 champion in 2009?",
                "What was the first programing language?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?"};

        String[][] options = {{"1. 1930", "2. 1929", "3. 1950", "4. 1945"},
                {"1. Lewis Hamilton", "2. Fernando Alonso", "3. Jenson Button", "4. Cristiano Ronaldo"},
                {"1. Python", "2.Assembly", "3. C++", "4. Java"},
                {"1. Processor", "2. Motherboard", "3. GPU", "4. RAM"},
                {"1. 2001", "2. 2003", "3. 2002", "4. 2004"}};

        int[] answers = {1, 3, 2, 1, 4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA quiz game!");
        System.out.println("******************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }
            else {
                System.out.println("********");
                System.out.println("Wrong!");
                System.out.println("********");
            }
        }

        System.out.println("Your final score is: " +score+ " out of " +questions.length);

    }
}
