import java.util.Scanner;

public class calc_juros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.println("Interest rate(in %): ");
        rate = scanner.nextDouble()/100;
        System.out.println("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.println("Number of Years: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1+rate/timesCompounded, years);

        System.out.printf("The amount after %d years is: $%,.2f",years, amount);
    }
}
