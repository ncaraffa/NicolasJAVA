import java.util.Scanner;

public class Switch_Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char choice;

        System.out.println("Welcome to the calculator, choose a number: ");
        num1 = scanner.nextDouble();
        System.out.println("Choose the operation: ");
        choice = scanner.next().charAt(0);
        System.out.println("Choose another one: ");
        num2 = scanner.nextDouble();

        switch (choice) {
            case '+' -> System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1+num2);      //ASPAS SIMPLES POIS É UM CARACTÉR, NÃO UMA STRING!!!
            case '-' -> System.out.printf("%.1f - %.1f = %.1f", num1, num2, num1-num2);
            case 'x' -> System.out.printf("%.1f x %.1f = %.1f", num1, num2, num1*num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0");
                    System.exit(0);
                }
                else {
                    System.out.printf("%.1f : %.1f = %.1f", num1, num2, num1/num2);
                }
            }
            case '^' -> System.out.printf("%.1f ^ %.1f = %.1f", num1, num2, Math.pow(num1, num2));
            default -> System.out.println("Choose a valid operation.");
        }
    }
}
