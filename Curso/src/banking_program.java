import java.util.Scanner;

public class banking_program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("**********");
            System.out.println("Welcome to the Banking Program");
            System.out.println("**********");
            System.out.println("What shall we do?:\n 1. Show Balance\n 2. Deposit\n 3. Withdraw\n 4. DON'T CLICK ON ME!🐈‍⬛ 5. Exit");
            choice = scanner.nextInt();
            System.out.println("**********");
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance += deposit();
                case 3 -> balance = balance -= withdraw(balance);
                case 4 -> System.out.println("TE AMO NATHALLY, MEU AMORZINHO LINDO❤️❤️❤️");
                case 5 -> isRunning = false;
                default -> System.out.println("Invalid choice!");
            }
        }
        System.out.println("Thank you, see you soon!");
        System.out.println("**********");
    }
    static void showBalance(double balance) {
        System.out.printf("Your balance is: $%.2f\n", balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else {
            System.out.println("Succesfully deposited!💸");
        }
        return amount;
    }
    static double withdraw(double balance) {
        double withdraw;
        System.out.print("Enter the amount you want to withdraw?: ");
        withdraw = scanner.nextDouble();
        if (withdraw > balance) {
            System.out.println("Insufficient funds!");
            return 0;
        } else if (withdraw < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else {
            System.out.println("Succesfully withdrawn!");
        }
        return withdraw;
    }
}